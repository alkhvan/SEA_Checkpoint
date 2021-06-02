package de.telekom.sea.javaChallenge.third_part_loops;

public class Loops_part3 {

    public static void main (String[] args) {
        System.out.println("first loop");
     //   loop1(i);
        System.out.println("second loop");

    }
    public void loop1 (int i){
        i = 0;
        //1st loop
        while (i < 8) {
            System.out.println(i);
            i++;

        }
    }
    public void loop2 (int i){
        i = 0;
        //2nd loop
        do {System.out.println(i);
            i++;}
        while (i<8);
    }
    }

