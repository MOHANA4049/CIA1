


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CIA1_1 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	ChromeOptions co = new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
    	WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/dp/B0BY8JZ22K?ie=UTF8&ref_=tile1_OPCE3Lite&pf_rd_r=S5EQV3N10Q8DQ4F8GRYX&pf_rd_p=f9b21fd0-f4b0-4df8-8ed7-1a63a309f7ce&pd_rd_r=92dc3dfb-5330-4526-8123-2ec298750f3a&pd_rd_w=8tozG&pd_rd_wg=GzWLa&th=1");
        String title = driver.getTitle();
        String p_name = "OnePlus Nord CE 3 Lite 5G (Pastel Lime, 8GB RAM, 128GB Storage)";
        System.out.println(title);
        if(title.equals(p_name)) {
        	System.out.println("Title is matching");
        }
        else {
        	System.out.println("Title Mismatch");
        }
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        Thread.sleep(5000); 
        Boolean present = driver.findElement(By.xpath("//*[@id=\"attach-close_sideSheet-link\"]")).isDisplayed();
        System.out.println("item added to cart:" + present);
        driver.get("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@value=\"Delete\"]")).click();
        Thread.sleep(5000);
        String removeText = driver.findElement(By.xpath("//*[@id=\"sc-active-cart\"]/div/div[1]/div/h1")).getText();
        String text = "Your Amazon Cart is empty.";
        if(removeText.equals(text)) {
        	System.out.println("Product is removed");
        }
        driver.get("https://www.amazon.in/dp/B0BY8JZ22K?ie=UTF8&ref_=tile1_OPCE3Lite&pf_rd_r=S5EQV3N10Q8DQ4F8GRYX&pf_rd_p=f9b21fd0-f4b0-4df8-8ed7-1a63a309f7ce&pd_rd_r=92dc3dfb-5330-4526-8123-2ec298750f3a&pd_rd_w=8tozG&pd_rd_wg=GzWLa&th=1");
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        Thread.sleep(2000);
        driver.get("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"quantity_2\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[5]/div/div[1]/div[1]/div/form/div/div[3]/span/span/span/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("mohanarajendran37@gmail.com",Keys.ENTER);
  	  driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Saru@4049",Keys.ENTER);
 
       String sign = driver.getTitle();
      System.out.println(sign);
        String esign = "Amazon Sign In";
        if(sign.equals(esign)) {
        	System.out.println("Success");
        }
        else {
        	System.out.println("Failure");
        }
}}