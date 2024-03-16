import java.util.*;
public class p00017 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()) {
            String s=sc.nextLine();
            for(int i=0;i<26;i++) {
                if(s.contains("the") || s.contains("that") || s.contains("this")) {
                    System.out.println(s);
                    break;
                }
                s=decode(s);
            }
        }
    }
    public static String decode(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if(c!='.' && c!=' ') {
                sb.append((char)(c-1));
            } else {
                sb.append(c);
            }
        }
        return sb.toString().replace("z","a");
    }
}