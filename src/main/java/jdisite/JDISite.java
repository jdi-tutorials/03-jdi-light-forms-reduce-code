package jdisite;

import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.UI;
import com.epam.jdi.light.ui.html.common.Button;
import com.epam.jdi.light.ui.html.common.Link;
import com.epam.jdi.light.ui.html.common.Text;
import com.epam.jdi.light.ui.html.complex.Menu;
import jdisite.entities.User;
import jdisite.pages.ContactPage;
import jdisite.pages.HomePage;
import jdisite.sections.LoginForm;
import jdisite.sections.LoginFormSmart;
import jdisite.sections.SeleniumLoginForm;

@JSite("https://jdi-testing.github.io/jdi-light/")
public class JDISite {
    public static HomePage homePage;
    public static ContactPage contactPage;

    public static LoginForm loginForm;
    public static Form<User> userForm;
    public static LoginFormSmart loginFormSmart;
    public static SeleniumLoginForm seleniumloginForm;

    @UI("img#user-icon") public static Link userIcon;
    @UI("#user-name") public static Text userName;
    @UI(".fa-sign-out") public static Button logout;
    @UI(".sidebar-menu span") public static Menu sideMenu;

    // Smart

    public static void loginAs(User user) {
        userIcon.click();
        loginForm.loginAs(user);
    }
}
