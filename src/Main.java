import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // initialisation du scanner
        Scanner scanner = new Scanner(System.in);
        // determination du nombre aleatoire
        double nbrerandom =Math.random();
        nbrerandom=nbrerandom*100;
        nbrerandom=nbrerandom+1;
        int nombreAleatoire=(int) nbrerandom;
        // parametre de la boucle
        int essaisRestants = 10;
        int tentative;
        boolean gagne = false;

        System.out.println("Bienvenue dans le jeu de devinettes !");
        System.out.println("Devinez un nombre entre 1 et 100.");
        System.out.println("Vous avez 10 essais.\n");

        while (essaisRestants > 0) {
            // valeur entree par l utilisateur
            System.out.print("Entrez votre nombre : ");
            tentative = scanner.nextInt();

            // verification et egalite
            if (tentative < nombreAleatoire) {
                System.out.println("Trop petit !");
            } else if (tentative > nombreAleatoire) {
                System.out.println("Trop grand !");
            } else {
                System.out.println("Bravo ! Vous avez trouvé le bon nombre !");
                gagne = true;
                break;
            }
            // decrementation du nombre d essai
            essaisRestants--;
        }
            // affichage du nombre aleatoire et message d echec
        if (!gagne) {
            System.out.println("Vous avez perdu !");
            System.out.println("Le nombre était : " + nombreAleatoire);
        }
    }
}