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
Feature: US05_FUSION Réduction des dégâts sur un personnage géant
	@tag1
  Scenario Outline: Réduire les dégâts que subit un géant
    Given On a un personnage de type geant
    When Quand le geant subit des <dommages>
    Then Je diminue ses points de vie en prenant en compte sa resistance et les <dommages>

    Examples: 
      | dommages | status  |
      | 10 | success |
