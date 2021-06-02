package de.telekom.sea.javaChallenge;

public class PersonImpl implements IPerson {
    private String vorname;
    private String nachname;

    public PersonImpl(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public PersonImpl() {

    }

    @Override
    public String getVorname() {
        return vorname;
    }

    @Override
    public String getNachname() {
        return nachname;
    }
}
