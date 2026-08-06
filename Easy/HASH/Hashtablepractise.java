package Easy.HASH;
import java.util.Hashtable;
class Hashtablepractise{
    public static void main(String[] args){
        Hashtable<String, Integer> ht = new Hashtable<>();

        ht.put("Ramos", 01);
        ht.put("Vamos", 02);
        ht.put("Momos", 03);

        System.out.println("Hash table size " + ht.size());
        System.out.println(ht);


        if(ht.containsKey("Vamos")){
            Integer a = ht.get("Vamos");
            System.out.println(a);
        }
    }
}