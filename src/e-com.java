import java.util.*;

public class FlashSaleInventory {

    static HashMap<String,Integer> stock = new HashMap<>();

    static synchronized boolean purchase(String product){

        int count = stock.getOrDefault(product,0);

        if(count>0){

            stock.put(product,count-1);
            return true;
        }

        return false;
    }

    public static void main(String[] args){

        stock.put("IPHONE15",5);

        System.out.println(purchase("IPHONE15"));
        System.out.println(stock);
    }
}
