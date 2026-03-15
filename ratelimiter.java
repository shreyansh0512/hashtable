import java.util.*;

public class RateLimiter {

    static HashMap<String,Integer> requests = new HashMap<>();
    static int limit = 5;

    static boolean allow(String client){

        int count = requests.getOrDefault(client,0);

        if(count>=limit)
            return false;

        requests.put(client,count+1);

        return true;
    }

    public static void main(String[] args){

        for(int i=0;i<7;i++)
            System.out.println(allow("client1"));
    }
}
