import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args)throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
System.out.println("[INST]7;n;Integer.parseInt(in.readLine());"+n);
System.out.println("[INST]7;None;in.readLine();"+in.readLine());
    int a = 0;
    int b = 0;
    if(n==2){
    a = Integer.parseInt(in.readLine());
System.out.println("[INST]11;a;Integer.parseInt(in.readLine());"+a);
System.out.println("[INST]11;None;in.readLine();"+in.readLine());
    b = Integer.parseInt(in.readLine());
System.out.println("[INST]12;b;Integer.parseInt(in.readLine());"+b);
System.out.println("[INST]12;None;in.readLine();"+in.readLine());
    }
    System.out.println(n==1?"Hello World":(a+b));
  }
}