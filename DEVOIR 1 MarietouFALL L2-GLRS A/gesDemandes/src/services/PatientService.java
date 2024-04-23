package services;
import entities.Patients;
public class PatientService {
    private static final int NbrePatients = 10;
    private static Patients[] tabPatients = new Patients[NbrePatients];
    private int n;

    public boolean ajouterPatient(Patients p) {
        boolean ok=false;
        if (n < NbrePatients) {
            tabPatients[n++] = p;
            ok=true;
            return true;
        }
        return ok;

    }

    public void ListerPatients() {
        for (Patients p : tabPatients) {
            if (p != null) {
                System.out.println(p);
            }
        }
    }
}
