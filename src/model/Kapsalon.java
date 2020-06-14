package model;

import interfaces.ILocatie;
import visitors.IVisitor;

public class Kapsalon implements ILocatie {
    private int aantalBezoekers = 0;

    @Override
    public String pakNaam() {
        return "Kapper Bob";
    }

    @Override
    public void accepteren(IVisitor visitor) {
        visitor.visitKapsalon(this);
    }

    public int getAantalBezoekers() {
        return this.aantalBezoekers;
    }


//    public void printJson(){
//        System.out.println(String.format("{ \n" +
//                "   naam: \"%s\",\n" +
//                "   aantalBezoekers: %o\n" +
//                "}", this.pakNaam(), this.getAantalBezoekers()));
//    }
}
