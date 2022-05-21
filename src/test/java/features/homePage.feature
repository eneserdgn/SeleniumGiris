@HomePage
Feature: Home Page

  @Banner
  Scenario: Check Banner
    Given Enes is home page
    Then should see Banner

  @Card @Check
  Scenario Outline: Check Card
    Given Enes is home page
    Then should see "<card1>" card
    Then should see "<card2>" card
    Then should see "<card3>" card
    Then should see "<card4>" card
    Then should see "<card5>" card
    Then should see "<card6>" card
    Examples:
      | card1    | card2 | card3   | card4   | card5        | card6 |
      | Elements | Forms | Windows | Widgets | Interactions | Book  |

  @Card @Click
  Scenario Outline: Click <card> Card
    Given Enes is home page
    When click "<card>" card
    Then should see "<pageName>" Page
    Examples:
      | card     | pageName |
      | Elements | Elements |
      | Forms    | Forms    |

