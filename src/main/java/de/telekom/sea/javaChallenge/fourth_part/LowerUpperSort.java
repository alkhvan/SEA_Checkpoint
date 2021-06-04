package de.telekom.sea.javaChallenge.fourth_part;

import java.io.IOException;


public class LowerUpperSort {

    public static void main(String[] args) throws IOException {

//        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

//        ArrayList<Character> abc = new ArrayList<Character>();
//        for (int i = 0; i < alphabet.length; i++)
//        {
//            abc.add(alphabet[i]);
//        }


        //input string value
        String poem = String.join( "",
                "Whose woods these are I think I know.",
                "His house is in the village, though;",
                "He will not see me stopping here",
                "To watch his woods fill up with snow.",
                "",
                "My little horse must think it's queer",
                "To stop without a farmhouse near",
                "Between the woods and frozen lake",
                "The darkest evening of the year.",
                "",
                "He gives his harness bells a shake",
                "To ask if there's some mistake.",
                "The only other sound's the sweep",
                "Of easy wind and downy flake.",
                "",
                "The woods are lovely, dark, and deep,",
                "But I have promises to keep,",
                "And miles to go before I sleep,",
                "And miles to go before I sleep."
        );

        for(char i = 'a';i<='z';i++){
            System.out.println(i+ ": ");
            System.out.println(countChar(poem,i));
            }

    }
    public static int countChar(String poem, char c){
        int count = 0;
        for (Character character: poem.toLowerCase().toCharArray()){
            if (character== c){
                count++;
            }
        }
        return count;
    }
    }

