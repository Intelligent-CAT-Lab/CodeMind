// Day10 HashMap AOJ0029
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    
    void main() {
        Scanner sc = new Scanner(System.in);

        String[] s = sc.nextLine().split(" ");
System.out.println("[INST]9;s;sc.nextLine().split(' ');"+s);
System.out.println("[INST]9;None;sc.nextLine();"+sc.nextLine());
        HashMap<String,Integer> count = new HashMap<>();
        HashMap<String,Integer> length = new HashMap<>();
        for(int i=0;i<s.length;i++) {
            if(count.get(s[i]) == null) {
System.out.println("[INST]13;None;count.get(s[i]);"+count.get(s[i]));
                count.put(s[i], 1);
System.out.println("[INST]14;None;count.put(s[i], 1);"+count.put(s[i], 1));
                length.put(s[i], s[i].length());
System.out.println("[INST]15;None;length.put(s[i], s[i].length());"+length.put(s[i], s[i].length()));
System.out.println("[INST]15;None;s[i].length();"+s[i].length());
            }else {
                count.replace(s[i], count.get(s[i])+1);
System.out.println("[INST]17;None;count.replace(s[i], count.get(s[i])+1);"+count.replace(s[i], count.get(s[i])+1));
System.out.println("[INST]17;None;count.get(s[i]);"+count.get(s[i]));
            }
        }
        int max = 0;
        int maxlen = 0;
        String m = "";
        String mlen = "";
        for(String key:count.keySet()) {
System.out.println("[INST]24;None;count.keySet();"+count.keySet());
            m = (max < count.get(key) ? key:m);
System.out.println("[INST]25;None;count.get(key);"+count.get(key));
            max = Math.max(count.get(key), max);
System.out.println("[INST]26;max;Math.max(count.get(key), max);"+max);
System.out.println("[INST]26;None;count.get(key);"+count.get(key));
        }
        for(String key:length.keySet()) {
System.out.println("[INST]28;None;length.keySet();"+length.keySet());
            mlen = (maxlen < length.get(key) ? key:mlen);
System.out.println("[INST]29;None;length.get(key);"+length.get(key));
            maxlen = Math.max(length.get(key), maxlen);
System.out.println("[INST]30;maxlen;Math.max(length.get(key), maxlen);"+maxlen);
System.out.println("[INST]30;None;length.get(key);"+length.get(key));
        }
        
        System.out.println(m + " " + mlen);
    }
        
    
    public static void main(String[] args){
       new Main().main();
   }
}
