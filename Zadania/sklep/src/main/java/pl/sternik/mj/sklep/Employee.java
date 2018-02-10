package pl.sternik.mj.sklep;

public class Employee extends Person {
    @Override
    public boolean getAuthorization() {
        return false;
    }
}
