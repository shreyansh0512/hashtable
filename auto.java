import java.util.*;

public class SearchAutocomplete {

    static HashMap<String,Integer> queries = new HashMap<>();

    static void addQuery(String q){

        queries.put(q,queries.getOrDefault(q,0)+1);
    }

    public static void main(String[] args){

        addQuery("java tutorial");
        addQuery("java tutorial");
        addQuery("javascript");

        System.out.println(queries);
    }
}
