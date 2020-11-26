package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class XPath {
   // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
       //     2- Add Element butonuna basin
//3- Delete butonu’nun gorunur oldugunu test edin
//4- Delete tusuna basin
//5- Delete butonunun gorunur olmadigini test edin//boyle bir yer olmadigi icin yazmaz
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu= driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (deleteButonu.isDisplayed()){
            System.out.println("Delete butonu gorundu testi PASS");
        } else {
            System.out.println("Delete butonu gorundu testi FAILED");
        }
        //4- Delete tusuna basin
        deleteButonu.click();

    }
}
