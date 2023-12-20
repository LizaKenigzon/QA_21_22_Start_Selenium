import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Collections;
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
        WebElement xEl1 = wd.findElement((By.xpath("//body")));

        WebElement e3 = wd.findElement(By.tagName("div"));
        WebElement e4 = wd.findElement(By.cssSelector("div"));
        WebElement xEl2 = wd.findElement((By.xpath("//div")));

        WebElement e5 = wd.findElement(By.tagName("h1"));
        WebElement e6 = wd.findElement(By.cssSelector("h1"));
        WebElement xEl3 = wd.findElement(By.xpath("//h1"));

        List<WebElement> l1 = wd.findElements(By.tagName("a"));
        List<WebElement> l2 = wd.findElements(By.cssSelector("a"));
        List<WebElement> xEl4 = wd.findElements(By.xpath("//a"));

        WebElement e7 = wd.findElement(By.tagName("form"));
        WebElement e8 = wd.findElement(By.cssSelector("form"));
        WebElement xEl5 = wd.findElement(By.xpath("//form"));

        WebElement e9 = wd.findElement(By.tagName("input"));
        WebElement e10 = wd.findElement(By.cssSelector("input"));
        WebElement xEl6 = wd.findElement(By.xpath("//input"));

        WebElement e11 = wd.findElement(By.tagName("br"));
        WebElement e12 = wd.findElement(By.cssSelector("br"));
        WebElement xEl7 = wd.findElement(By.xpath("//br"));

        WebElement e13 = wd.findElement(By.tagName("button"));
        WebElement e14 = wd.findElement(By.cssSelector("button"));
        WebElement xEl8 = wd.findElement(By.xpath("//button"));
        //WebElement xEl = wd.findElement(By.xpath("/html/body/div/div/div/form/button"));

        // by class
        WebElement div_container1 = wd.findElement(By.className("container"));
        WebElement div_container2 = wd.findElement(By.cssSelector(".container"));
        WebElement xEl9 = wd.findElement((By.xpath("//*[@class='container']")));

        WebElement div_navbar = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement div_navbar2 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement xEl10 = wd.findElement((By.xpath("//*[@class='navbar-component_nav__1X_4m']")));

        WebElement a_active1 = wd.findElement(By.className("active"));
        WebElement a_active2 = wd.findElement(By.cssSelector(".active"));
        WebElement xEl11 = wd.findElement(By.xpath("//*[@class='active']"));

        WebElement div_login1 = wd.findElement(By.className("login_login__3EHKB"));
        WebElement div_login2 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement xEl12 = wd.findElement(By.xpath("//*[@class='login_login__3EHKB']"));

        // by id
        WebElement root1 = wd.findElement(By.id("root"));
        WebElement root2 = wd.findElement(By.cssSelector("#root"));
        WebElement xEl13 = wd.findElement(By.xpath("//*[@id='root']"));

        // by attribute
        WebElement input1 = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement xEl14 = wd.findElement(By.xpath("//a[@href='/home']"));
        WebElement input2 = wd.findElement(By.cssSelector("[href='/about']"));
        WebElement xEl15 = wd.findElement(By.xpath("//a[@href='/about']"));
        WebElement input3 = wd.findElement(By.cssSelector("[href='/login']"));
        WebElement xEl16 = wd.findElement(By.xpath("//a[@href='/login']"));

        WebElement input4 = wd.findElement(By.cssSelector("[aria-current='page']"));
        WebElement xEl17 = wd.findElement(By.xpath("//a[@aria-current='page']"));
        WebElement input5 = wd.findElement(By.cssSelector("[style='border: 1px solid black; background-color: black; color: white;']"));
        WebElement xEl18 = wd.findElement(By.xpath("//a[@style='border: 1px solid black; background-color: black; color: white;']"));

        WebElement input6 = wd.findElement(By.cssSelector("[name='email']"));
        WebElement xEl19 = wd.findElement(By.xpath("//input[@name='email']"));
        WebElement input7 = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement xEl20 = wd.findElement(By.xpath("//input[@placeholder='Email']"));
        WebElement input8 = wd.findElement(By.cssSelector("[name='password']"));
        WebElement xEl21 = wd.findElement(By.xpath("//input[@name='password']"));
        WebElement input9 = wd.findElement(By.cssSelector("[placeholder='Password']"));
        WebElement xEl22 = wd.findElement(By.xpath("//input[@placeholder='Password']"));

        WebElement input10 = wd.findElement(By.cssSelector("[type='submit']"));
        WebElement xEl23 = wd.findElement(By.xpath("//button[@type='submit']"));
        WebElement input11 = wd.findElement(By.cssSelector("[name='login']"));
        WebElement xEl24 = wd.findElement(By.xpath("//button[@name='login']"));
        WebElement input12 = wd.findElement(By.cssSelector("[name='registration']"));
        WebElement xEl25 = wd.findElement(By.xpath("//button[@name='registration']"));

        //One of the elements (by attribute) ==> start + end + contain
        WebElement el18 = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement xEl26 = wd.findElement(By.xpath("//input[@placeholder='Email']"));

        WebElement el19 = wd.findElement(By.cssSelector("[placeholder^='Em']"));
        WebElement xEl27 = wd.findElement(By.xpath("//input[starts-with(@placeholder,'Em')]"));

        WebElement el20 = wd.findElement(By.cssSelector("[placeholder$='il']"));
        WebElement xEl28 = wd.findElement(By.xpath("//input[contains(@placeholder,'il')]"));

        WebElement el21 = wd.findElement(By.cssSelector("[placeholder*='ma']"));
        WebElement xEl29 = wd.findElement(By.xpath("//input[contains(@placeholder,'ma')]"));
        WebElement xEl30 = wd.findElement(By.xpath("//a[3]"));
    }

    @Test
    public void classWork(){
        //parent
        WebElement el1 = wd.findElement(By.xpath("//h1/parent::*"));
        WebElement el2 = wd.findElement(By.xpath("//h1/parent::div"));
        WebElement el3 = wd.findElement(By.xpath("//h1/.."));
        //WebElement el = wd.findElement(By.xpath("//div/div//input/.."));

        //ancestors
        WebElement el4 = wd.findElement(By.xpath("//h1/ancestor::*")); //all(first)
        WebElement el5 = wd.findElement(By.xpath("//h1/ancestor::div")); //2 options of div
        WebElement el6 = wd.findElement(By.xpath("//h1/ancestor::div[1]")); //div with index

        //ancestors-or-self
        WebElement el7 = wd.findElement(By.xpath("//h1/ancestor-or-self::*")); //all+child
        List<WebElement> list = Collections.singletonList(wd.findElement(By.xpath("//h1/ancestor-or-self::*"))); //all in the list

        //following-sibling
        List<WebElement> list1 = wd.findElements(By.xpath("//h1/following-sibling::a")); //all in the list

        //preceding-sibling
        WebElement el8 = wd.findElement(By.xpath("//a[@href='/login']/preceding-sibling::h1"));
        List<WebElement> list2 = wd.findElements(By.xpath("//a[@href='/login']/preceding-sibling::a"));

    }

    @Test
    public void innerText(){
        WebElement element = wd.findElement(By.cssSelector("[name='login']"));
        String text = element.getText(); //get from innerText
        System.out.println(text);

        WebElement form = wd.findElement(By.xpath("//form"));
        String textForm = form.getText();
        System.out.println("*************");
        System.out.println(textForm);

        WebElement html = wd.findElement(By.tagName("html"));
        String textAll = html.getText();
        System.out.println("*************");
        System.out.println(textAll);
    }

    @AfterClass
    public void close(){
        wd.close();
    }

}
