
@SearchProduct
Feature: search and place the order of product 
 
  Scenario Outline:: Serach Experience for product search in both homepage and offer page 
    Given user is on greencart landpage 
    When user searched with "<product>" and extract actual name of product
    Then User searched for same short name of "<product>" in offers page if product exist
  Examples:
  |product|
  |tom|
  |beet|