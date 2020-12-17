$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resouces/featurefiles/login.feature");
formatter.feature({
  "line": 1,
  "name": "login Functionally",
  "description": "as a user want to login successfully",
  "id": "login-functionally",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8292492100,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": ": as user i want login Account Successfully",
  "description": "",
  "id": "login-functionally;:-as-user-i-want-login-account-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoke,"
    },
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "i am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "i enter user name \"Admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "i enter password \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "i click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "i should be able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 127386400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 19
    }
  ],
  "location": "LoginStepdefs.iEnterUserName(String)"
});
formatter.result({
  "duration": 142109500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 18
    }
  ],
  "location": "LoginStepdefs.iEnterPassword(String)"
});
formatter.result({
  "duration": 110719900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs.iClickOnLoginButton()"
});
formatter.result({
  "duration": 1705800600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs.iShouldBeAbleToLoginSuccessfully()"
});
formatter.result({
  "duration": 742491700,
  "error_message": "org.junit.ComparisonFailure: expected:\u003cWelcome [mahesh]\u003e but was:\u003cWelcome [Paul]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.demo.orangehrmlive.cucumber.stepdefs.LoginStepdefs.iShouldBeAbleToLoginSuccessfully(LoginStepdefs.java:35)\r\n\tat ✽.Then i should be able to login successfully(src/test/java/resouces/featurefiles/login.feature:9)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1059363100,
  "status": "passed"
});
formatter.before({
  "duration": 7006479600,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "as i user i want log out successfully",
  "description": "",
  "id": "login-functionally;as-i-user-i-want-log-out-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@sanity,"
    },
    {
      "line": 10,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "i am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "i enter user name \"Admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "i enter password \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "i click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "i click on welcome admin",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "i click on log out button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "i should be able to log out successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 20300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 19
    }
  ],
  "location": "LoginStepdefs.iEnterUserName(String)"
});
formatter.result({
  "duration": 107905700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 18
    }
  ],
  "location": "LoginStepdefs.iEnterPassword(String)"
});
formatter.result({
  "duration": 113354100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs.iClickOnLoginButton()"
});
formatter.result({
  "duration": 1700456100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs.iClickOnWelcomeAdmin()"
});
formatter.result({
  "duration": 863634200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs.iClickOnLogOutButton()"
});
formatter.result({
  "duration": 565974800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs.iShouldBeAbleToLogOutSuccessfully()"
});
formatter.result({
  "duration": 94067300,
  "status": "passed"
});
formatter.after({
  "duration": 710952100,
  "status": "passed"
});
});