import java.io.*;
   
class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
var newVariable_0 = br.readLine();        int x = Integer.parseInt(newVariable_0);
        StringBuilder sb = new StringBuilder();
        int count=0;
        int a=1,b;
        if(x>=3 && x<=10000){
            for(; count<x; count++){
                 b = a/10;
                    if(a%3==0){
var newVariable_1 = sb.append(" ");var newVariable_2 = sb.append(a);                    }else{
                        b = a;
                        while(b!=0){
                            if(b%10==3){
var newVariable_3 = sb.append(" ");var newVariable_4 = sb.append(a);                                break;
                            }
                            b /= 10;
                        }
                    }
                    a++;
            }
        }
        System.out.println(sb);
    }
}