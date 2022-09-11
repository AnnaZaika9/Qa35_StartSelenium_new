import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Tables {
    WebDriver wd;

    @Test
    public void wschoolTables() {
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/html/html_tables.asp");


        // print count rows in table
        List<WebElement> listRows = wd.findElements(By.cssSelector("#customers tr"));
        System.out.println("Count of rows " + listRows.size());
        Assert.assertEquals(listRows.size(),7);

        // print last rows
        WebElement lastRow = wd.findElement(By.cssSelector("#customers tr:last-child"));
        System.out.println(lastRow.getText());

        // print count of columns   ===3

        //#customers tr:first-child th
        List<WebElement> listColumns = wd.findElements(By.cssSelector("#customers th"));
        System.out.println("Count of columns " + listColumns.size());
        Assert.assertEquals(listColumns.size(),3);

        // print text Canada

        WebElement canada = wd.findElement(By.cssSelector("#customers tr:nth-child(6) td:last-child"));
        System.out.println(canada.getText());
        Assert.assertEquals(canada.getText(),"Canada");



    }
    @Test
    public void homeWorkTable(){
        wd=new ChromeDriver();
        wd.navigate().to("");// url to index.html


        // print count rows in table
        // print last rows
        // print count of columns
        // print text Israel
    }


}
