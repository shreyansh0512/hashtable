import java.util.*;

public class UserNameChecker {

    static HashMap<String,Integer> users = new HashMap<>();
    static HashMap<String,Integer> attempts = new HashMap<>();

    static boolean checkAvailability(String username){

        attempts.put(username, attempts.getOrDefault(username,0)+1);

        return !users.containsKey(username);
    }

    static List<String> suggest(String username){

        List<String> list = new ArrayList<>();

        for(int i=1;i<=3;i++)
            list.add(username+i);

        return list;
    }

    public static void main(String[] args){

        users.put("john_doe",1);

        String username="john_doe";

        if(checkAvailability(username))
            System.out.println("Available");
        else
            System.out.println("Taken -> Suggestions "+suggest(username));
    }
}
