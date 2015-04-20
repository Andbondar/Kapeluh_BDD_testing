@Test
Feature: Kapeluh_tests

  @Test_001
  Scenario: Check_teaser_items_structure
    Given I am on the Start page
    When I open Catalogue page
    When I open DamskieShlyapki page
    Then I see Teaser Items structure photo, name, link, star rating, price, details

  @Test_002
  Scenario Outline: Check_teaser_items_Structure_scenario_outline
    Given I am on the Start page
    When I open Catalogue page
    Then I see "<number>" links in the left panel
    When I click link number "<link_number>"
    Then DamskieShlyapki page is opened
    Then I see "<teaser_number>" teaser items on the opened page
    Examples:
      |number|link_number|teaser_number|
      |20    |15          |16           |
