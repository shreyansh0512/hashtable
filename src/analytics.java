import java.util.*;

public class RealtimeAnalytics {

    static HashMap<String,Integer> pageViews = new HashMap<>();

    static void processEvent(String page){

        pageViews.put(page,pageViews.getOrDefault(page,0)+1);
    }

    public static void main(String[] args){

        processEvent("/news");
        processEvent("/news");
        processEvent("/sports");

        System.out.println(pageViews);
    }
}
