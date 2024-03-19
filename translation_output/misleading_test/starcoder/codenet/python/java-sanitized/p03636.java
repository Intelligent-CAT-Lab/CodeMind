import java.util.*;
public class p03636 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] ch = s.toCharArray();
        int i = 0;
        while(i<ch.length){
            if(ch[i]!=' '){
                break;
            }
            i++;
        }
        int j = ch.length-1;
        while(j>=0){
            if(ch[j]!=' '){
                break;
            }
            j--;
        }
        System.out.print(s.substring(0,i));
        System.out.print(ch.length-i-j-1);
        System.out.print(s.substring(j+1,s.length()));
    }
}