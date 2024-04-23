package entities;

import emuns.Etat;
import emuns.Specialite;

public class Demandes {
    private String date;
    private String heure;
    private String motif;
    private Specialite spe;
    private Etat etat;
    private Patients patient;
    public Patients getPatient() {
        return patient;
    }
    public void setPatient(Patients patient) {
        this.patient = patient;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getHeure() {
        return heure;
    }
    public void setHeure(String heure) {
        this.heure = heure;
    }
    public String getMotif() {
        return motif;
    }
    public void setMotif(String motif) {
        this.motif = motif;
    }
    public Specialite getSpe() {
        return spe;
    }
    public void setSpe(Specialite spe) {
        this.spe = spe;
    }
    public Etat getEtat() {
        return etat;
    }
    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    
}
