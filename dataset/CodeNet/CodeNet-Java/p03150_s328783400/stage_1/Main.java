import java.util.*;

class Main {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String[] pat1 = { "keyence", "k",      "ke",    "key",  "keye", "keyen", "keyenc" };
        String[] pat2 = { "",        "eyence", "yence", "ence", "nce",  "ce",    "e"};

        boolean flg = true;

        for(int i = 0; i < 7; i++){
var newVariable_0 = pat1[i].equals(str.substring(0,pat1[i].length()));var newVariable_1 = str.substring(0,pat1[i].length());var newVariable_2 = pat1[i].length();            if(pat1[i].equals(str.substring(0,newVariable_2))){
var newVariable_3 = pat2[i].equals(str.substring(str.length() - pat2[i].length(), str.length()));var newVariable_4 = str.substring(str.length() - pat2[i].length(), str.length());var newVariable_5 = str.length();var newVariable_6 = pat2[i].length();var newVariable_7 = str.length();                if(pat2[i].equals(str.substring(newVariable_7 - pat2[i].length(), newVariable_7))){
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
