import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main (String[] args) {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int div=10;
            int tot=0;
            if(n%2==1){
                System.out.println(0);
            }
            else{
                while(n>=div){
                    tot+=(n/div);
                    div*=5;
                }
                System.out.println(tot);
            }
        }
    }
}