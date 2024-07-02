import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String l = br.readLine();
System.out.println("[INST]6;l;br.readLine();"+l);
		 StringTokenizer st = new StringTokenizer(l);
    int answer = (int)Math.floor(Integer.parseInt(st.nextToken())/3);
System.out.println("[INST]8;None;Math.floor(Integer.parseInt(st.nextToken())/3);"+Math.floor(Integer.parseInt(st.nextToken())/3));
System.out.println("[INST]8;None;Integer.parseInt(st.nextToken());"+Integer.parseInt(st.nextToken()));
System.out.println("[INST]8;None;st.nextToken();"+st.nextToken());
    System.out.println(answer);
    
  }
}