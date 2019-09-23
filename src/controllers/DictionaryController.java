package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class DictionaryController {
    @GetMapping("/")
    public String dictionary(){
        return "show_menu_dictionary";
    }

    @PostMapping("/menu_dictionary")
    public String search(@RequestParam String english, ModelMap model){
        english = english.toLowerCase();

        model.put("hello", "xin chào");
        model.put("ok", "đồng ý");
        model.put("goodbye", "tạm biệt");
        model.put("love", "yêu");
        model.put("engineer", "kĩ sư");
        model.put("summer", "mùa hè");

        String vietnamese = (String)model.get(english);

        if(vietnamese == null){
            vietnamese = "not found";
            model.addAttribute("english", english);
            model.addAttribute("vietnamese", vietnamese);
        } else {
            model.addAttribute("english", english);
            model.addAttribute("vietnamese", vietnamese);
        }

        return "dictionary";
    }
}
