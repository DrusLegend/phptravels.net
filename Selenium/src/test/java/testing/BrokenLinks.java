package testing;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Iterator;
import java.net.MalformedURLException;

public class BrokenLinks {
		
		private static WebDriver driver = null;

	    public static void main(String[] args) {
	        
	        HttpURLConnection huc = null;
	        int respCode = 200;
	        
	        driver = new FirefoxDriver();	        
	        driver.manage().window().maximize();	        
	        driver.get("https://www.phptravels.net/");
	        
	        List<WebElement> links = driver.findElements(By.tagName("a"));
	        
	        Iterator<WebElement> it = links.iterator();
	        
	        System.out.println("Total links are " + links.size());
	        
	        while(it.hasNext()){
	            
	            String url = it.next().getAttribute("href");
	            
	            System.out.println(url);
	        
	            if(url == null || url.isEmpty()){
	            System.out.println("URL is either not configured for anchor tag or it is empty");
	                continue;
	            }
	            
	            if(!url.startsWith("https://www.phptravels.net/")){
	              System.out.println("URL belongs to another domain, skipping it.");
	                continue;
	            }
	            
	            try {
	                huc = (HttpURLConnection)(new URL(url).openConnection());
	                
	                huc.setRequestMethod("HEAD");
	                
	                huc.connect();
	                
	                respCode = huc.getResponseCode();
	                
	                if(respCode >= 400){
	                    System.out.println(url+" is a broken link");
	                }
	                else{
	                    System.out.println(url+" is a valid link");
	                }
	                    
	            } catch (MalformedURLException e) {
	                e.printStackTrace();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }	        
	        driver.quit();
	    }
	}