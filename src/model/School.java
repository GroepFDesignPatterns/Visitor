package model;

import interfaces.ILocatie;
import visitors.IVisitor;

public class School implements ILocatie {

    private final int maxAge = 12;

    public int getMaxAge() {
        return this.maxAge;
    }

    @Override
    public String pakNaam() {
        return "Bob";
    }

    @Override
    public void accepteren(IVisitor visitor) {
        visitor.visitSchool(this);

    }

    public void printJson() {
        System.out.println(String.format("{ \n" +
                "   naam: \"%s\",\n" +
                "   leeftijd: %o\n" +
                "}", this.pakNaam(), this.getMaxAge()));
    }
}
