package de.telekom.sea.javaChallenge;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonImplTest {
    private PersonenSchlange cut;
    @BeforeEach
    void setup() {
        cut = new PersonenSchlange();
    }
    @Test
    //1 test
    void add_one_pers_test() {
        // check if person could be added in the list
        cut.empty(); //pre-condition check if list is empty
        PersonImpl person1 = new PersonImpl("Anna","Banana");
        try {cut.add(person1);} catch (Exception e) {
            e.printStackTrace();
        }
        int size = cut.size();
        assertEquals(1, size);
    }

    @Test
        //2 test
    void add_inval_size_test() {
        // check that there is not possible to add the person in the list, if list is full
        cut.empty(); //pre-condition check if list is empty
        PersonImpl person1 = new PersonImpl("Anna","Banana");
        PersonImpl person2 = new PersonImpl("Annita","Babanita");
        PersonImpl person3 = new PersonImpl("Olle","Lukkoye");
        PersonImpl person4 = new PersonImpl("Mars","Nutakoe");
        PersonImpl person5 = new PersonImpl("Cherry","Orange");
        PersonImpl person6 = new PersonImpl("Marry","Birne");
        PersonImpl person7 = new PersonImpl("Anton","Lalala");
        PersonImpl person8 = new PersonImpl("Dolly","Lololo");
        PersonImpl person9 = new PersonImpl("Boris","Born");
        try {cut.add(person1);
             cut.add(person2);
             cut.add(person3);
             cut.add(person4);
             cut.add(person5);
             cut.add(person6);
             cut.add(person7);
             cut.add(person8);
      //       cut.add(person9);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        int size = cut.size();
        assertEquals(8, size);
        assertThrows(RuntimeException.class,()->{cut.add(person9);});
    }
    RuntimeException noPlacesException (PersonImpl person){
        try{
            cut.add(person);
        }
        catch (RuntimeException rte){
            return rte;
        }
        return  null;
    }
    @Test
        //3 test
    void clear_test() {
        // check that the whole list could be cleared
        PersonImpl person1 = new PersonImpl("Anna","Banana");
        PersonImpl person2 = new PersonImpl("Kate","Orange");
        PersonImpl person3 = new PersonImpl("Kate","Birne");
        try {cut.add(person1);
             cut.add(person2);
             cut.add(person3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        cut.empty(); //pre-condition check if list not empty
        cut.reset();
        int size = cut.size();
        assertEquals(0, size);
    }

    @Test
        //4 test
    void empty_test() {
        // check empty methode before adding and after
        cut.empty(); //pre-condition check if list is empty
        PersonImpl person1 = new PersonImpl("Anna","Banana");
        cut.add(person1);
        cut.empty(); // check that list is not empty
        int size = cut.size();
        assertEquals(1, size);
    }

    @Test
        //5 test
    void remove_full_list_test() {
        // check that the whole list of persons could be deleted
        cut.empty(); //pre-condition check if list is empty
        PersonImpl person1 = new PersonImpl("Anna","Banana");
        PersonImpl person2 = new PersonImpl("Annita","Babanita");
        PersonImpl person3 = new PersonImpl("Olle","Lukkoye");
        PersonImpl person4 = new PersonImpl("Mars","Nutakoe");
        PersonImpl person5 = new PersonImpl("Cherry","Orange");
        PersonImpl person6 = new PersonImpl("Marry","Birne");
        PersonImpl person7 = new PersonImpl("Anton","Lalala");
        PersonImpl person8 = new PersonImpl("Dolly","Lololo");
        PersonImpl person9 = new PersonImpl("Boris","Born");
        try {cut.add(person1);
            cut.add(person2);
            cut.add(person3);
            cut.add(person4);
            cut.add(person5);
            cut.add(person6);
            cut.add(person7);
            cut.add(person8);
            //       cut.add(person9);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        cut.remove();
        int size = cut.size();
        assertEquals(0, size);
        System.out.println("Persons count: " + cut.size() + ".");
    }

    @Test
        //6 test
    void add_null_pers_test() {
        // check if person=null
        cut.empty(); //pre-condition check if list is empty
        int size = cut.size();
        assertThrows(NullPointerException.class,()->{cut.add(null);});
        assertEquals(0, size);
    }

    @Test
        //7 test
    void head_test() {
        // check first person
        cut.empty(); //pre-condition check if list is empty
        PersonImpl person1 = new PersonImpl("Anna","Banana");
        cut.add(person1);
        IPerson result = cut.head();
        assertNotNull (result);
        assertSame(result,person1);
    }

    @Test
        //8 test
    void head_empty_test() {
        // check if there is no person
        cut.empty(); //pre-condition check if list is empty
        IPerson result = cut.head();
        assertSame(null, result);
        assertNull (result);
    }

    @Test
        //9 test
    void remove_one_person_test() {
        // check that person could be added and then could be deleted
        cut.empty(); //pre-condition check if list is empty

        PersonImpl person1 = new PersonImpl("Olle","Lukkoye");

        try {cut.add(person1);
            //       cut.add(person9);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        cut.remove();
        int size = cut.size();
        assertEquals(0, size);
        System.out.println("Persons count: " + cut.size() + ".");
    }

    @Test
    //10 test
    void search_failed_onePerson_test() {

        PersonImpl person1 = new PersonImpl("Anna","Banana");
        PersonImpl person2 = new PersonImpl("Annita","Babanita");
        PersonImpl person3 = new PersonImpl("Gleb","Piwo");
        cut.add(person2);
        cut.add(person1);
  //      assertThrows(NullPointerException.class,()->{cut.search(person3);});
        IPerson result = cut.search(person3);
        assertNotEquals(result,person2);
        assertNotEquals(result,person1);
    }

    @Test
        //11 test
    //check that person could be found
    void search_onePerson_test() {

        PersonImpl person1 = new PersonImpl("Anna","Banana");
        PersonImpl person2 = new PersonImpl("Annita","Babanita");
        PersonImpl person3 = new PersonImpl("Gleb","Piwo");
        cut.add(person2);
        cut.add(person1);
        cut.add(person3);
        IPerson result = cut.search(person3);
        assertEquals(result,person3);
    }

    @Test
        //12 test
        //check  size
    void size_test (){
        PersonImpl person1 = new PersonImpl("Anna","Banana");
        PersonImpl person2 = new PersonImpl("Annita","Babanita");
        PersonImpl person3 = new PersonImpl("Gleb","Piwo");
        cut.add(person2);
        cut.add(person1);
        cut.add(person3);
        int result = cut.size();
        assertNotNull(result);


    }




    @AfterEach
    void teardown() {
        cut = null;
    }

}
