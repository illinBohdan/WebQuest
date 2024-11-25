package com.firstQuest.servlet;

public class LogicDoGet {

    public String returnPage(String step) {

        return switch (step) {
            case "index" -> "/index.jsp";
            case "reg_index" -> "/erste/service/reg_index.jsp";
            case "welcome" -> "/erste/service/welcome.jsp";
            case "reg" -> "/erste/service/registration.jsp";
            case "enter" -> "/erste/service/enter.jsp";
            case "begin" -> "/erste/begin.jsp";
            case "left" -> "/erste/left.jsp";
            case "right" -> "/erste/right.jsp";
            case "open_door" -> "/erste/open_door.jsp";
            case "look_door" -> "/erste/look_door.jsp";
            case "look_scroll" -> "/erste/look_scroll.jsp";
            case "look_room" -> "/erste/look_room.jsp";
            case "check_furnitur" -> "/erste/check_furnitur.jsp";
            case "secret_door" -> "/erste/secret_door.jsp";
            case "deckrypt_symbol" -> "/erste/deckrypt_symbol.jsp";
            case "deckrypt_scrol" -> "/erste/deckrypt_scrol.jsp";
            case "look_mechanism" -> "/erste/look_mechanism.jsp";
            case "use_force" -> "/erste/use_force.jsp";
            case "use_instrument" -> "/erste/use_instrument.jsp";
            case "look_map" -> "/erste/look_map.jsp";
            default -> "/firstJSP/index.jsp";

        };
    }
}
