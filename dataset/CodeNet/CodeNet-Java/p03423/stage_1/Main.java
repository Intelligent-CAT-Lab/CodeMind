import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String l = br.readLine();
		 StringTokenizer st = new StringTokenizer(l);
var newVariable_0 = Math.floor(Integer.parseInt(st.nextToken())/3);var newVariable_1 = Integer.parseInt(st.nextToken());var newVariable_2 = st.nextToken();    int answer = (int)Math.floor(Integer.parseInt(newVariable_2)/3);
    System.out.println(answer);
    
  }
}