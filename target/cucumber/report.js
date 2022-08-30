$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/reqs.feature");
formatter.feature({
  "name": "Reqs",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@reqs"
    }
  ]
});
formatter.scenario({
  "name": "Search on Careers",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@reqs"
    },
    {
      "name": "@reqs1"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open careers page",
  "keyword": "Given "
});
formatter.match({
  "location": "ReqsStepdefs.iOpenCareersPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for \"Principal Automation Engineer\"",
  "keyword": "When "
});
formatter.match({
  "location": "ReqsStepdefs.iSearchFor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that position city is \"San Francisco\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ReqsStepdefs.iVerifyThatPositionCityIs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});