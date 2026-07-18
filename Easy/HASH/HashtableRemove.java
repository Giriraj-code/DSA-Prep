package Easy.HASH;
import java.util.Hashtable;
class HashtableRemove{

    public static void main(String[] args){
        Hashtable<Integer , String> ht = new Hashtable<Integer , String>();

        ht.put(01,"Boxer");
        ht.put(02,"Runner");
        ht.put(03,"Swimmer");
        ht.put(04,"Dancer");

        System.out.println("Default Hashtable "+ht);

        ht.remove(01);

        System.out.println("After removing element in Hashtable "+ht);

    }

}