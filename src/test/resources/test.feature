@Test
Feature: Kapeluh_tests

  @Test_001
  Scenario: Check_teaser_items_structure
    Given I am on the Start page
    When I open Catalogue page
    When I open DamskieShlyapki page
    Then I see Teaser Items structure photo, name, link, star rating, price, details