package de.telekom.sea.javaChallenge.second_part;





//RESULT: (boolean 8 bit = byte 8 bit) < (char = short 16 bit) <(int= float 32 bit) < (long = double 64 bit)









import java.util.*;

public class Datatypes {

    public static void main(String[] args) {
        Datatype byteDatatype = new Datatype("byte",8);
        Datatype booleanDatatype = new Datatype("boolean",8);
        Datatype charDatatype = new Datatype("char",16);
        Datatype shortDatatype = new Datatype("short",16);
        Datatype intDatatype = new Datatype("int",32);
        Datatype floatDatatype = new Datatype("float", 32);
        Datatype longDatatype = new Datatype("long", 64);
        Datatype doubleDatatype = new Datatype("double", 64);

        Datatype [] dataArray = new Datatype[]{byteDatatype,booleanDatatype, charDatatype,shortDatatype,intDatatype,floatDatatype,longDatatype,doubleDatatype};

//       ArrayList<Datatype> datatypeList = new ArrayList<>();
//
//        for (Datatype d: dataArray) {
//            datatypeList.add(d);
//        }

        List<Datatype> datatypeList = new ArrayList<>();
        datatypeList.add(byteDatatype);
        datatypeList.add(booleanDatatype);
        datatypeList.add(charDatatype);
        datatypeList.add(shortDatatype);
        datatypeList.add(intDatatype);
        datatypeList.add(floatDatatype);
        datatypeList.add(longDatatype);
        datatypeList.add(doubleDatatype);


//        Comparator<Datatype> comparator = new Comparator<Datatype>(){
//            public int compare(Datatype byteDatatype, Datatype booleanDatatype, Datatype charDatatype,
//                               Datatype shortDatatype, Datatype intDatatype, Datatype floatDatatype) {
//
//                return d1.getId().compareTo(d2.getId());
//            }
//        };

        for(Datatype d : datatypeList){
            System.out.println(d);
        }
        }



    }



