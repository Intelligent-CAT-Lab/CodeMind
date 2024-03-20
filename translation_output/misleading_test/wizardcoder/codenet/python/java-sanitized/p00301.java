import java.util.*;

public class p00301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int SIZE = 15;
        int[] POW = new int[SIZE];
        POW[0] = 1;
        for(int i=1;i<SIZE;i++){
            POW[i] = POW[i-1]*3;
        }
        int max_digit = -1;
        for(int i=0;i<SIZE;i++){
            if((POW[i]-1)/2 >= W){
                max_digit = i;
                break;
            }
        }
        char[] ans = new char[max_digit+1];
        char[] work = new char[max_digit+1];
        recursive(max_digit,0,ans,work,W,SIZE);
        boolean isFirst = true;
        for(int i=max_digit;i>=0;i--){
            if(ans[i] == '0'){
                if(isFirst){
                    continue;
                }else{
                    System.out.print("0");
                }
            }else if(ans[i] == '+'){
                isFirst = false;
                System.out.print("+");
            }else{ //ans[i] == '-'
                isFirst = false;
                System.out.print("-");
            }
        }
        System.out.println();
    }
    public static void recursive(int digit,int tmp_sum,char[] ans,char[] work,int W,int SIZE){
        if(digit == -1){
            if(tmp_sum == W){
                for(int i=0;i<=digit;i++){
                    System.out.print(work[i]);
                }
            }
            return;
        }
        work[digit] = '0';
        recursive(digit-1,tmp_sum,ans,work,W,SIZE);
        work[digit] = '+';
        recursive(digit-1,tmp_sum+POW[digit],ans,work,W,SIZE);
        if(tmp_sum > 0){
            work[digit] = '-';
            recursive(digit-1,tmp_sum-POW[digit],ans,work,W,SIZE);
        }
    }
}