$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/GoggleSearch.feature");
formatter.feature({
  "name": "Performance of goggle search as per requirement",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search \u0027Selenium Base questions for interview\u0027in goggle",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is already on goggle search",
  "keyword": "Given "
});
formatter.match({
  "location": "Gogglesearch.user_is_already_on_goggle_search()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User type \u0027selenium base questions for interview\u0027 on search field and enter",
  "keyword": "When "
});
formatter.match({
  "location": "Gogglesearch.user_type_on_search_field_and_enter(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User gets results with the title of \u0027selenium base questions for interview - Goggle Search \u0027",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Close the open browser",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "name": "Search \u003ctexttobesearch\u003e in goggle search",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is already on goggle search page",
  "keyword": "Given "
});
formatter.step({
  "name": "User types \u003ctyexttobesearch\u003e in search input field",
  "keyword": "When "
});
formatter.step({
  "name": "User will reached the search result page with the title \u003cexpectedtitile\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "Close the browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "texttobesearch",
        "expectedtitile"
      ]
    },
    {
      "cells": [
        "Selenium 2.0",
        "Selenium 2.0 - Goggle Search"
      ]
    },
    {
      "cells": [
        "Selenium 3.0",
        "Selenium 3.0 - Goggle Search"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search Selenium 2.0 in goggle search",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is already on goggle search page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User types \u003ctyexttobesearch\u003e in search input field",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User will reached the search result page with the title Selenium 2.0 - Goggle Search",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Search Selenium 3.0 in goggle search",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is already on goggle search page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User types \u003ctyexttobesearch\u003e in search input field",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User will reached the search result page with the title Selenium 3.0 - Goggle Search",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});