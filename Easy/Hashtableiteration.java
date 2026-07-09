package Easy;

import java.util.Hashtable;
import java.util.Map;

class Hashtableiteration{

    public static void main(String[] args){

        Hashtable<String,Integer> ht = new Hashtable<>();

        ht.put("Raman",01);
        ht.put("Shyam",02);
        ht.put("Rahul",03);
        ht.put("Gopal",04);
        ht.put("Shivu",05);

        for(Map.Entry<String,Integer> e : ht.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

    }

}