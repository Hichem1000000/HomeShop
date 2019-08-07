package com.hichem.miam;

public class Four {
    private int puissance;
    private int capacite;

    private Resistance resistance;
    private Soufflerie soufflerie;

    public void cuire(Aliment aliment){
        System.out.println("Je suis un aliment : " + aliment.nom);
        System.out.println("avec ma capacité de " + capacite + " litres");
        System.out.println("et ma puissance de " + puissance + " degrés");
        aliment.estCuit = true;
    }

    private void maintenir(){

    }

    public int getPuissance() {
        return puissance;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public Soufflerie getSoufflerie() {
        return soufflerie;
    }

    public Resistance getResistance() {
        return resistance;
    }

    public void setPuissance(int puissance) {
        System.out.println("La puissance est modifiée");
        this.puissance = puissance;
    }
}
