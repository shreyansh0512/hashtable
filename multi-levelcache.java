import java.util.*;

public class MultiLevelCache {

    static LinkedHashMap<String,String> L1 =
            new LinkedHashMap<>(5,0.75f,true);

    static HashMap<String,String> L2 = new HashMap<>();

    static String get(String key){

        if(L1.containsKey(key))
            return "L1:"+L1.get(key);

        if(L2.containsKey(key)){

            L1.put(key,L2.get(key));
            return "L2:"+L2.get(key);
        }

        return "DB fetch";
    }

    public static void main(String[] args){

        L2.put("video1","data");

        System.out.println(get("video1"));
        System.out.println(get("video1"));
    }
}
