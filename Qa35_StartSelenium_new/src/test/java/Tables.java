import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Tables {
    WebDriver wd;

    @Test
    public void wschoolTables() {
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/html/html_tables.asp");


        // print count rows in table
        List<WebElement> listRows = wd.findElements(By.cssSelector("#customers tr"));
        List<WebElement> xListRows = wd.findElements(By.xpath("//*[@id='customers']//tr"));
        System.out.println("Count of rows " + xListRows.size());
        Assert.assertEquals(xListRows.size(),7);

        // print last rows
        WebElement lastRow = wd.findElement(By.cssSelector("#customers tr:last-child"));
        WebElement xLastRow = wd.findElement(By.xpath("//*[@id='customers']//tr[last()]"));
        System.out.println("Last rows: " + xLastRow.getText());

        // print count of columns   ===3
        List<WebElement> listColumns = wd.findElements(By.cssSelector("#customers th"));//#customers tr:first-child th
        List<WebElement> xListColumns = wd.findElements(By.xpath("//*[@id='customers']//th"));
        System.out.println("Count of columns " + xListColumns.size());
        Assert.assertEquals(xListColumns.size(),3);

        // print text Canada
        WebElement canada = wd.findElement(By.cssSelector("#customers tr:nth-child(6) td:last-child"));
        WebElement xCanada = wd.findElement(By.xpath("//*[@id='customers']//tr[6]/td[3]"));
        System.out.println("Text: " + xCanada.getText());
        Assert.assertEquals(xCanada.getText(),"Canada");

        wd.close();
        wd.quit();

    }
    @Test
    public void homeWorkTable(){
        wd = new ChromeDriver();
        wd.navigate().to("file:///C:/Users/user/Downloads/index%20(1).html");// url to index.html

        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        // print count rows in table
        List<WebElement> listRows = wd.findElements(By.cssSelector("#country-table tr"));
        List<WebElement> xListRows = wd.findElements(By.xpath("//*[@id='country-table']//tr"));
        List<WebElement> rows = wd.findElements(By.xpath("//tr")); // razbor
        List<WebElement> rows1 = wd.findElements(By.cssSelector("tr")); //css

        wd.findElement(By.xpath("table[@id='country-table']/tbody/tr")); /// == 4
        wd.findElement(By.cssSelector("table#country-table>tbody>tr"));

        wd.findElement(By.xpath("table[@id='country-table']//tr")); // == 4
        wd.findElement(By.cssSelector("table#country-table tr"));

        System.out.println("Count of rows = " +rows.size());
        Assert.assertEquals(rows.size(),4);

        // print last rows
        WebElement lastRows = wd.findElement(By.cssSelector("#country-table tr:last-child"));
        WebElement xLastRows = wd.findElement(By.xpath("//*[@id='country-table']//tr[last()]"));
        WebElement lastrow = wd.findElement(By.xpath("//tr[last()]")); //razbor
        wd.findElement(By.cssSelector("tr:last-child"));
        System.out.println("Last rows: " +lastrow.getText());
        Assert.assertEquals(lastrow.getText(),"Poland Chine Mexico");

        // print count of columns
        List<WebElement> listColumns = wd.findElements(By.cssSelector("#country-table tr:first-child td"));
        List<WebElement> xListColumns = wd.findElements(By.xpath("//*[@id='country-table']//tr[1]/td"));
        List<WebElement> listcol = wd.findElements(By.xpath("//tr[1]/td")); //razbor
        wd.findElement(By.cssSelector("tr:first-child>td"));
        System.out.println("Count of columns = " + listcol.size());
        Assert.assertEquals(listcol.size(),3);

        // print text Israel
        WebElement israel = wd.findElement(By.cssSelector("#country-table tr:nth-child(2) td:nth-child(2)"));
        WebElement xIsrael = wd.findElement(By.xpath("//*[@id='country-table']//tr[2]/td[2]"));
        WebElement is = wd.findElement(By.xpath("//tr[2]/td[2]")); // razbor
        wd.findElement(By.cssSelector("tr:nht-child(2):nht-child(2)"));
        System.out.println("Text: " + is.getText());
        Assert.assertEquals(is.getText(),"Israel");


        wd.close();
        wd.quit();

    }


}
