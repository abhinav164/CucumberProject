$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Featurefiles/Login.feature");
formatter.feature({
  "name": "To validate login functionality of facebook page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "    To validate login by using valid email and invalid password",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user has to enter facebook login using chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.user_has_to_enter_facebook_login_using_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to enter valid email and invalid password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.user_have_to_enter_valid_email_and_invalid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.user_have_to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to show invalid credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_have_to_show_invalid_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Featurefiles/frgtPassPojo.feature");
formatter.feature({
  "name": "",
  "description": "To validate forgotten password functionality of facebook page application",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": " To validate a forgotten password",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User have to Enter Facebook Through Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.user_have_to_Enter_Facebook_Through_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click forgotten password",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.user_have_to_click_forgotten_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter email or phone Number",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.user_have_to_enter_email_or_phone_Number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to click Search button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_have_to_click_Search_button()"
});
formatter.result({
  "status": "passed"
});
});