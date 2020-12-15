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
Feature: US_O3 Lier un animal à une famille
  En tant que membre de l association
	Je veux lier un animal à une famille
	afin de pouvoir identifier facilement les informations sur sa famille

  @tag1
  Scenario: Liaisaon Famille-animal
    Given Je souhaite lier un animal à une famille
    When Quand la famille adopte un <animal>
    Then L animal est ajouté à la liste d animaux de la famille 


    Examples: 
      | nomFamille  | adresse | listeAnimaux | status  |
      | AHDJOUDJ    | 34 rue Truffaut | Bobby| Succès  |
      | AHDJOUDJ    | 34 rue Truffaut |  null| Echèc   |
