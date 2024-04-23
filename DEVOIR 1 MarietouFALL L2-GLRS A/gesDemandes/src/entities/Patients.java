package entities;
public class Patients {
    private String numero;
    private String nom;
    private int tel;
    private static int nbrDemandes;
    public Patients(String numero, String nom, int tel) {
        nbrDemandes++;
        numero = "PAA0"+nbrDemandes;
        this.nom = nom;
        this.tel = tel;
    }
    public Patients() {
        nbrDemandes++;
        numero="PAA0"+nbrDemandes;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getTel() {
        return tel;
    }
    public void setTel(int tel) {
        this.tel = tel;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numero == null) ? 0 : numero.hashCode());
        result = prime * result + ((nom == null) ? 0 : nom.hashCode());
        result = prime * result + tel;
        result = prime * result + nbrDemandes;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Patients other = (Patients) obj;
        if (numero == null) {
            if (other.numero != null)
                return false;
        } else if (!numero.equals(other.numero))
            return false;
        if (nom == null) {
            if (other.nom != null)
                return false;
        } else if (!nom.equals(other.nom))
            return false;
        if (tel != other.tel)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Patients [numero=" + numero + ", nom=" + nom + ", tel=" + tel + ", nbrDemandes=" + nbrDemandes + "]";
    }
    
}
