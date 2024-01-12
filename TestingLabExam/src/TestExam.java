import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestExam {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Sanket\\chromedriver-win64\\chromedriver.exe");

		WebDriver d = new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		System.out.println(d.getCurrentUrl());

		d.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		System.out.println(d.getCurrentUrl());
		d.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("sanket");
		d.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("Gaikwad");
		d.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]")).sendKeys("1234567890");
		d.findElement(By.xpath("//input[@id='userName']")).sendKeys("sanket@gmail.com");
		d.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]")).sendKeys("pune");
		d.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]")).sendKeys("pune");
		d.findElement(By.xpath("//tbody/tr[9]/td[2]/input[1]")).sendKeys("maharatra");
		d.findElement(By.xpath("//tbody/tr[10]/td[2]/input[1]")).sendKeys("412211");

		Select dropDown = new Select(d.findElement(By.xpath("//tbody/tr[11]/td[2]/select[1]")));
		dropDown.selectByVisibleText("INDIA");

		d.findElement(By.xpath("//input[@id='email']")).sendKeys("sanket");
		d.findElement(By.xpath("//tbody/tr[14]/td[2]/input[1]")).sendKeys("sanket123");
		d.findElement(By.xpath("//tbody/tr[15]/td[2]/input[1]")).sendKeys("sanket123");
		d.findElement(By.xpath("//tbody/tr[17]/td[1]/input[1]")).click();
		System.out.println(d.getCurrentUrl());

		d.findElement(By.xpath("//a[contains(text(),'sign-in')]")).click();

//		d.switchTo().alert().dismiss();

		d.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("sanket");
		d.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("sanket123");
Thread.sleep(2000);
	 System.out.println(d.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).getAttribute("value"));
	System.out.println(d.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).getAttribute("value"));

		d.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();

//		

	}
}
