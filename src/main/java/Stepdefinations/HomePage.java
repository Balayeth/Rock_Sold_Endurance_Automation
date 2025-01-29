package Stepdefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_scouse.An;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.Scanner;

public class HomePage {
    private WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+"src/main/java/driver/chromedriver.exe");
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver=new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @After
    public void close(){
        driver.quit();
    }

    @Given("Open the URL")
    public void open_the_url(){
        driver.get("https://rsendurance.com/");

    }
    @Then("Check that Web site logo loads perfectly")
    public void check_that_Web_site_logo_loads_perfectly(){
        WebElement Logo=driver.findElement(By.xpath("(//img[@alt='Logo'])[1]"));
        SoftAssert logo=new SoftAssert();
        logo.assertTrue(Logo.isDisplayed(),"Logo is not displayed");
    }
    @And ("Check that all top navigation options load perfectly")
    public void  check_that_all_top_navigation_options_load_perfectly(){

        WebElement FindACoach=driver.findElement(By.xpath("(//a[@href='/find-coach'])[1]"));
        String actual_text1=FindACoach.getText();
        String expected_text1="Find a Coach";
        System.out.println(actual_text1);
        SoftAssert findacoach=new SoftAssert();
        findacoach.assertEquals(actual_text1,expected_text1,"Couldn't found the Find A Coach option");

        WebElement TrainingPlans=driver.findElement(By.xpath("(//a[@href='/training-plans'])[1]"));
        String actual_text2,expected_text2;
        actual_text2=TrainingPlans.getText();
        System.out.println(actual_text2);
        expected_text2="Training Plans";
        SoftAssert trainingplans=new SoftAssert();
        trainingplans.assertEquals(actual_text2,expected_text2,"Could not found the Training Plans option ");

        WebElement Subscription=driver.findElement(By.xpath("(//a[@href='/subscription?tab=coach'])[1]"));
        String actual_text3,expected_text3;
        actual_text3=Subscription.getText();
        System.out.println(actual_text3);
        expected_text3="Subscription";
        SoftAssert subscription=new SoftAssert();
        subscription.assertEquals(actual_text3,expected_text3,"Could not found the Subscriptions option");

        WebElement About=driver.findElement(By.xpath("(//a[@href='/about'])[1]"));
        String actual_text4,expected_text4;
        actual_text4=About.getText();
        System.out.println(actual_text4);
        expected_text4="About";
        SoftAssert about=new SoftAssert();
        about.assertEquals(actual_text4,expected_text4,"Could not found the About option");

        WebElement Media=driver.findElement(By.xpath("(//a[@href='/media'])[1]"));
        String actual_text5,expected_text5;
        actual_text5=Media.getText();
        System.out.println(actual_text5);
        expected_text5="Media";
        SoftAssert media=new SoftAssert();
        media.assertEquals(actual_text5,expected_text5,"Could not found the Media option");

        WebElement Blog=driver.findElement(By.xpath("(//a[@href='/blog'])[1]"));
        String actual_text6,expected_text6;
        actual_text6=Blog.getText();
        System.out.println(actual_text6);
        expected_text6="Blog";
        SoftAssert blog=new SoftAssert();
        blog.assertEquals(actual_text6,expected_text6,"Could not found the Blog option");
    }
    @And ("Check that the home page slider section loads perfectly")
    public void check_that_the_home_page_slider_section_loads_perfectly(){
        WebElement Slider=driver.findElement(By.xpath("//div[@dir='ltr']"));
        SoftAssert slider=new SoftAssert();
        slider.assertTrue(Slider.isDisplayed(),"Slider section is not displayed");
    }

    @And("Check that  {string} info section loads perfectly")
    public void check_that_info_section_loads_perfectly(String string) throws InterruptedException {
        WebElement TheRockSolidApp=driver.findElement(By.xpath("//h1[@class='sm:text-4xl text-3xl font-lexend font-bold text-[#0B071A] mb-4 capitalize']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",TheRockSolidApp);
        String actual_content,expected_content;
        actual_content=TheRockSolidApp.getText();
        expected_content="The RockSolid App";
        System.out.println(actual_content);
        SoftAssert therocksolidapp=new SoftAssert();
        therocksolidapp.assertEquals(actual_content,expected_content,"The RockSolid App section is not displayed");
        Thread.sleep(2000);
    }
    @And("Check that {string} section loads perfectly")
    public void check_that_section_loads_perfectly(String string) {
        //Check that 'Connected Apps & Devices' section loads perfectly
        WebElement ConnectedAppDevices=driver.findElement(By.xpath("//p[@class='sm:text-4xl text-3xl text-[#0B071A] font-bold capitalize text-center xl:mb-20 lg:mb-16 sm:mb-14 mb-10']"));
        String actual_result,expected_result;
        actual_result=ConnectedAppDevices.getText();
        System.out.println(actual_result);
        expected_result="Connected Apps & Devices";
        SoftAssert connectedapps=new SoftAssert();
        connectedapps.assertEquals(actual_result,expected_result,"Could not found the Connected Apps & Devices section");

        //Check that "Athletes" section loads perfectly
        WebElement Athletes=driver.findElement(By.xpath("(//p[@class='text-primary border-b border-primary sm:text-xl text-base'])[1]"));
        String actual_result2,expected_result2;
        actual_result2=Athletes.getText();
        System.out.println(actual_result2);
        expected_result2="Athletes";
        SoftAssert athletes=new SoftAssert();
        athletes.assertEquals(actual_result2,expected_result2,"Couldn't found the Athletes section");

        //Check that "Coaches" section loads perfectly
        WebElement Coaches=driver.findElement(By.xpath("(//p[@class='text-primary border-b border-primary sm:text-xl text-base'])[2]"));
        String actual_result3,expected_result3;
        actual_result3=Coaches.getText();
        System.out.println(actual_result3);
        expected_result3="Coaches";
        SoftAssert coaches=new SoftAssert();
        coaches.assertEquals(actual_result3,expected_result3,"Couldn't found the Coaches section");

        //Check that "What coaches and athletes say about Rock Solid" section loads perfectly
        WebElement Wh=driver.findElement(By.xpath("//h3[@class='xl:w-[644px] xs:w-[327px] text-center text-4xl font-bold capitaliaze']"));
        String actual_result4,expected_result4 ;
        actual_result4=Wh.getText();
        System.out.println(actual_result4);
        expected_result4="What coaches and athletes say about Rock Solid";
        SoftAssert wh=new SoftAssert();
        wh.assertEquals(actual_result4,expected_result4,"Couldn't found the What coaches and athletes say about Rock Solid section");

        //Check that "Latest Blog" section loads perfectly
        WebElement LatestBlog=driver.findElement(By.xpath("//h3[@class='text-black text-center text-4xl font-bold']"));
        String actual_result5,expected_result5 ;
        actual_result5=LatestBlog.getText();
        System.out.println(actual_result5);
        expected_result5="Latest Blog";
        SoftAssert LB=new SoftAssert();
        LB.assertEquals(actual_result5,expected_result5,"Couldn't found the Latest Blog section");

        //Check that "Reach Out To Us" section loads perfectly
        WebElement ROTS=driver.findElement(By.xpath("//h3[@class='font-lexend text-4xl text-center font-bold tracking-tighter sm:mb-9 mb-6']"));
        String actual_result6,expected_result6 ;
        actual_result6=ROTS.getText();
        System.out.println(actual_result6);
        expected_result6="Reach Out To Us";
        SoftAssert rots=new SoftAssert();
        rots.assertEquals(actual_result6,expected_result6,"Couldn't found the Reach Out To Us section");
    }
}
