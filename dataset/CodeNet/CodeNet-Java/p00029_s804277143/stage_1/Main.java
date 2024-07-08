// Day10 HashMap AOJ0029
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    
    void main() {
        Scanner sc = new Scanner(System.in);

var newVariable_0 = sc.nextLine();        String[] s = newVariable_0.split(" ");
        HashMap<String,Integer> count = new HashMap<>();
        HashMap<String,Integer> length = new HashMap<>();
        for(int i=0;i<s.length;i++) {
var newVariable_1 = count.get(s[i]);            if(newVariable_1 == null) {
var newVariable_2 = count.put(s[i], 1);var newVariable_3 = length.put(s[i], s[i].length());var newVariable_4 = s[i].length();                length.put(s[i], newVariable_4);
            }else {
var newVariable_5 = count.replace(s[i], count.get(s[i])+1);var newVariable_6 = count.get(s[i]);                count.replace(s[i], newVariable_6+1);
            }
        }
        int max = 0;
        int maxlen = 0;
        String m = "";
        String mlen = "";
var newVariable_7 = count.keySet();        for(String key:newVariable_7) {
var newVariable_8 = count.get(key);            m = (max < newVariable_8 ? key:m);
var newVariable_9 = count.get(key);            max = Math.max(newVariable_9, max);
        }
var newVariable_10 = length.keySet();        for(String key:newVariable_10) {
var newVariable_11 = length.get(key);            mlen = (maxlen < newVariable_11 ? key:mlen);
var newVariable_12 = length.get(key);            maxlen = Math.max(newVariable_12, maxlen);
        }
        
        System.out.println(m + " " + mlen);
    }
        
    
    public static void main(String[] args){
       new Main().main();
   }
}
