
 @smoke
 Feature: user add proudact to wishlist

   Scenario:  verify that user add product to his wishlist
       When    user add product to wishlist
       Then    wishlist give user message of adding product

   Scenario:  verify that user add product to his wishlist and get Qty
       When    user add product to wishlist
       And     wishlist give user message of adding product
       And    Wait until Massage is disappeared
       And     user get the number of wishlist items after adding product
        Then  verify Qty greater than Zero

