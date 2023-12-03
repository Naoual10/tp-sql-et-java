import java.util.Scanner;

public class TestParenthese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un texte contenant des parenthèses (terminé par #) : ");
        String texte = scanner.nextLine();

        Pile pile = new Pile();

        // Parcourir le texte et gérer les parenthèses
        for (int i = 0; i < texte.length(); i++) {
            char caractere = texte.charAt(i);

            if (caractere == '#') {
                break; // Sortir de la boucle à la rencontre de #
            } else if (caractere == '(') {
                pile.empiler(caractere);
            } else if (caractere == ')') {
                if (!pile.estVide()) {
                    pile.depiler(); // Dépiler la parenthèse ouvrante correspondante
                } else {
                    System.out.println("Parenthèses mal équilibrées : Il y a plus de parenthèses fermantes que d'ouvrantes.");
                    scanner.close();
                    return;
                }
            }
        }

        // Vérifier si la pile est vide à la fin
        if (pile.estVide()) {
            System.out.println("Les parenthèses sont bien équilibrées.");
        } else {
            System.out.println("Parenthèses mal équilibrées : Il y a plus de parenthèses ouvrantes que de fermantes.");
        }

        scanner.close();
    }
}
