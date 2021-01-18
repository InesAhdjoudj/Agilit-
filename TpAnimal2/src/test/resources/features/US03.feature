
@tag
Feature: US_O3 Lier un animal à une famille
  En tant que membre de l association
	Je veux lier un animal a une famille
	afin de pouvoir identifier facilement les informations sur sa famille


  Scenario Outline: Liaisaon famille animal
    Given Je souhaite lier un animal a une famille
    When Quand la famille adopte un <animal>
    Then L animal est ajouté à la liste d animaux de la famille 


    Examples: 
      | nomFamille  | adresse         | listeAnimaux   | animal | status  |
      | "AHDJOUDJ"  |"34 rue Truffaut"|                |"bobby" | Succes  |
      
      
   Scenario Outline: Liaisaon famille animal existant
    Given Je souhaite lier un animal existant a une famille
    When Quand la famille adopte un <animal>
    Then L animal n est pas ajoute  


    Examples: 
       | nomFamille  | adresse           | listeAnimaux   | animal | status  |
       | "AHDJOUDJ"  | "34 rue Truffaut" | bobby          |bobby   | Echec  |
