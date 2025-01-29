
🚀 Project Overview:

This project is a Web Automation Framework built using Java, Selenium, TestNG, and Gherkin. It is designed for automating web applications, ensuring robust testing, and implementing BDD (Behavior-Driven Development) with Gherkin.

🛠️ Technologies Used:

Java - Core programming language

Selenium WebDriver - For web automation

TestNG - Test execution and reporting

Cucumber (Gherkin) - BDD implementation

Maven - Build management

Extent Reports - Test reporting

📌 Key Features:

✅ Page Object Model (POM) for better maintainability
✅ BDD with Gherkin for clear test scenarios
✅ Parallel Execution support via TestNG
✅ Reusable Utility Methods for common actions
✅ Detailed Reports using Extent Reports

🔧 Setup Instructions:

1️⃣ Clone the Repository

git clone https://github.com/yourusername/web-automation-java.git
cd web-automation-java

2️⃣ Install Dependencies

mvn clean install

3️⃣ Run Tests

Run TestNG tests:

mvn test

Run Cucumber tests:

mvn test -Dcucumber.options="src/test/resources/features"

4️⃣ View Reports

After execution, open target/surefire-reports/index.html for TestNG reports.

For Cucumber reports, check target/cucumber-reports.

📝 Gherkin Feature:

Feature: Home Page
  Scenario: Verify that Home Page loads perfectly
    Given Open the URL
    Then Check that Web site logo loads perfectly
    And Check that all top navigation options load perfectly
    And Check that the home page slider section loads perfectly
    And Check that  "The RockSolid App" info section loads perfectly
    And Check that 'Connected Apps & Devices' section loads perfectly
    And Check that "Athletes" section loads perfectly
    And Check that "Coaches" section loads perfectly
    And Check that "What coaches and athletes say about Rock Solid" section loads perfectly
    And Check that "Latest Blog" section loads perfectly
    And Check that "Reach Out To Us" section loads perfectly
