import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String strNum = br.readLine();
System.out.println("[INST]12;strNum;br.readLine();"+strNum);
		String[] strNumList = strNum.split(" ");
System.out.println("[INST]13;strNumList;strNum.split(' ');"+strNumList);
		
		Arrays.sort(strNumList);
System.out.println("[INST]15;None;Arrays.sort(strNumList);"+Arrays.sort(strNumList));
		
		int intNumSmall = Integer.parseInt(strNumList[0]);
System.out.println("[INST]17;intNumSmall;Integer.parseInt(strNumList[0]);"+intNumSmall);
		int intNumMiddle = Integer.parseInt(strNumList[1]);
System.out.println("[INST]18;intNumMiddle;Integer.parseInt(strNumList[1]);"+intNumMiddle);
		int intNumlarge = Integer.parseInt(strNumList[2]);
System.out.println("[INST]19;intNumlarge;Integer.parseInt(strNumList[2]);"+intNumlarge);
		
		System.out.println(intNumSmall + " " + intNumMiddle + " " + intNumlarge);
	}
}
