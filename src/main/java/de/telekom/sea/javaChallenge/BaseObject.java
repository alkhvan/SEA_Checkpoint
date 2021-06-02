package de.telekom.sea.javaChallenge;

public class BaseObject extends Object {
 //   protected Object myList;
     private Object parent;
     private static long idCounter =0;
     private long id;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) // null check
        {
           return false;
        }
        if (this == obj) // self check
        {
           return true;
        }
        if (!(obj instanceof BaseObject)) {// type check
            return false;
        }

        // type check and cast
        BaseObject baseObject = (BaseObject) obj; // cast to BaseObject
        return (baseObject.id == this.id);
    }


    public String toString(){
        return ((Long)id).toString();
 }




    public Object getParent() {
        return parent;
    }
    public void setParent(Object parent) {
        this.parent = parent;
    }

}
