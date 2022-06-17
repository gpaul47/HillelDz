import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class QAA {

    public static void main(String[] args) {

//        filmDirector(); //Cw29
//        filmYear(); //Dz30
//        filmTitle(); //Dz31
        filmArray(); //Dz32
    }

    public static void filmDirector() {

        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost/index.html");

        String expectedDirector = "Tim Burton"; //Director

        WebElement movieSearch = driver.findElement(By.id("film_name"));
        WebElement searchBtn = driver.findElement(By.id("get_api_res_btn"));

        movieSearch.sendKeys("Batman");
        searchBtn.click();

        WebElement directorName = new WebDriverWait(driver, Duration.ofSeconds(9))
                .until(elementToBeClickable(By.id("api_director")));

        System.out.println("Name: " + directorName.getText().substring(10));
        Assert.assertEquals(directorName.getText().substring(10), expectedDirector);
    }

    static void filmYear() { //Dz30

        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost/index.html");

        String expectedYear = " 1989"; // Year

        WebElement movieSearch = driver.findElement(By.id("film_name"));
        WebElement searchBtn = driver.findElement(By.id("get_api_res_btn"));

        movieSearch.sendKeys("Batman");
        searchBtn.click();

        WebElement apiYear = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(elementToBeClickable(By.id("api_year")));

        System.out.println("Year: " + apiYear.getText().substring(5));
        Assert.assertEquals(apiYear.getText().substring(5), expectedYear);

    }

    static void filmTitle() { //Dz31

        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost/index.html");

        String expectedTitle = " Batman"; // Title

        WebElement movieSearch = driver.findElement(By.id("film_name"));
        WebElement searchBtn = driver.findElement(By.id("get_api_res_btn"));

        movieSearch.sendKeys("Batman");
        searchBtn.click();

        WebElement apiTitle = new WebDriverWait(driver, Duration.ofSeconds(11))
                .until(elementToBeClickable(By.id("api_title")));

        System.out.println("Title: " + apiTitle.getText().substring(6));
        Assert.assertEquals(apiTitle.getText().substring(6), expectedTitle);

    }

    static void filmArray() { //Dz32

        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost/index.html");

        WebElement movieSearch = driver.findElement(By.id("film_name"));
        WebElement searchBtn = driver.findElement(By.id("get_api_res_btn"));

        movieSearch.sendKeys(" taxi");
        searchBtn.click();

        WebElement apiTitle = new WebDriverWait(driver, Duration.ofSeconds(11))
                .until(elementToBeClickable(By.id("api_title")));
        WebElement apiYear = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(elementToBeClickable(By.id("api_year")));
        WebElement directorName = new WebDriverWait(driver, Duration.ofSeconds(9))
                .until(elementToBeClickable(By.id("api_director")));

        boolean emptyFields = false;
        String[] filmsInfoValue = new String[]{apiTitle.getText(), apiYear.getText(), directorName.getText()};

        for (int i = 0; i < 3; i++) {
            if (filmsInfoValue[i] == "undefined") {
                emptyFields = true;
            }
        }
        Assert.assertEquals(emptyFields, false);
    }
}
