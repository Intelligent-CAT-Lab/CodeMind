// Day10 HashMap AOJ0029
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    
    void main() {
        Scanner sc = new Scanner(System.in);

        String[] s = sc.nextLine().split(" ");
        HashMap<String,Integer> count = new HashMap<>();
        HashMap<String,Integer> length = new HashMap<>();
        for(int i=0;i<s.length;i++) {
            if(count.get(s[i]) == null) {
                count.put(s[i], 1);
                length.put(s[i], s[i].length());
            }else {
                count.replace(s[i], count.get(s[i])+1);
            }
        }
        int max = 0;
        int maxlen = 0;
        String m = "";
        String mlen = "";
        for(String key:count.keySet()) {
            m = (max < count.get(key) ? key:m);
            max = Math.max(count.get(key), max);
        }
        for(String key:length.keySet()) {
            mlen = (maxlen < length.get(key) ? key:mlen);
            maxlen = Math.max(length.get(key), maxlen);
        }
        
        System.out.println(m + " " + mlen);
    }
        
    
    public static void main(String[] args){
       new Main().main();
   }
}
