package com.firstQuest.servlet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogicDoGetTest {

    @Test
    public void testReturnPage() {
        LogicDoGet logicDoGet = new LogicDoGet();

        assertEquals("/index.jsp", logicDoGet.returnPage("index"));
        assertEquals("/erste/service/reg_index.jsp", logicDoGet.returnPage("reg_index"));
        assertEquals("/erste/service/welcome.jsp", logicDoGet.returnPage("welcome"));
        assertEquals("/erste/service/registration.jsp", logicDoGet.returnPage("reg"));
        assertEquals("/erste/service/enter.jsp", logicDoGet.returnPage("enter"));
        assertEquals("/erste/begin.jsp", logicDoGet.returnPage("begin"));
        assertEquals("/erste/left.jsp", logicDoGet.returnPage("left"));
        assertEquals("/erste/right.jsp", logicDoGet.returnPage("right"));
        assertEquals("/erste/open_door.jsp", logicDoGet.returnPage("open_door"));
        assertEquals("/erste/look_door.jsp", logicDoGet.returnPage("look_door"));
        assertEquals("/erste/look_scroll.jsp", logicDoGet.returnPage("look_scroll"));
        assertEquals("/erste/look_room.jsp", logicDoGet.returnPage("look_room"));
        assertEquals("/erste/check_furnitur.jsp", logicDoGet.returnPage("check_furnitur"));
        assertEquals("/erste/secret_door.jsp", logicDoGet.returnPage("secret_door"));
        assertEquals("/erste/deckrypt_symbol.jsp", logicDoGet.returnPage("deckrypt_symbol"));
        assertEquals("/erste/look_mechanism.jsp", logicDoGet.returnPage("look_mechanism"));
        assertEquals("/erste/use_force.jsp", logicDoGet.returnPage("use_force"));
        assertEquals("/erste/use_instrument.jsp", logicDoGet.returnPage("use_instrument"));
        assertEquals("/erste/look_map.jsp", logicDoGet.returnPage("look_map"));
        assertEquals("/firstJSP/index.jsp", logicDoGet.returnPage("unknown"));
    }
}


