import java.util.*;

class Main {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
System.out.println("[INST]5;str;sc.next();"+str);

        String[] pat1 = { "keyence", "k",      "ke",    "key",  "keye", "keyen", "keyenc" };
        String[] pat2 = { "",        "eyence", "yence", "ence", "nce",  "ce",    "e"};

        boolean flg = true;

        for(int i = 0; i < 7; i++){
            if(pat1[i].equals(str.substring(0,pat1[i].length()))){
System.out.println("[INST]13;None;pat1[i].equals(str.substring(0,pat1[i].length()));"+pat1[i].equals(str.substring(0,pat1[i].length())));
System.out.println("[INST]13;None;str.substring(0,pat1[i].length());"+str.substring(0,pat1[i].length()));
System.out.println("[INST]13;None;pat1[i].length();"+pat1[i].length());
                if(pat2[i].equals(str.substring(str.length() - pat2[i].length(), str.length()))){
System.out.println("[INST]14;None;pat2[i].equals(str.substring(str.length() - pat2[i].length(), str.length()));"+pat2[i].equals(str.substring(str.length() - pat2[i].length(), str.length())));
System.out.println("[INST]14;None;str.substring(str.length() - pat2[i].length(), str.length());"+str.substring(str.length() - pat2[i].length(), str.length()));
System.out.println("[INST]14;None;str.length();"+str.length());
System.out.println("[INST]14;None;pat2[i].length();"+pat2[i].length());
System.out.println("[INST]14;None;str.length();"+str.length());
                    System.out.println("YES");
                    flg = false;
                    break;
                }
            }
        }
        if(flg){
            System.out.println("NO");
        }
    }
}
