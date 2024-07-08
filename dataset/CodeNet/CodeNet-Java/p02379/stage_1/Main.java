import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
var newVariable_0 = br.readLine();       String[] lines=newVariable_0.split(" ");
       double[] list=new double[4];
       int n=4;
       while(n-->0){
var newVariable_1 = Double.parseDouble(lines[n]);           list[n]=newVariable_1;
       }
       System.out.println(Math.sqrt((list[0]-list[2])*(list[0]-list[2])+(list[1]-list[3])*(list[1]-list[3])));
       
    }
}