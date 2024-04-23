import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scanne=new Scanner(System.in);
        int choix;
        do {
            choix=GesDemVue.showMenu();
            GesDemVue.getSc().nextInt();
            switch (choix) {
                case 1:
                    System.out.println("Ajouter un patient");
                    break;
                case 2:
                    System.out.println("Lister tous les patients");
                    break;
                case 3:
                    System.out.println("Enregistrer un RV pour un patient");
                    break;
                case 4:
                    System.out.println("Lister les RV par état");
                    break;
                case 5:
                    System.out.println("Lister les RV par spécialité");
                    break;
                case 6:
                    System.out.println("Traiter les RV");
                    break;
                case 7:
                    System.out.println("Quitter");
                    break;
                default:
                    System.out.println("Choix invalide");
            }   
        } while (choix>7 || choix<1);

        scanne.close();

        
    }

}
