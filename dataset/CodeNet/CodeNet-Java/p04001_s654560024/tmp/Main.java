import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
System.out.println("[INST]5;s;sc.next();"+s);
        int[] num = new int[s.length()];
System.out.println("[INST]6;None;s.length();"+s.length());
        for (int i=0;i<s.length();i++){
System.out.println("[INST]7;None;s.length();"+s.length());
            num[i]=s.charAt(i)-'1'+1;
System.out.println("[INST]8;None;s.charAt(i);"+s.charAt(i));
        }
        long ans = 0;
        for (int i=0;i<Math.pow(2,s.length()-1);i++){
System.out.println("[INST]11;None;Math.pow(2,s.length()-1);"+Math.pow(2,s.length()-1));
System.out.println("[INST]11;None;s.length();"+s.length());
            String index = Integer.toBinaryString(i);
System.out.println("[INST]12;index;Integer.toBinaryString(i);"+index);
            while (index.length()<s.length()-1)index="0"+index;
System.out.println("[INST]13;None;index.length();"+index.length());
System.out.println("[INST]13;None;s.length();"+s.length());
            long count=0;
            long instance=num[0];
            for (int j=1;j<s.length();j++){
System.out.println("[INST]16;None;s.length();"+s.length());
                if (index.charAt(j-1)=='0'){
System.out.println("[INST]17;None;index.charAt(j-1);"+index.charAt(j-1));
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