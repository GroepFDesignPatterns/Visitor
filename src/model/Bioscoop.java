package model;

import interfaces.ILocatie;
import visitors.IVisitor;

public class Bioscoop implements ILocatie {
    private boolean isOpen = false;

    @Override
    public String pakNaam() {
        return "Pathe";
    }

    @Override
    public void accepteren(IVisitor visitor) {
        visitor.visitBioscoop(this);
    }

    public boolean getIsOpen() {
        return this.isOpen;
    }


    public void printJson() {
        System.out.println("Zet hier logica neer");
    }

}
