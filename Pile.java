
public class Pile {
    static final int MAX=8;
    char t[];
     int top;

    // Constructeur
    public Pile() {
        t = new char[MAX];
        top = -1; // La pile est vide initialement
    }

    // Méthode pour vérifier si la pile est vide
    public boolean estVide() {
        return (top == -1);
    }

    // Méthode pour vérifier si la pile est pleine
    public boolean estPleine() {
        return (top == t.length - 1);
    }

    // Méthode pour empiler un caractère
    public void empiler(char c) {
        if (!estPleine()) {
            t[++top] = c;
            System.out.println("Element " + c + " empilé sur la pile.");
        } else {
            System.out.println("La pile est pleine. Impossible d'empiler.");
        }
    }

    // Méthode pour dépiler un caractère
    public char depiler() {
        if (!estVide()) {
            char elementDepile = t[top];
            top--;
            System.out.println("Element " + elementDepile + " dépilé de la pile.");
            return elementDepile;
        } else {
            System.out.println("La pile est vide. Impossible de dépiler.");
            return '\0'; // Valeur par défaut pour un char
        }
    }

    // Méthode pour obtenir le sommet de la pile sans le retirer
    public char sommet() {
        if (!estVide()) {
            return t[top];
        } else {
            System.out.println("La pile est vide. Aucun sommet à récupérer.");
            return '\0'; // Valeur par défaut pour un char
        }
    }

    // Méthode pour afficher le contenu de la pile
    public void afficherPile() {
        System.out.print("Contenu de la pile: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(t[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Pile maPile = new Pile();

        maPile.empiler('A');
        maPile.empiler('B');
        maPile.empiler('C');

        maPile.afficherPile();

        maPile.depiler();
        maPile.afficherPile();

        System.out.println("Sommet de la pile: " + maPile.sommet());
    }
}



