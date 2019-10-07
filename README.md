# CHECKPOINT 1

Le checkpoint est un moyen de t'autoévaluer, de te montrer de quoi tu es capable.

**Conseils :**

* ne reste pas bloqué, passe au point suivant, ou demande à ton formateur !
* la limite de temps existe, mais tu peux continuer à travailler plus tard si tu veux reprendre des choses à tête reposée
* terminé ou non, pense à tout commiter et pousser

## I. Récupération et initialisation du projet

### 1. Dépôt local

Récupère le contenu de ce dépôt en local.

Dans ton dépôt local, crée une branche ayant le format suivant : ton prénom et nom sans accents ni espaces, séparés par des tirets, avec le nom en majuscule. Exemple : pour **Éloïse Durant**, crée une branche **eloise-DURANT**.

**Passe sur cette branche pour la suite du *checkpoint* !**

> Conseil : ajoute et envoie tes modifications en local après chaque exercice, pour éviter les mauvaises surprises

### 2. .gitignore
Trouve et modifie le fichier *.gitignore* de la racine du projet, afin d'ignorer tous les fichiers dont l'extension est ".class".

Si jamais tu as versionné des fichiers ".class" avant d'avoir fait la modification du *.gitignore*, retire-les du dépôt.

## II. HTML/CSS

TODO

## III. Algorithmes

Tu trouveras un dossier `algos` dans la racine de ton dépôt local, tu pourras y réaliser les deux algorithmes suivants dans le fichier `Student.java` :

### 1. Majeur

L'école organise une soirée de fin d'année et tous les élèves majeurs sont invités. Afin d'éviter d'envoyer des invitations aux élèves mineurs, tu dois créer une méthode qui vérifie l'âge d'un élève et qui retourne s'il est majeur.

Crée une méthode statique nommée *hasLegalAge*, qui retourne vrai si l'âge passé en argument est supérieur ou égal à 18 et faux sinon.

### 2. Groupes

Tu dois répartir les élèves d'une classe en deux groupes. Chaque élève possède un numéro et tu veux utiliser cette donnée pour l'assigner à un groupe A ou B.

Crée une méthode statique nommée *getGroup*, qui reçoit le numéro d'un élève. S'il est pair, retourner le caractère A, sinon retourner le caractère B.

### 3. Groupes

L'école a besoin de compter de nombre de ses futurs étudiants souhaitant faire du Java. Pour cela elle a envoyé un sondage demandant le langage à étudier. Certains candidats ont écrit Java avec des minuscules et majuscules mal placées, ex : "JAVA" ou "java", au lieu de "Java".

Crée une méthode statique nommée *countStudents*, qui reçoit un tableau contenant les langages choisies par les candidats. Retourne le nombre de candidats ayant choisi le langage Java, sans tenir compte de la casse (majuscule/minuscule).

### 4. Tester

Pense à tester les méthodes que tu as développé. 

Pour compiler et exécuter la classe `StudentTest`, tu peux utiliser le script *tester.sh* présent dans le dossier `algos` de la façon suivante :

``` bash
./tester.sh
```

## IV. Quiz

Compile et exécute le fichier `Quiz.java` présent dans la racine du projet.

Réponds aux questions, cela va générer un fichier `quiz.txt`.

Tu peux ensuite éditer le fichier manuellement pour corriger tes réponses.

Merci de répondre honnêtement, sans t'aider d'Internet :)

## V. Finalisation

Envoie les modifications de ta branche locale et pousse ces modifications sur le dépôt distant.

Dans GitHub, vérifie que la branche existe et que tes modifications sont bien présentes.

Tu peux revenir dans Odyssey et partager le lien vers ta branche sur GitHub.
