import java.io.*;
   
class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
System.out.println("[INST]5;x;Integer.parseInt(br.readLine());"+x);
System.out.println("[INST]5;None;br.readLine();"+br.readLine());
        StringBuilder sb = new StringBuilder();
        int count=0;
        int a=1,b;
        if(x>=3 && x<=10000){
            for(; count<x; count++){
                 b = a/10;
                    if(a%3==0){
                        sb.append(" ");
System.out.println("[INST]13;None;sb.append(' ');"+sb.append(" "));
                        sb.append(a);
System.out.println("[INST]14;None;sb.append(a);"+sb.append(a));
                    }else{
                        b = a;
                        while(b!=0){
                            if(b%10==3){
                                sb.append(" ");
System.out.println("[INST]19;None;sb.append(' ');"+sb.append(" "));
                                sb.append(a);
System.out.println("[INST]20;None;sb.append(a);"+sb.append(a));
                                break;
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