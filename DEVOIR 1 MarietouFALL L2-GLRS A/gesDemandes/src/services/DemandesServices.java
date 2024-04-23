package services;
import entities.Demandes;

public class DemandesServices {
    private static final int MAX_DEMANDES = 10;
    private static Demandes[] tabDemandes = new Demandes[MAX_DEMANDES];
    private int n;

    public boolean enregistrerRV(Demandes dm) {
        if (n < MAX_DEMANDES) {
            tabDemandes[n++] = dm;
            return true;
        }
        return false; 
    }

    public void listerPatients() {
        for (int i = 0; i < n; i++) {
            System.out.println(tabDemandes[i]);
        }
    }
}

