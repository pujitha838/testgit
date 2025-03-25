package Sample.PY;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import java.util.List;

	public class Program2 {
	    public static void main(String[] args) {
	    	// to find matching text in the webtable
	        // Set up WebDriver
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Update path
	        WebDriver driver = new ChromeDriver();

	        // Open webpage with the table
	        driver.get("https://example.com"); // Replace with actual URL

	        // Target text to search in the table
	        String searchText = "TargetValue"; // Replace with actual text

	        // Find the table
	        WebElement table = driver.findElement(By.xpath("//table")); 

	        // Get all rows from the table
	        List<WebElement> rows = table.findElements(By.tagName("tr"));

	        boolean found = false;

	        // Iterate through rows
	        for (int rowIndex = 0; rowIndex < rows.size(); rowIndex++) {
	            // Get all columns in the current row
	            List<WebElement> columns = rows.get(rowIndex).findElements(By.tagName("td"));

	            for (int colIndex = 0; colIndex < columns.size(); colIndex++) {
	                String cellText = columns.get(colIndex).getText();

	                // Check if the cell contains the target text
	                if (cellText.equalsIgnoreCase(searchText)) {
	                    System.out.println("Text found at Row: " + (rowIndex + 1) + ", Column: " + (colIndex + 1));
	                    found = true;
	                    break; // Stop searching if found
	                }
	            }
	            if (found) break;
	        }

	        if (!found) {
	            System.out.println("Text not found in the table.");
	        }

	        // Close the browser
	        driver.quit();
	    }
	}


