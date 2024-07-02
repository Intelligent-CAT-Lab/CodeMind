import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
System.out.println("[INST]5;str;br.readLine().split(' ');"+str);
System.out.println("[INST]5;None;br.readLine();"+br.readLine());
        int a = Integer.parseInt(str[0]);
System.out.println("[INST]6;a;Integer.parseInt(str[0]);"+a);
        int b = Integer.parseInt(str[1]);
System.out.println("[INST]7;b;Integer.parseInt(str[1]);"+b);
        int c = Integer.parseInt(str[2]);
System.out.println("[INST]8;c;Integer.parseInt(str[2]);"+c);
        int count = 0;

        for(; a <= b; a++){
            if( c % a == 0 )count++;
        }
        System.out.println(count);
    }
}