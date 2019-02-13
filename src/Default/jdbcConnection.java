package Default;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.*;

public class jdbcConnection {

    public static void main(String[] args) throws SQLException {


        String host = "localhost";
        String port = "3306";

        Connection con= DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/sinans","root", "Semsur_1998?");

        Statement a=con.createStatement();
        ResultSet rs = a.executeQuery("select * from customers");

        while (rs.next()) {
//            System.out.println(rs.getString("username"));


//            System.out.println(rs.getInt("id"));
//            System.out.println(rs.getString("email"));
//            System.out.println(rs.getString("name"));

            System.setProperty("webdriver.chrome.driver", "/Users/sinanyavas/Documents/selenium_downloads/chromedriver");
            WebDriver driver = new ChromeDriver();

            driver.get("https://login.salesforce.com/?locale=uk");
            driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(rs.getString("name"));
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(rs.getString("email"));

            driver.quit();

        }

    }

}
