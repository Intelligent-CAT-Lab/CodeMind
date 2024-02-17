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
      String[] splitted = line.split(" ");
      a = Integer.parseInt(splitted[0]);
      b = Integer.parseInt(splitted[1]);
      c = Integer.parseInt(splitted[2]);
      bar[0] = a;
      bar[1] = b;
      bar[2] = c;
    }catch(Exception e){
      bar[0] = 0;
      bar[1] = 0;
      bar[2] = 0;
    }
    Arrays.sort(bar);
    System.out.println(bar[0] + " " + bar[1] + " " + bar[2]);
    		
	}
}
