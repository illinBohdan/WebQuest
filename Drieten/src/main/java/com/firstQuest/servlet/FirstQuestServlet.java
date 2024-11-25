package com.firstQuest.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

//@WebServlet("/com.firstQuest.servlet")
@WebServlet("/firstQuest")
public class FirstQuestServlet extends HttpServlet {
    LogicDoGet logic = new LogicDoGet();
    Registration reg = new Registration();
    LogInChecking logInChecking = new LogInChecking();
    LogicDoPost logicDoPost = new LogicDoPost();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String step = request.getParameter("step");
        if (step == null)
            step = "index";
        request.getRequestDispatcher(logic.returnPage(step)).forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

/*
        Integer gamesPlayed = (Integer) session.getAttribute("gamesPlayed");
        if (gamesPlayed == null) {
            gamesPlayed = 5;
            session.setAttribute("gamesPlayed", gamesPlayed);
        }*/

        String action = request.getParameter("action");

        reg.readFileWithPasswordUndLogin();//заповнюємо HashMap логінами й паролями з файла

        logicDoPost.returnAction(action, request, response, session, reg, logInChecking);

    }
}
