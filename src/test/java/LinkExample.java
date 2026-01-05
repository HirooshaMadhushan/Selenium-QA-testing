import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.SocketOption;
import java.util.List;

public class LinkExample {
    WebDriver driver;
    @BeforeMethod
    public void OpenLinkTestPage(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/link.xhtml;jsessionid=node01o027enwfa10n2v7konrt5apc10974717.node0");
    }

    @Test
    public void LinkTest(){
//        //take me into dashboard
//        WebElement homeLink=driver.findElement(By.linkText("Go to Dashboard"));
//        homeLink.click();
//        driver.navigate().back();
//
//        //find my destination
//        WebElement wheretoGo=driver.findElement(By .partialLinkText("Find the URL"));
//        String path=wheretoGo.getAttribute("href");
//        System.out.println("This is the path:"+path);
//
//        //Am i broken link
//        WebElement brokenLink=driver.findElement(By .linkText("Broken?"));
//        brokenLink.click();
//
//        String title=driver.getTitle();
//        if(title.contains("404")){
//            System.out.println("This is brken Link");
//        }else {
//            System.out.println("Not Broken");
//        }
//        driver.navigate().back();
//
//        //Duplicate link
//        WebElement homeLink1=driver.findElement(By.linkText("Go to Dashboard"));
//        homeLink1.click();
//        driver.navigate().back();
//
//        //Count Page Links
//        List<WebElement> CountFullPageLinks=driver.findElements(By .tagName("a"));
//        int PageLinkCout=CountFullPageLinks.size();
//        System.out.println("Page Number Of Links:"+PageLinkCout);

        //Count Layout Links
        WebElement LayoutElement=driver.findElement(By .className("layout-main-content"));
        List<WebElement> CountLayoutLinks=LayoutElement.findElements(By .tagName("a"));
        int CountLayoutLinkss=CountLayoutLinks.size();
        System.out.println("LayoutNumber of links:"+ CountLayoutLinkss);
    }

}
