import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args)throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    int a = 0;
    int b = 0;
    if(n==2){
    a = Integer.parseInt(in.readLine());
    b = Integer.parseInt(in.readLine());
    }
    System.out.println(n==1?"Hello World":(a+b));
  }
}