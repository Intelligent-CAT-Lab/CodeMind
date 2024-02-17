import java.io.*;
   
class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int count=0;
        int a=1,b;
        if(x>=3 && x<=10000){
            for(; count<x; count++){
                 b = a/10;
                    if(a%3==0){
                        sb.append(" ");
                        sb.append(a);
                    }else{
                        b = a;
                        while(b!=0){
                            if(b%10==3){
                                sb.append(" ");
                                sb.append(a);
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