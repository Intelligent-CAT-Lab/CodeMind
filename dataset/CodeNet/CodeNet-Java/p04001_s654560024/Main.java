import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] num = new int[s.length()];
        for (int i=0;i<s.length();i++){
            num[i]=s.charAt(i)-'1'+1;
        }
        long ans = 0;
        for (int i=0;i<Math.pow(2,s.length()-1);i++){
            String index = Integer.toBinaryString(i);
            while (index.length()<s.length()-1)index="0"+index;
            long count=0;
            long instance=num[0];
            for (int j=1;j<s.length();j++){
                if (index.charAt(j-1)=='0'){
                    instance*=10;
                    instance+=num[j];
                }else {
                    count+=instance;
                    instance=num[j];
                }
            }
            ans += count+instance;
        }
        System.out.println(ans);
    }
 
}