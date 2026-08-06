package Easy.HASH;

import java.util.Hashtable;
import java.util.Map;

class Hashtableiteration{

    public static void main(String[] args){

        Hashtable<String,Integer> ht = new Hashtable<>();

        ht.put("Raju",01);
        ht.put("Vishnu",02);
        ht.put("Simon",03);
        ht.put("Golu",04);
        ht.put("Shiv",05);

        for(Map.Entry<String,Integer> e : ht.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

    }

}