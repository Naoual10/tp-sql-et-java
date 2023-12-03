import java.util.Scanner;


public class TestPile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une chaîne de caractères (terminée par #) : ");
        String chaine = scanner.nextLine();

        Pile pile = new Pile();

        // Empiler les caractères dans la pile
        for (int i = 0; i < chaine.length(); i++) {
            char caractere = chaine.charAt(i);

            // Vérifier si le caractère est #
            if (caractere == '#') {
                break; // Sortir de la boucle à la rencontre de #
            }

            pile.empiler(caractere);
        }

        // Dépiler et imprimer les caractères inversés
        System.out.print("Chaîne inversée : ");
        while (!pile.estVide()) {
            System.out.print(pile.depiler());
        }

        scanner.close();
    }
}
