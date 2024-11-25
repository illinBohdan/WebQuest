<%@ page import="java.util.Date" %>
<%@ page import="com.firstQuest.servlet.Registration" %>
<%@ page import="com.firstQuest.servlet.LogInChecking" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Ласкаво просимо!</title>
    <link rel="stylesheet" type="text/css" href="http://localhost:8080/Drieten/erste/static/index_style.css
">
</head>
<body>
<% LogInChecking login = (LogInChecking) request.getSession().getAttribute("login");
    Registration reg = (Registration) request.getSession().getAttribute("reg");
    String username = "Гість";
    if (reg == null) {
        if (login != null) {
            username = login.getUsername();
        }
    } else if (reg != null) {
        username = reg.getUsername();
    }
%>

<h1>Ласкаво просимо, <%=  username %>!</h1>

<p>Ви успішно зареєструвалися на нашому порталі пригод.</p>

<p><%= request.getSession().getId() %></p>
<p><%= new Date(request.getSession().getCreationTime()) %></p>
<p><%= new Date(request.getSession().getLastAccessedTime()) %></p>
<p><%= request.getSession().getMaxInactiveInterval() %></p>
<p><%= request.getSession().isNew() %></p>
<p><%= request.getSession().getAttributeNames() %></p>
<p><%= request.getRemoteAddr() %></p>
<p><%= request.getRemoteUser() %></p>
<h1>Games Played: <%= session.getAttribute("gamesPlayed") %></h1>

<form action="/Drieten/firstQuest" method="get">
    <button type="submit" name="step" value="reg_index">Повернутись на головну</button>
</form>
</body>
</html>
