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
Feature: US04_FUSION Création d un personnage animal

  Scenario Outline: Creation d une instance personnage animal
    Given On donne un <nom> et un <pays>
    When Quand l utilisateur souhaite créer un personnage animal
    Then Une instance de la classe personnage animal est creee avec le <nom>

    Examples: 
      | nom   |  pays |
      | "Bobby" | "France"|
      | "" | "France"|
