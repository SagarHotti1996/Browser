Navigate to the Tendable website.
Click on the "Contact Us" link.
Choose the "Marketing" option.
Fill out the form excluding the "Message" field.
Click the submit button.
Expected Result:
An error message should appear indicating that the "Message" field cannot be empty.

Actual Result:
No error message is displayed, and the form submission proceeds without indicating the missing "Message" field.

Environment:

Operating System: Windows 10
Browser: Google Chrome Version 99.0.9999.99
Device: Desktop
Attachments:
Screenshots capturing the issue (if applicable)

Severity:
High

Priority:
High

Additional Information:
This issue prevents users from receiving feedback about the missing "Message" field, leading to potential data submission errors and confusion. It is critical to address this issue promptly to ensure the proper functioning of the Contact Us form.




How to Run the Test Project:
Clone the repository to your local machine.
Open the solution file (TendableWebsiteTests.sln) in Visual Studio.
Build the solution to restore NuGet packages and compile the project.
Open the Test Explorer window in Visual Studio (Test > Test Explorer).
Run the desired tests from the Test Explorer window.
Description:
Strategy Employed for the Challenge:

For this challenge, I employed a systematic approach to ensure comprehensive test coverage while maintaining clarity and efficiency in the test implementation. Here's the strategy I followed:

Requirement Analysis: Carefully reviewed the provided requirements to understand the scope and objectives of the testing task.

Test Planning: Identified the key functionalities to be tested, including the accessibility of top-level menus, the presence and activity of the "Request a Demo" button, and the form submission behavior on the Contact Us page.

Test Design: Designed automated tests using Selenium WebDriver in C# with NUnit as the testing framework to validate the specified functionalities. Test scenarios were formulated based on the requirements, covering navigation, element verification, form filling, and error validation.

Implementation: Developed test scripts in C# using Visual Studio, leveraging Selenium WebDriver for web automation and NUnit for test assertions. The scripts were structured to handle setup and teardown activities, ensuring the integrity and repeatability of the test environment.

Execution and Verification: Executed the automated tests on the Tendable website to validate the expected behaviors. Test results were reviewed to confirm adherence to the requirements and identify any deviations or defects.

Bug Reporting: In case of test failures or discrepancies, drafted a detailed bug report outlining the observed issues, steps to reproduce, expected vs. actual results, and environmental context. This facilitated effective communication and resolution of identified defects.

By following this strategy, I aimed to deliver robust and reliable automated tests that verify the specified functionalities of the Tendable website, ensuring its quality and adherence to user expectations.






















