import java.util.*;
public class p03986 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String X=sc.next();
        int ans=0,memo=0;
        for(int i=0;i<X.length();i++){
            if(X.charAt(i)=='T'){
                if(memo==0)continue;
                else memo--;
            }
            else memo++;
        }
        System.out.println(memo*2);
    }
}