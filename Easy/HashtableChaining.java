package Easy;
import java.util.Hashtable;

class HashtableChaining{

    public static void main(String[] args){

        Hashtable<Integer , String> ht = new Hashtable<Integer , String>();

        ht.put(0,"Rahul");
        ht.put(1,"Glover");
        ht.put(2,"Sunny");
        ht.put(3,"Boar");

        System.out.println("Initial Hashtable : " + ht);

        ht.put(3,"Bunny");

        System.out.println("After chaining Hashtable : " + ht);

    }

}