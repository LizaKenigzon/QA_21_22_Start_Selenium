import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWorks {

    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssLocators(){
        // by tag name
        WebElement e1 = wd.findElement(By.tagName("body"));
        WebElement e2 = wd.findElement(By.cssSelector("body"));

        WebElement e3 = wd.findElement(By.tagName("div"));
        WebElement e4 = wd.findElement(By.cssSelector("div"));

        WebElement e5 = wd.findElement(By.tagName("h1"));
        WebElement e6 = wd.findElement(By.cssSelector("h1"));

        List<WebElement> l1 = wd.findElements(By.tagName("a"));
        List<WebElement> l2 = wd.findElements(By.cssSelector("a"));

        WebElement e7 = wd.findElement(By.tagName("form"));
        WebElement e8 = wd.findElement(By.cssSelector("form"));

        WebElement e9 = wd.findElement(By.tagName("input"));
        WebElement e10 = wd.findElement(By.cssSelector("input"));

        WebElement e11 = wd.findElement(By.tagName("br"));
        WebElement e12 = wd.findElement(By.cssSelector("br"));

        WebElement e13 = wd.findElement(By.tagName("button"));
        WebElement e14 = wd.findElement(By.cssSelector("button"));

        // by class
        WebElement div_container1 = wd.findElement(By.className("container"));
        WebElement div_container2 = wd.findElement(By.cssSelector(".container"));

        WebElement div_navbar = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement div_navbar2 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));

        WebElement a_active1 = wd.findElement(By.className("active"));
        WebElement a_active2 = wd.findElement(By.cssSelector(".active"));

        WebElement div_login1 = wd.findElement(By.className("login_login__3EHKB"));
        WebElement div_login2 = wd.findElement(By.cssSelector(".login_login__3EHKB"));

        // by id
        WebElement root1 = wd.findElement(By.id("root"));
        WebElement root2 = wd.findElement(By.cssSelector("#root"));

        // by attribute
        WebElement input1 = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement input2 = wd.findElement(By.cssSelector("[href='/about']"));
        WebElement input3 = wd.findElement(By.cssSelector("[href='/login']"));

        WebElement input4 = wd.findElement(By.cssSelector("[aria-current='page']"));
        WebElement input5 = wd.findElement(By.cssSelector("[style='border: 1px solid black; background-color: black; color: white;']"));

        WebElement input6 = wd.findElement(By.cssSelector("[name='email']"));
        WebElement input7 = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement input8 = wd.findElement(By.cssSelector("[name='password']"));
        WebElement input9 = wd.findElement(By.cssSelector("[placeholder='Password']"));
        WebElement input10 = wd.findElement(By.cssSelector("[type='submit']"));
        WebElement input11 = wd.findElement(By.cssSelector("[name='login']"));
        WebElement input12 = wd.findElement(By.cssSelector("[name='registration']"));

    }
}
