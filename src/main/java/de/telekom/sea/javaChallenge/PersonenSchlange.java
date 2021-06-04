package de.telekom.sea.javaChallenge;

public class PersonenSchlange extends  BaseObject implements IPersonenSchlange {
    private int LENGTH = 8;
    private Object[] personsList = new Object[LENGTH];
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLACK = "\u001B[30m";


    public int size() { // check size of the persons in the queue
        int i = 0;
        while (i < personsList.length && personsList[i] != null) // check that i < length of the list and that size of the list is not null
            i++;
        return i;
    }

    @Override
    public void add(IPerson person) {
        // 1: check if array was not overflowed
        if (size() == personsList.length)
        {
            System.out.println(ANSI_RED + "Sorry! No more places in the queue. There are only: " + personsList.length + " places" + ANSI_RED);
           throw new RuntimeException("RuntimeException. Please check count of already added persons");
        }
        //2: check if person was already added
        PersonImpl p = (PersonImpl) person;
        for (int i = 0; i < personsList.length; i++) {
            if (personsList[i] != null && personsList[i].equals(person)) {
                System.out.println(ANSI_RED + "Person " + p.getVorname() + p.getNachname() + " was already added in the list" + ANSI_RED);
                //  return false;
            }
        }
        //3: person will be successfully added to the list
        if (size() < personsList.length) {
            personsList[size()] = person;
            System.out.println(ANSI_GREEN + p.getVorname() + " " + p.getNachname() + ANSI_GREEN + ANSI_BLACK + " added to the list under №" + size() + "." + ANSI_BLACK);
            //  return true;
        }
        else System.out.println("Person "+p.getVorname()+" could not be added!");
    }

    @Override
    public IPerson head() {
        int i = 0;
        IPerson p = (IPerson) personsList[i];
        if (personsList[i] != null) {
            System.out.println(ANSI_BLACK + "The first person in the list is: " + p.getVorname() + " " + p.getNachname() + ANSI_BLACK);
        }
        return p;
    }

    @Override
    public IPerson remove() {
        int i = 0;
        int j = 0;

//        if (personsList[i] == null) {
//            System.out.println("Sorry! Nothing to delete");
//            throw new RuntimeException("RuntimeException. Please check list of persons");
//        }
//        if (personsList.length>0){
//        for(j=0;j<(personsList.length);j++) {
//            while (i != (personsList.length)) {
//                IPerson p = (IPerson) personsList[i];
//                i++;
//                System.out.println(ANSI_BLACK + "Person №" + i + " " + ANSI_BLACK + ANSI_RED + p.getVorname() + " " + p.getNachname() + ANSI_RED + ANSI_BLACK + " was removed from the list" + ANSI_BLACK);
//            }
//            personsList[j] = null;
//        }else System.out.println("Sorry! Nothing to delete");
        for (j = 0; j < (personsList.length); j++) {
            int k = size();
            while (i < k) {
                IPerson p = (IPerson) personsList[i];
                i++;
                System.out.println(ANSI_BLACK + "Person №" + i + " " + ANSI_BLACK + ANSI_RED + p.getVorname() + " " + p.getNachname() + ANSI_RED + ANSI_BLACK + " was removed from the list" + ANSI_BLACK);
            }
            personsList[j] = null;
        }


        return null;
    }

    @Override
    public void reset() {
        this.personsList = new IPerson[LENGTH];

    }

    @Override
    public boolean empty() throws IndexOutOfBoundsException {
        if (personsList[size()] == null)
            return true;
        else
            return false;
    }

    @Override
    public IPerson search(IPerson person) {
        int i = 0;

        String vorname = person.getVorname();
        String nachname = person.getNachname();
        PersonImpl p = (PersonImpl) personsList[i];

        do {

            if (vorname.equals(p.getVorname()) && nachname.equals(p.getNachname())) {
                System.out.println("Person is found: " + p.getVorname() + " " + p.getNachname());
            }
            i++;

        } while (i < size());
//        if (!vorname.equals(p.getVorname()) && !nachname.equals(p.getNachname())) {
//            System.out.println("Person is NOT found: " + p.getVorname() + " " + p.getNachname());
//        }

      return person;
    }


//    public int search(IPerson person) {
//   //     PersonImpl p = (PersonImpl) person;
//        int i;
//        String vorname =person.getVorname();
//        String nachname = person.getNachname();
//        for (i = 0; i < personsList.length; i++) {
//                PersonImpl p = (PersonImpl) personsList[i];
//                if (vorname.equals(p.getVorname()) && nachname.equals(p.getNachname())) {
//                    System.out.println("Person is found: " + p.getVorname() + " " + p.getNachname());
//                }
//        }
//
//        System.out.println("Person is not found! " +person.getVorname()+ " "+person.getNachname());
//
//            return 0;
//
//        }

}

