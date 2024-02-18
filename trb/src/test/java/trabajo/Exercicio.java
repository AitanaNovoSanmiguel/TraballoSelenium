package dev.selenium;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Exercicio {
    static ChromeDriver driver;

    public Exercicio(){

    }
    @BeforeAll
    public static void start(){
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://www.follasnovas.com/es/");
    }

    @Test
    public void prueba_Completar() throws Exception{
        WebElement textInput = driver.findElement(By.id("autocompleta"));
        textInput.sendKeys(new CharSequence[]{"La isla de las tormentas"});
        Thread.sleep(2000L);
    }

    @Test 
    public void prueba_click() throws Exception{
        WebElement textInput = driver.findElement(By.id("autocompleta"));
        textInput.sendKeys(new CharSequence[]{"La isla de las tormentas"});
        Thread.sleep(2000L);
        WebElement boton = driver.findElement(By.xpath("//*[@id=\"busqueda\"]/button"));
        boton.click();
    }

    @Test
    public void libro_cesta() throws Exception{
        WebElement textInput = driver.findElement(By.id("autocompleta"));
        textInput.sendKeys(new CharSequence[]{"La isla de las tormentas"});
        Thread.sleep(2000L);
        WebElement boton = driver.findElement(By.xpath("//*[@id=\"busqueda\"]/button"));
        boton.click();
        Thread.sleep(2000L);
        WebElement formulario = driver.findElement(By.id("href_dispo_675408"));
        formulario.click();
    }
    
    @Test
    public void findElement() throws Exception{
        throw new Error("Unresolved compilation problem: \n\tSyntax error, insert \";\" to complete Statement\n");
    }

    @Test
    public void Titlo(){
        WebElement message = driver.findElement(By.id("message"));
        System.out.println(message.getText());
    }

    @AfterAll
    public static void end(){
        try{
            Thread.sleep(4000L);
        } catch (InterrupedException var1){
            var1.printStrackTrace(); 
        }
        driver.quit();
    }
    
}
    
    

   


