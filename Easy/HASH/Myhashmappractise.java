package Easy.HASH;
import java.util.HashMap;
public class Myhashmappractise {
    public static void main(String[] args){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Rahul",01);
        map.put("Rohit",02);
        map.put("Ramesh",03);

        System.out.println(map.get("Rahul"));
        System.out.println(map.getOrDefault("Suresh",04));
        System.out.println(map.containsKey("Rahul"));

    }
}
