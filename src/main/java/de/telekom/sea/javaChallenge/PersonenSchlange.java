package de.telekom.sea.javaChallenge;

public class PersonenSchlange extends  BaseObject implements IPersonenSchlange {
    private int LENGTH =8;
    private Object [] personsList = new Object[LENGTH];
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLACK = "\u001B[30m";

    public int size(){ // check size of the persons in the queue
        int i =0;
        while (i<personsList.length && personsList[i]!=null) // check that i < length of the list and that size of the list is not null
            i++;
        return i;
    }

    @Override
    public  void add(IPerson person){
        // 1: check if array was not overflowed
        if (size() == personsList.length) {
            System.out.println(ANSI_RED + "Sorry! No more places in the queue. There are only: " +personsList.length + " places" +ANSI_RED);
            throw new RuntimeException("RuntimeException. Please check count of already added persons");
        }
        //2: check if person was already added
        PersonImpl p = (PersonImpl) person;
        for (int i = 0; i < personsList.length; i++) {
            if (personsList[i] != null && personsList[i].equals(person)) {
                System.out.println(ANSI_RED+"Person "+ p.getVorname()+ p.getNachname() +" was already added in the list"+ANSI_RED);
              //  return false;
            }
        }
        //3: person will be successfully added to the list
        if (size() < personsList.length) {
            personsList[size()] = person;
            System.out.println(ANSI_GREEN+ p.getVorname() + " " + p.getNachname() +ANSI_GREEN +ANSI_BLACK+ " added to the list under №" + size() + "."+ANSI_BLACK);
          //  return true;
        }
    }

    @Override
    public IPerson head() {
      int i =0;
        IPerson p = (IPerson) personsList [i];
      if(personsList[i]!= null){
            System.out.println(ANSI_BLACK+"The first person in the list is: "+p.getVorname() + " " + p.getNachname()+ANSI_BLACK);
        }
        return null;
    }

    @Override

    public IPerson remove() {
        int i=0;
        while (i!=(personsList.length)){
            IPerson p = (IPerson) personsList [i];
            i++;
            System.out.println(ANSI_BLACK+"Person №"+ i + " "+ANSI_BLACK+ANSI_RED+ p.getVorname()+" "+ p.getNachname()+ANSI_RED +ANSI_BLACK+" was removed from the list"+ANSI_BLACK);
        }
        personsList[personsList.length-1]=null;
        return null;
    }

    @Override
    public void reset() {
        this.personsList = new IPerson[LENGTH];

    }

    @Override
    public boolean empty() {
        if(personsList[size()]== null)
            return true;
        else
        return false;
    }

    @Override
    public int search(IPerson Person) {
        return 0;
    }


}
