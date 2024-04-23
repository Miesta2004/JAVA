import java.util.Scanner;

import emuns.Etat;
import entities.Demandes;
import entities.Patients;
public class GesDemVue {
    private static Scanner sc = new Scanner(System.in);
    public static Scanner getSc() {
        return sc;
    }

    public static Patients saisiePatient(){
        Patients p = new Patients();
        System.out.println("Saisir le nom du patient");
        p.setNom(sc.next());
        System.out.println("Saisir le numero de telephone du patient");
        p.setTel(sc.nextInt());
        return p;
    }

    public static Demandes saisieDemande(){
        Demandes d = new Demandes();
        System.out.println("Saisir la date de la demande");
        d.setDate(sc.next());
        System.out.println("Saisir l'heure de la demande");
        d.setHeure(sc.next());
        System.out.println("Saisir le motif de la demande");
        d.setMotif(sc.next());
        return d;
    }

    public static Etat selectionEtat(){
        int etat;
        do {
            System.out.println("1-Encours");
            System.out.println("2-Valider");
            System.out.println("3-Annuler");
            etat = sc.nextInt();
        } while (etat < 1 || etat > 3);
        return Etat.values()[sc.nextInt()];
    }

    public static int showMenu(){
        System.out.println("1-Ajouter un patient");
        System.out.println("2-Lister tousles patients");
        System.out.println("3-Enregistrer un RV pour un patient");
        System.out.println("4-Lister les RV par etat ");
        System.out.println("5-Lister les RV par specialite ");
        System.out.println("6-Traiter les RV");
        System.out.println("7-Quitter");
        return sc.nextInt();

    }
}
