package validation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class validate {

	@Test
	public void vali() throws Throwable {

		// Initialize the Chrome driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Navigate to the URL

		driver.get("https://testpages.herokuapp.com/styled/tag/dynamic-table.html");

		// Click on Table Data button

		WebElement tableDataButton = driver.findElement(By.xpath("//summary"));
		tableDataButton.click();
		// storing the json data into String variable

		String jsonData = "[{\"name\": \"Bob\", \"age\": 20, \"gender\": \"male\"},"

				+ "{\"name\": \"George\", \"age\": 42, \"gender\":\"male\"}, "

				+ "{\"name\": \"Sara\", \"age\": 42, \"gender\":\"female\"}, "

				+ "{\"name\": \"Conor\", \"age\": 40, \"gender\":\"male\"}, "

				+ "{\"name\": \"Jennifer\", \"age\": 42,\"gender\": \"female\"}]";

		Thread.sleep(2000);
		// clear the data from the text area
		WebElement inputTextBox = driver.findElement(By.xpath("//textarea"));

		inputTextBox.clear();
		// send the data from the text area
		inputTextBox.sendKeys(jsonData);
		// Allow some time for the table to be refreshed
		Thread.sleep(2000);
		// click on the refresh table button

		driver.findElement(By.xpath("//button[text()='Refresh Table']")).click();

		List<WebElement> cols = driver.findElements(By.xpath("//table//tr//td"));

		System.out.println(cols.size());
		for (int i = 0; i < cols.size(); i++) {

			System.out.println(cols.get(0).getText().equals("Bob") + " : " + cols.get(0).getText());

			int bobage = Integer.parseInt(cols.get(1).getText());
			System.out.println(bobage == 20);
			System.out.println(bobage);

			System.out.println(cols.get(2).getText().equals("male") + " : " + cols.get(2).getText());

			System.out.println(cols.get(3).getText().equals("George") + " : " + cols.get(3).getText());

			int Georgeage = Integer.parseInt(cols.get(4).getText());
			System.out.println(Georgeage == 42);
			System.out.println(Georgeage);

			System.out.println(cols.get(5).getText().equals("male") + " :" + cols.get(5).getText());

			System.out.println(cols.get(6).getText().equals("Sara") + " : " + cols.get(6).getText());

			int Saraage = Integer.parseInt(cols.get(7).getText());
			System.out.println(Saraage == 42);
			System.out.println(Saraage);

			System.out.println(cols.get(8).getText().equals("female") + " :  " + cols.get(8).getText());

			System.out.println(cols.get(9).getText().equals("Conor") + " : " + cols.get(9).getText());

			int Conorage = Integer.parseInt(cols.get(10).getText());
			System.out.println(Conorage == 40);
			System.out.println(Conorage);

			System.out.println(cols.get(11).getText().equals("male") + " : " + cols.get(11).getText());

			System.out.println(cols.get(12).getText().equals("Jennifer") + " : " + cols.get(12).getText());

			int Jenniferage = Integer.parseInt(cols.get(13).getText());
			System.out.println(Jenniferage == 42);
			System.out.println(Jenniferage);

			System.out.println(cols.get(14).getText().equals("female") + " : " + cols.get(14).getText());

			break;

		}

		System.out.println("Automation code sucessfully Executed......");

		driver.close();
	}

}
