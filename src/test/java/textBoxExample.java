import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class textBoxExample {
    WebDriver driver;
    @BeforeMethod
    public void OpenLinkTestPage(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/input.xhtml;jsessionid=node024jub2rakzru1fksep95t88no11066735.node0");
    }

    @Test
    public void textBoxTest(){
        //type your name
       WebElement name = driver.findElement(By.id("j_idt88:name"));name.sendKeys(("hirusha"));

       //append country to this city
       WebElement city= driver.findElement(By .id("j_idt88:j_idt91"));city.sendKeys("Sri Lanka");

       //verify check box is disable
        WebElement disable=driver.findElement(By .name("j_idt88:j_idt93"));disable.isEnabled();
        System.out.println("is text box is enabled:"+disable);

        //clear the type text
        WebElement clearText=driver.findElement(By .id("j_idt88:j_idt95"));
        clearText.clear();

        //retrive the typed text
        WebElement retrive=driver.findElement(By .id("j_idt88:j_idt97"));
        String value=retrive.getAttribute("value");
        System.out.println(value);

        //type email and tab confirm control moved to next element
        driver.findElement(By .id("j_idt88:j_idt99")).sendKeys("hiroosha@gmail.com"+ Keys.TAB+"next box");

    }
}
