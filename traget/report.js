$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/Tariff.feature");
formatter.feature({
  "name": "Demo Telecom",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user click on add tariff plan button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.user_click_on_add_customer_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add tariff plan flow validation by 1D dimensional List",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "user need to fill up the fields by 1D List",
  "rows": [
    {
      "cells": [
        "99",
        "121",
        "44",
        "66",
        "88",
        "99",
        "22"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerSteps.user_need_to_fill_up_the_fields_by_D_List(Integer,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on submit buttton",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.user_click_on_submit_buttton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify customer id is generated",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerSteps.user_verify_customer_id_is_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user click on add tariff plan button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.user_click_on_add_customer_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add tariff plan flow validation by 1D dimensional Map",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    },
    {
      "name": "@Smoke"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "user need to fill up the fields by 1D Map",
  "rows": [
    {
      "cells": [
        "MR",
        "99"
      ]
    },
    {
      "cells": [
        "FLM",
        "121"
      ]
    },
    {
      "cells": [
        "FIM",
        "44"
      ]
    },
    {
      "cells": [
        "FSP",
        "66"
      ]
    },
    {
      "cells": [
        "LPMC",
        "88"
      ]
    },
    {
      "cells": [
        "IPMC",
        "99"
      ]
    },
    {
      "cells": [
        "SPMC",
        "22"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerSteps.user_need_to_fill_up_the_fields_by_D_Map(Integer,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on submit buttton",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.user_click_on_submit_buttton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify customer id is generated",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerSteps.user_verify_customer_id_is_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "status": "passed"
});
});