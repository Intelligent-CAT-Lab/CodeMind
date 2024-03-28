import java.util.*;
public class p00017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while(true) {
            if(s.contains("the") || s.contains("that") || s.contains("this")) {
                System.out.println(s);
                break;
            }
            s = decode(s);
        }
    }
    public static String decode(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c!='' && c!='.') {
                sb.append((char)(c-1));
            } else {
                sb.append(c);
            }
        }
        return sb.toString().replace((char)(122-97+1),'a');
    }
}