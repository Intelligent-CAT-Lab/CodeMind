import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String[] lines=br.readLine().split(" ");
System.out.println("[INST]8;lines;br.readLine().split(' ');"+lines);
System.out.println("[INST]8;None;br.readLine();"+br.readLine());
       double[] list=new double[4];
       int n=4;
       while(n-->0){
           list[n]=Double.parseDouble(lines[n]);
System.out.println("[INST]12;None;Double.parseDouble(lines[n]);"+Double.parseDouble(lines[n]));
       }
       System.out.println(Math.sqrt((list[0]-list[2])*(list[0]-list[2])+(list[1]-list[3])*(list[1]-list[3])));
       
    }
}