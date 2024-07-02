import java.util.*;
 
public class Main {
      
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
         
        int res[]=new int[26];
         
        while(cin.hasNext()) {
System.out.println("[INST]9;None;cin.hasNext();"+cin.hasNext());
            String str=cin.nextLine();
System.out.println("[INST]10;str;cin.nextLine();"+str);
            for(int i=0;i<str.length();i++) {
System.out.println("[INST]11;None;str.length();"+str.length());
                char c=str.charAt(i);
System.out.println("[INST]12;c;str.charAt(i);"+c);
                if(c>=65 && c<=90)res[c-65]++;
                else if(c>=97 && c<=122)res[c-97]++;
            }
        }
         
        for(int i=0;i<26;i++) {
            System.out.println((char)(i+97)+" : "+res[i]);
        }
         
    }
     
}
