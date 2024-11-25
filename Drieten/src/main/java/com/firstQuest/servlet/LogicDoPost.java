package com.firstQuest.servlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

public class LogicDoPost {

    public void returnAction(String action, HttpServletRequest request, HttpServletResponse response,
                             HttpSession session, Registration reg,LogInChecking logInChecking) throws IOException {

        switch (action) {
            case "reset" -> {

                session.invalidate();

                response.sendRedirect(request.getContextPath() + "/erste/service/index.jsp");
            }
            case "register"-> {
                String username = request.getParameter("username");
                String password = request.getParameter("password");

                if (logInChecking.checkingLogin(reg.loginPass, username)) { //перевіряємо чи є такий логін в базі
                    response.sendRedirect(request.getContextPath() + "/erste/service/repeat_login.jsp");
                } else {
                    reg.savePassUndLog(username, password);///Зберігаємо логін і пароль в файл
                    reg.getUsername();
                    session.setAttribute("reg", reg);//збереження об'єкта у сесію

                   response.sendRedirect(request.getContextPath() + "/erste/service/welcome.jsp");
                }
            }
            case "login" -> {
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                if (logInChecking.checkPasswordUndLogin(reg.loginPass, username, password)) { // перевіряємо на наявність логіна й пароля в файлі
                    logInChecking.getUsername();
                    session.setAttribute("login", logInChecking);
                    response.sendRedirect(request.getContextPath() + "/erste/service/welcome.jsp");
                } else {
                    response.sendRedirect(request.getContextPath() + "/erste/service/login_fail.jsp");
                }
            }
            case "playAgain" ->  {
                // Збільшити кількість зіграних ігор
                Integer gamesPlayed = (Integer) session.getAttribute("gamesPlayed");
                if (gamesPlayed != null) {
                    gamesPlayed += 1;
                    session.setAttribute("gamesPlayed", gamesPlayed);
                }else {
                    gamesPlayed = 1; // Значення за замовчуванням, якщо атрибут відсутній
                    session.setAttribute("gamesPlayed", gamesPlayed);
                }


            }
        }
    }
}
