
@tag
Feature: US_02 Voyage animal
  As a que membre de l association
  I want pouvoir modifier le pays de résidence de l animal
  So that maintenir à jour sa localisation


  Scenario Outline: Changer la localisation d un animal
    Given Le <pays> vers lequel voyage l animal 
    When Quand le voyage vers <pays> est valide 
    Then le <pays> de l animal est change

    Examples: 
      | nom   | pays     | status  |
      | "Bobby" |"France"| succès  |
 