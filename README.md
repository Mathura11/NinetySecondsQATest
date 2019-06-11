# NinetySecondsQATest
QA automation test for Ninety Seconds


Software to be installed:
Pre-requisite:Since the testNg framework uses java language ,Java should be installed from website https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html.
Versions I used are as follows
JDK - 1.8.0_212
JRE - 1.8.0_212

IDE Used : Eclipse Java EE IDE for Web Developers.
Version: Oxygen.3a Release (4.7.3a)

Test folder is a eclipse workspace. Download or clone project to local directory .In eclipse launcher, point the workspace to Test folder and click ok.

1.Install TestNG in eclipse IDE using Help-->Eclipse Marketplace.Search Testng and click install
Make sure that the version of TestNG downloaded from the eclipse Marketplace is 6.14.3(org.testng_6.14.3.r201802240500.jar to be specific.)
2. I have installed the following jar files 
a.Selenium 3.141.59 jar
b.Poiji jar 1.19.1jar
c.log4j jar- 1.2.17 
d.log 4j api jar- 2.11.1
e.log4j core jar - 2.11.1
Note that all jars are present in the lib folder of the 90SecondsTest project and are also added to .classpath file.

2.Download chromedriver according to the version of google chrome that is used.(eg.if your chrome browser version is 74 download ChromeDriver 74.0.3729.6) .Add the file path to environment variables.

Steps I followed create the test:

1.Right Click on src folder and create automationTest folder containing TestScenarios that contain test cases,datamap to identify
data from excel and file for locators to identify the web elements.
2.In TestScenarios file ,code snippet is written using poiji utility to retrieve data from the excelsheet.
3.Set the chromedriver path in beforeMethod to trigger browser to run the automated tests.
4.Create DataMap file by mapping excel cell names to string variable.
5.Maintain the locators in seperate file.
6.Maintain a testdata file containing the test data for test scenarios.
7.Write the test scenarios with test steps.

Test Scenarios Explanation:
1.TestScenario 1 comprises the positive flow test case.All details of brand are entered and on submission ,confirmation message is displayed.
2.TestScenario 2 comprises the negative flow test case. Brand details are left blank and on clicking next button error message that highlights the missing fields is displayed.

Test Execution:
Right click on TestScenarios.java ,select Run As->TestNg test.A browser window should be opened executing the test steps .

Please refer to the mp4 video in this repository showing demo of the live execution.

