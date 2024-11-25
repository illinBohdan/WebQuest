<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.firstQuest.servlet.LogInChecking" %>
<%@ page import="com.firstQuest.servlet.Registration" %>
<%@ page import="com.firstQuest.servlet.FirstQuestServlet" %>


<html>
<head>
    <link rel="stylesheet" type="text/css" href="erste/static/header_style.css">
</head>
<body>

<% LogInChecking login = (LogInChecking) request.getSession().getAttribute("login");
    Registration reg = (Registration) request.getSession().getAttribute("reg");
    String username = "Гість";
    if(reg == null){
        if(login != null) {
            username = login.getUsername();
        }
    }else if (reg != null) {
        username = reg.getUsername();
    }
    request.setAttribute("username", username);
%>

    <div class="topnav">
        <a href="/Drieten/firstQuest?action=reset">Вихід</a>
        <a href="/Drieten/firstQuest?step=reg_index">Головна</a>
        <a href="/Drieten/firstQuest?step=welcome"><%=username%></a>
        </a>
    </div>

</body>
</html>
