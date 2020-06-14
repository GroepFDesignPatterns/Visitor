package interfaces;

import visitors.IVisitor;

public interface ILocatie {
    String pakNaam();
    void accepteren(IVisitor visitor);
}
