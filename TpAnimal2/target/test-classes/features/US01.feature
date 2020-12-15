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
Feature: US_O1 Création animal
	En tant que membre de l association
	Je veux créer un animal
	afin de pouvoir d assurer un suivi de celui-ci dans notre système
 
  @tag1
  Scenario Outline: création d une instance animal
    Given la création d un nouvel animal
    When Quand l utilisateur valide la création
    Then Une instance de la classe animal est créée sans nom et sans pays

    Examples: 
      | nom  | pays | status  |
      | null |    null | Echec |
      | Bobby |  Français | succès    |
