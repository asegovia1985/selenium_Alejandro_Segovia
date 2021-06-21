import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverPropertyInfo;
import java.util.List;

public class Practica9Ejercicio14 {
    /*Crear un metodo con un nombre seleccionar.
    Acceder a Netflix: https://www.netflix.com/uy/
    Mostrar los elementos h1 y h2 que hay en el sitio.
    Refrezcar la pagina.
    Mostrar el texto de los botones que se encuentran en la pagina
    Mostrar la cantidad de elementos div que contiene el sitio.
    Obtener y mostrar el titulo de la pagina.
    Mostrar la cantidad de elementos de tipo link*/

    @Test
    public void seleccionar(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://www.netflix.com/uy/";
        driver.get(url);

        List<WebElement> listah1 = driver.findElements(By.tagName("h1"));
        List<WebElement> listah2 = driver.findElements(By.tagName("h2"));

        for(WebElement lh1: listah1){
            System.out.println("elementos h1: " + lh1.getText());
        }

        for(WebElement lh2: listah2){
            System.out.println("elementos h2: " + lh2.getText());
        }

        driver.navigate().refresh();

        List<WebElement> listaBotones = driver.findElements(By.tagName("button"));

        for(WebElement lbtn: listaBotones){
            System.out.println("El texto del boton es: " + lbtn.getText());
        }

        List<WebElement> listaDiv = driver.findElements(By.tagName("div"));

        System.out.println("La cantidad de div que contiene el sitio es: " + listaDiv.size());

        String title = driver.getTitle();

        System.out.println("El titulo del sitio es: " + title);

        List<WebElement> listaLink = driver.findElements(By.tagName("a"));

        System.out.println("La cantidad de links en el sitio es: " + listaLink.size());

    }
}
