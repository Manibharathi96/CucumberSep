#Author: your.email@your.domain.com

@Sanity
Feature:  Demo Telecom
Background:
  
    And user click on add tariff plan button

 Scenario: Add tariff plan flow validation by 1D dimensional List
   
    When user need to fill up the fields by 1D List
    |99|121|44|66|88|99|22|
   And user click on submit buttton
   Then user verify customer id is generated
@Smoke @Smoke
 Scenario: Add tariff plan flow validation by 1D dimensional Map
   
    When user need to fill up the fields by 1D Map
     |MR|99|
     |FLM|121|
     |FIM|44|
     |FSP|66|
     |LPMC|88|
     |IPMC|99|
     |SPMC|22|
   And user click on submit buttton
   Then user verify customer id is generated