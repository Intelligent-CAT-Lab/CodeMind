import java.util.*;
public class p03150 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length()+1;j++){
                if(s.substring(0,i)+s.substring(j).equals("keyence")){
                    System.out.println("YES");
                    return;
                }
            }
        }
        for(int k=0;k<s.length();k++){
            if(s.substring(k).equals("keyence")){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}