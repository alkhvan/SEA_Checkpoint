package de.telekom.sea.javaChallenge;

public interface IPersonenSchlange {
    public void add(IPerson person);
    public IPerson head();
    public IPerson remove();
    public void reset();
    public boolean empty();
    public IPerson search(IPerson person);

}
