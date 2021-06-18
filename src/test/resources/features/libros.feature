Feature: buy books from the store

  Scenario Outline: Buy
    Given that I enter the page
    When I select the book to buy and the desired quantity
      | quantity   | bookName   |
      | <quantity> | <bookName> |
    Then I proceed to fill out the form to finish the purchase
      | nameUser   | lastName   | company   | email   | telephone   | search_country   | address1   | address2   | city   | county_state   | postcode   | password   |
      | <nameUser> | <lastName> | <company> | <email> | <telephone> | <search_country> | <address1> | <address2> | <city> | <county_state> | <postcode> | <password> |
    And validate Thank you. Your order has been received.
    Examples:
      | nameUser | lastName | company     | email                   | telephone | search_country | address1     | address2     | city   | county_state | postcode | password            | quantity | bookName                  |
      | mijail   | avila    | Colsubsidio | mijailavila11@gmail.com | 12345678  | Colombia       | Calle11#1-45 | Apartamento3 | Bogota | Bogota       | 112233   | Alcira-Cortes123456 | 2        | Android Quick Start Guide |