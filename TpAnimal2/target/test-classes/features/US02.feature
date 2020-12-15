#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: US_02 Voyage animal
  En tant que membre de l association
  Je veux pouvoir modifier le pays de résidence de l animal
  Afin de maintenir à jour sa localisation

  @tag2
  Scenario Outline: Changer la localisation d un animal
    Given Le voyage vers un autre pays
    When Quand l utilisateur modifie le <pays> 
    Then le pays de l'animal est changé

    Examples: 
      | nom   | pays  | status  |
      | Bobby |France | succès |
      | Bobby | null  | Fail    |
