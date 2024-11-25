<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Вхід</title>
    <link rel="stylesheet" type="text/css" href="erste/static/index_style.css">
</head>
<body>

<h1>Вхід</h1>

<form action="/Drieten/firstQuest" method="post">
    <label for="username">Ім'я користувача:</label>
    <input type="text" id="username" name="username" required><br>

    <label for="password">Пароль:</label>
    <input type="password" id="password" name="password" required><br>

    <button type="submit" name="action" value="login">Вхід</button>
</form>


<form action="/Drieten/firstQuest" method="get">
    <p>Ще не зареєстровані? <a href="/Drieten/firstQuest?step=reg">Реєстрація</a></p>
</form>

</body>
</html>
