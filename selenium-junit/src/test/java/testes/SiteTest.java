package testes;
import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
public class SiteTest {
    @Test
    public void testComparaSiteDoGoogle(){
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\j-vit\\Desktop\\chromedriver.exe");
    WebDriver navigator = new ChromeDriver();
    navigator.get("https://google.com.br");
    assertEquals("https://www.google.com.br/", navigator.getCurrentUrl());
    navigator.quit();
    }
    @Test
    public void testComparaTituloDaPaginaComString(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\j-vit\\Desktop\\chromedriver.exe");
        WebDriver navigator = new ChromeDriver();
        navigator.get("https://google.com.br");
        WebElement searchBar = navigator.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        searchBar.sendKeys("nodejs");
        searchBar.sendKeys(Keys.ENTER);
        assertEquals("nodejs - Pesquisa Google", navigator.getTitle());
        navigator.quit();
    }
    @Test
    public void testAcessaSiteEComparaElemento(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\j-vit\\Desktop\\chromedriver.exe");
        WebDriver navigator = new ChromeDriver();
        navigator.get("https://google.com.br");
        WebElement searchBar = navigator.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        searchBar.sendKeys("nodejs");
        searchBar.sendKeys(Keys.ENTER);
        assertTrue(navigator.getCurrentUrl().contains("search"));
    }


}
