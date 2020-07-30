$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AppleBrandStore.feature");
formatter.feature({
  "name": "aaaa",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "1. User can buy MacBook Pro",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Useer already in AppleBrandStore page",
  "keyword": "Given "
});
formatter.match({
  "location": "AppleBrandStorePageStep.useer_already_in_AppleBrandStore_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Mac link",
  "keyword": "When "
});
formatter.match({
  "location": "AppleBrandStorePageStep.user_click_on_Mac_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on MacBook Pro link",
  "keyword": "And "
});
formatter.match({
  "location": "AppleBrandStorePageStep.user_click_on_MacBook_Pro_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User land on Apple MacBook Pro page",
  "keyword": "Then "
});
formatter.match({
  "location": "AppleBrandStorePageStep.user_land_on_Apple_MacBook_Pro_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});