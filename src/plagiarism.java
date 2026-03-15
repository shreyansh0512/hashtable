import java.util.*;

public class PlagiarismDetector {

    static HashMap<String,Integer> freq = new HashMap<>();

    static void analyze(String text){

        String[] words = text.split(" ");

        for(int i=0;i<words.length-2;i++){

            String gram = words[i]+" "+words[i+1]+" "+words[i+2];

            freq.put(gram,freq.getOrDefault(gram,0)+1);
        }
    }

    public static void main(String[] args){

        analyze("java is great java is powerful java is great");

        System.out.println(freq);
    }
}
