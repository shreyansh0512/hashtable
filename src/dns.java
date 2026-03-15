import java.util.*;

class DNSEntry{

    String ip;
    long expiry;

    DNSEntry(String ip,long ttl){

        this.ip=ip;
        this.expiry=System.currentTimeMillis()+ttl;
    }
}

public class DNSCacheSystem {

    static HashMap<String,DNSEntry> cache = new HashMap<>();

    static String resolve(String domain){

        DNSEntry entry = cache.get(domain);

        if(entry!=null && entry.expiry>System.currentTimeMillis())
            return entry.ip;

        String newIP="172.0.0."+new Random().nextInt(255);

        cache.put(domain,new DNSEntry(newIP,5000));

        return newIP;
    }

    public static void main(String[] args){

        System.out.println(resolve("google.com"));
        System.out.println(resolve("google.com"));
    }
}
