package de.telekom.sea.javaChallenge.third_part_loops;

public class Loops_part3 {
      public static void main (String[] args) {
        System.out.println("first loop");
        loop1();
        System.out.println("second loop");
        loop2();


    }
    public static void loop1(){
         int i = 0;
        //1st loop
        while (i < 8) {
            System.out.println(i);
            i++;

        }
    }
    public static void loop2 (){
        int i = 0;
        //2nd loop
        do {System.out.println(i);
            i++;}
        while (i<8);
    }
    }

