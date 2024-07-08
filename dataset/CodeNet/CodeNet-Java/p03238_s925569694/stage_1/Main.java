import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args)throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
var newVariable_0 = in.readLine();    int n = Integer.parseInt(newVariable_0);
    int a = 0;
    int b = 0;
    if(n==2){
var newVariable_1 = in.readLine();    a = Integer.parseInt(newVariable_1);
var newVariable_2 = in.readLine();    b = Integer.parseInt(newVariable_2);
    }
    System.out.println(n==1?"Hello World":(a+b));
  }
}