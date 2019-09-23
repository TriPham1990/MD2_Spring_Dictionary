<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Dictionary</title>
  </head>
  <body>
  <h1>Dictionary</h1>

  <form method="post" action="/menu_dictionary">
      <fieldset>
          <legend>Dictionary</legend>
          <br>
          <label>English :</label>
          <label><input type="text" name="english" placeholder="Enter the word"/></label>
          <label><button type="submit">Search</button></label>
      </fieldset>
  </form>
  </body>
</html>
