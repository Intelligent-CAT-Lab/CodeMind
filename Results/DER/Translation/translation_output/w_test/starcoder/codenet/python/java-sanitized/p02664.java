import java.util.*;
public class p02664 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='?'){
                ch[i]='D';
            }
        }
        System.out.println(new String(ch));
    }
}