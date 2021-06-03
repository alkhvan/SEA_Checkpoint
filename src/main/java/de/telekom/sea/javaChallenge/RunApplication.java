package de.telekom.sea.javaChallenge;

public class RunApplication extends  BaseObject {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";
    PersonenSchlange personenSchlange = new PersonenSchlange();
    // adding 8 instance of persons with constructor
    PersonImpl person1 = new PersonImpl("Anna","Banana");
    PersonImpl person2 = new PersonImpl("Annita","Babanita");
    PersonImpl person3 = new PersonImpl("Olle","Lukkoye");
    PersonImpl person4 = new PersonImpl("Mars","Nutakoe");
    PersonImpl person5 = new PersonImpl("Cherry","Orange");
    PersonImpl person6 = new PersonImpl("Marry","Birne");
    PersonImpl person7 = new PersonImpl("Anton","Lalala");
    PersonImpl person8 = new PersonImpl("Dolly","Lololo");
    PersonImpl person9 = new PersonImpl("Boris","Born");

    public void test(){

    //check if list is empty
        try{if (personenSchlange.empty())
            System.out.println("List ist empty.");
            //  else System.out.println("List is not empty");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("List is not empty");
        }

     System.out.println("     ");
        try{
            personenSchlange.add(person1);
            personenSchlange.add(person2);
            personenSchlange.add(person3);
            personenSchlange.add(person4);
            personenSchlange.add(person5);
            personenSchlange.add(person6);
            personenSchlange.add(person7);
            personenSchlange.add(person8);}
        catch (IndexOutOfBoundsException e){
            System.out.println("Something goes wrong with adding to the list!");
        }
        System.out.println("     ");

        //perform search of the first person (only by the name)
    personenSchlange.search(person1);
    personenSchlange.search(person4);
    personenSchlange.search(person9); // this person will be not found


    try{if (personenSchlange.empty())
            System.out.println("List ist empty.");
       }
    catch (IndexOutOfBoundsException e){
        System.out.println("List is not empty");
    }

    System.out.println("     ");
    System.out.println("Persons count: " +ANSI_BLUE+ personenSchlange.size() + "."+ ANSI_BLUE);
    System.out.println("     ");
        //return the first persom in the list
    personenSchlange.head();
    System.out.println("     ");
    //remove persons beginning from the first person
    if (personenSchlange.remove()==null)
        System.out.println("The queue is empty! Persons could not be removed!");
    System.out.println("     ");

    System.out.println("Persons count: " +ANSI_BLUE+ personenSchlange.size() + "."+ ANSI_BLUE);
    System.out.println("     ");

     System.out.println("     ");
     personenSchlange.add(person1);
     personenSchlange.add(person2);
     personenSchlange.add(person3);
     personenSchlange.add(person4);
     personenSchlange.add(person5);
     personenSchlange.add(person6);
     personenSchlange.add(person7);
     personenSchlange.add(person8);

     System.out.println("     ");
        System.out.println("Persons count: " +ANSI_BLUE+ personenSchlange.size() + "."+ ANSI_BLUE);
        System.out.println("     ");
      personenSchlange.reset();
        System.out.println("     ");
        System.out.println("Persons count: " +ANSI_BLUE+ personenSchlange.size() + "."+ ANSI_BLUE);
        System.out.println("     ");
}


    }
