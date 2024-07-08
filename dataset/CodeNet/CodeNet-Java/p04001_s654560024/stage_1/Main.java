import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
var newVariable_0 = s.length();        int[] num = new int[newVariable_0];
var newVariable_1 = s.length();        for (int i=0;i<newVariable_1;i++){
var newVariable_2 = s.charAt(i);            num[i]=newVariable_2-'1'+1;
        }
        long ans = 0;
var newVariable_3 = Math.pow(2,s.length()-1);var newVariable_4 = s.length();        for (int i=0;i<Math.pow(2,newVariable_4-1);i++){
            String index = Integer.toBinaryString(i);
var newVariable_5 = index.length();var newVariable_6 = s.length();            while (index.length()<newVariable_6-1)index="0"+index;
            long count=0;
            long instance=num[0];
var newVariable_7 = s.length();            for (int j=1;j<newVariable_7;j++){
var newVariable_8 = index.charAt(j-1);                if (newVariable_8=='0'){
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