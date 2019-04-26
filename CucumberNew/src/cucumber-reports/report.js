$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeleton/DemoWebShopRegister.feature");
formatter.feature({
  "name": "Register User",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Register User",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the DemoWebShop home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepdefinationWebApp.the_user_is_on_the_DemoWebShop_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters registration details",
  "keyword": "When "
});
formatter.match({
  "location": "StepdefinationWebApp.the_user_enters_registration_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is registered successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepdefinationWebApp.user_is_registered_successfully()"
});
formatter.result({
  "status": "passed"
});
});