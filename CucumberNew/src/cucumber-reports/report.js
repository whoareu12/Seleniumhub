$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeleton/TestMeApp.feature");
formatter.feature({
  "name": "Buying a product",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Buying a product",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is in login page entered admin credentials",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user added product",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user buyed a product",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});