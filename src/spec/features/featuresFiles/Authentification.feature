@login
Feature: Je souhaite vérifier la page de connexion
  ETQ utilisateur je souhaite vérifier la page de connexion

  @login-valide
  Scenario: Connexion avec des données valides
    Given je visite le site nopcommerce
    When je saisis l'adresse mail "admin@yourstore.com"
    And je saisis le mot de passe "admin"
    And je clique sur le bouton login
    Then je me redirige vers la page home "Dashboard"
