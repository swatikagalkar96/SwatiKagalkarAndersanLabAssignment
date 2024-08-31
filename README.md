Pre-requisite :  Install all selenium jars,TestNG jars,JDK,Eclipse
Programming Used : Java

STEPS TO BE FOLLOWED !
Step 1 : WebDriver driver;
•	Instantiating a driver object.

Step 2 : System.setProperty("webdriver.chrome.driver", "C:\\Users\\swati\\OneDrive\\Documents\\chromedriver.exe");
•	This statement is used to configure system properties that affect the behaviour of the webdriver.Allowing the testers to set properties like the browser driver executable path before initializing the WebDriver,ensuring proper communication between the test script and the browser.

Step 3 : WebDriver driver = new ChromeDriver();
•	WebDriver is an interface creating an object of driver.Driver has access to all methods of Chromedriver defined in webdriver interface.

Step 4 : driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
•	The above mentioned is implicit wait.It instructs the selenium webdriver to wait for a specified amount of time before throwing “NoSuchElementException”

Step 5 : driver.manage().window().maximize();
•	Used to maximize the window

Step 6 : driver.get("https://try.vikunja.io/register");
•	For hitting the desired URL

Step 7 : Hitting the URL there are 3 components: username,email id and password.
Possibility check 
	Negative Scenario : If username is entered with less than 3 characters.Then we get and error as “Invalid Data”
	Positive Scenario : If user is entered with greater than or equal to 3 characters then a new account would be created.
