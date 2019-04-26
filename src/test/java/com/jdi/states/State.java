package com.jdi.states;

import static jdisite.JDISite.*;

public class State {
    public static void loggedOut() {
        if (userName.isDisplayed()) {
            if (logout.isHidden())
                userIcon.click();
            logout.click();
        }
    }
}
