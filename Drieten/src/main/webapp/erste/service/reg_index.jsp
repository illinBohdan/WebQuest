<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.firstQuest.servlet.LogInChecking" %>
<%@ page import="com.firstQuest.servlet.Registration" %>
<%@ page import="com.firstQuest.servlet.FirstQuestServlet" %>


<html>
<head>
    <link rel="stylesheet" type="text/css" href="erste/static/index_style.css">
</head>
<body>

<div class="center-text">
    <h1>Вітаємо на порталі пригод!</h1>

    <p>Виберіть пригоду, яка Вам ближче до серця, і почніть свій шлях!</p>
    <jsp:include page="header.jsp" />
</div>

<div class="image-row">
    <div class="adventure-link">
        <a href="/Drieten/firstQuest?step=begin&action=playAgain">
             <img src="erste/images/first.jpg" width="200" height="150" class="clickable">
        </a>
        <h2>Загублений Камінь Життя: <br>Повернення Хранителя</h2>
    </div>

    <div class="adventure-link">
        <a href="/Drieten/firstQuest?step=begin">
            <img src="erste/images/second.jpg" width="200" height="150" class="clickable">
        </a>
        <h2>Цікава пригода</h2>
    </div>

    <div class="adventure-link">
        <a href="/Drieten/firstQuest?step=begin">
            <img src="erste/images/third.jpg" width="200" height="150" class="clickable">
        </a>
        <h2>Фантастична планета</h2>
    </div>

</div>

</body>
</html>
