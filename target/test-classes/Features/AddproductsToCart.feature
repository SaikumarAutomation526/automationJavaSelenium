
@AddProductToCart
Feature: Add product to cart 
 
  

  @tag2
  Scenario Outline: add product to tag
   Given user is on greencart landpage 
   When user searched with "<product>" and extract actual name of product
   When  Add number of "<Kilograms>" want to add
   Then click on AddToCart button
   And click on Cart image and click on proceed to checkout
   Then Validate number of kilograms we are added 
   Then click on place Order
   And choose country and terms of condition button 
   Then Click on Proceed Button
   
    
   

    Examples: 
      | product| Kilograms | 
      | Tom    |     5     |
      | Cuc    |     7     | 
