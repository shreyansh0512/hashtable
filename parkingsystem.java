import java.util.*;

public class ParkingSystem {

    static String[] table = new String[10];

    static int hash(String plate){

        return Math.abs(plate.hashCode())%table.length;
    }

    static void park(String plate){

        int index=hash(plate);

        while(table[index]!=null)
            index=(index+1)%table.length;

        table[index]=plate;

        System.out.println("Parked at "+index);
    }

    public static void main(String[] args){

        park("ABC123");
        park("XYZ999");
    }
}
