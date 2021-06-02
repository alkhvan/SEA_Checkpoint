package de.telekom.sea.javaChallenge.second_part;

import java.util.ArrayList;

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

        ArrayList<Datatype> datatypeList = new ArrayList<>();
        for (Datatype d: dataArray) {
            datatypeList.add(d);
        }
    //    Collections.sort(datatypeList);
    }


}
