# Agilité  Groupe AHDJOUDJ-FIEVEZ
Projet d'agilité M2 SITN apprentissage  

Dans le tutoriel réalisé, il est question de procéder à une intégration agile du projet dejà en cours (partie Java, BlueJ et Junit réalisée). L'intégration agile consite à définir des User Stories et à les implémenter dans des tests fonctionnels grâce à l'outil Cucumber sur Eclipse.

## Cucumber, Eclipse et tests fonctionnels

Avant de rédiger les US, nous mettons d'abord en place l'environnement Cucumber. Pour cela, il suffit de télecharger le plug-in Cucumber-Eclipse en utilisant le menu Help → Install New Software et coller l'adresse suivante : https://cucumber.io/cucumber-eclipse//update-site. Cucumber-Eclipse qui va permettre d'écrire et d'exécuter les scénarios Cucumber directement dans Eclipse facilitant ainsi leur automatisation. Il suffira ensuite d'ajouter les dépendances nécessaires pour finaliser l'installation.



## Définition des US

### US-01: création d une instance animal  
  As a membre de l association  
  I want creer un animal  
  So that de pouvoir d assurer un suivi de celui-ci dans notre systeme.  
  
### US_02: Voyage animal
  As a que membre de l association  
  I want pouvoir modifier le pays de résidence de l animal  
  So that maintenir à jour sa localisation.  
  
### US_O3: Lier un animal à une famille  
  As a que membre de l association  
  I want lier un animal a une famille  
  So that de pouvoir identifier facilement les informations sur sa famille.  


## Critères d'acceptance   

### US-01: création d une instance animal  
S'assurer qu'un object de la classe animal est créé avec un nom et un pays Assurer que le nombre d'objets total à la fin d’ajouter correspondait au résultat attendu.

### US_02: Voyage animal
S'assurer qu'un animal puisse voyager, c'est à dire que sa variable pays est changé.

### US_O3: Lier un animal à une famille  
S'assurer qu'une famille puisse adopter un animal, ainsi l'animal est lié à sa famille.
