import java.util.*;
public class p03854 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.length()<5) {
            System.out.println("NO");
            return;
        }
        int i=0;
        while(true) {
            if(i+5==s.length() && s.substring(i,i+5).equals("dream")) {
                System.out.println("YES");
                return;
            }
            else if(i+5==s.length() && s.substring(i,i+5).equals("erase")) {
                System.out.println("YES");
                return;
            }
            else if(i+6==s.length() && s.substring(i,i+6).equals("eraser")) {
                System.out.println("YES");
                return;
            }
            else if(i+7==s.length() && s.substring(i,i+7).equals("dreamer")) {
                System.out.println("YES");
                return;
            }
            else if(s.substring(i,i+5).equals("dream") && i+8<=s.length()) {
                if(s.substring(i+5,i+8).equals("erd") || s.substring(i+5,i+8).equals("ere")) {
                    i+=7;
                }
                else if(s.substring(i+5,i+8).equals("era") || s.substring(i+5,i+6).equals("d")) {
                    i+=5;
                }
                else {
                    System.out.println("NO");
                    return;
                }
            }
            else if(s.substring(i,i+5).equals("erase") && i+7<=s.length()) {
                if(s.substring(i+5,i+6).equals("e") || s.substring(i+5,i+6).equals("d")) {
                    i+=5;
                }
                else if(s.substring(i+5,i+6).equals("r")) {
                    i+=6;
                }
                else {
                    System.out.println("NO");
                    return;
                }
            }
            else {
                System.out.println("NO");
                return;
            }
        }
    }
}