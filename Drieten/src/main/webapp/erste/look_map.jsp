<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Шукати карту</title>

    <link rel="stylesheet" type="text/css" href="erste/static/look_map_style.css">
</head>
<body>
<jsp:include page="service/header.jsp" />
<h1>Шукати карту</h1>
<p>Ти вирішуєш шукати карту серед символів і малюнків на свитку. Однак, під час уважного огляду ти виявляєш, що багато
    символів пошкоджено або стерто часом. Карта виявляється неповною, і ти не можеш визначити точний маршрут до Каменя
    Життя.
</p>

<h2>Завершення квесту</h2>

<p>
    Ти намагаєшся скласти маршрут з наявних фрагментів, але втрачаєш орієнтацію у заплутаних коридорах замку. Після
    довгих пошуків ти усвідомлюєш, що опинився у тупику. Час витрачено, а Камінь Життя так і не знайдений. Ти розумієш,
    що ці пошуки не принесли успіху, і вирішуєш повернутися, щоб знайти інший спосіб досягти своєї мети. Можливо, тобі
    знадобиться нова інформація або інструменти для подальших пошуків.
</p>

<form action="/Drieten/firstQuest" method="get">
    <button type="submit" name="step" value="reg_index">Повернутись на головну</button>

</form>
</body>
</html>
