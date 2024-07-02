import java.io.*;
import java.util.Arrays;
import java.util.Collections;
public class Main {
	public static void main(String args[]){
    int a = 0,b = 0,c = 0;
    int bar[] = new int[3];
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try{
      String line = reader.readLine();
System.out.println("[INST]9;line;reader.readLine();"+line);
      String[] splitted = line.split(" ");
System.out.println("[INST]10;splitted;line.split(' ');"+splitted);
      a = Integer.parseInt(splitted[0]);
System.out.println("[INST]11;a;Integer.parseInt(splitted[0]);"+a);
      b = Integer.parseInt(splitted[1]);
System.out.println("[INST]12;b;Integer.parseInt(splitted[1]);"+b);
      c = Integer.parseInt(splitted[2]);
System.out.println("[INST]13;c;Integer.parseInt(splitted[2]);"+c);
      bar[0] = a;
      bar[1] = b;
      bar[2] = c;
    }catch(Exception e){
      bar[0] = 0;
      bar[1] = 0;
      bar[2] = 0;
    }
    Arrays.sort(bar);
System.out.println("[INST]22;None;Arrays.sort(bar);"+Arrays.sort(bar));
    System.out.println(bar[0] + " " + bar[1] + " " + bar[2]);
    		
	}
}
