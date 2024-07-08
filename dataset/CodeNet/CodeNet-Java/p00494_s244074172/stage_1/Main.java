import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String []arg){
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		List<String[]> list = new ArrayList<String[]>();
var newVariable_0 = str.length();		for(int i=0; i<newVariable_0; i++){
			String tmp[] = new String[2];
			int cnt = 1;
var newVariable_1 = str.charAt(i);			if(newVariable_1=='I'){
				tmp[0] = "I";
			}
var newVariable_2 = str.charAt(i);			else if(newVariable_2=='O'){
				tmp[0] = "O";
			}
var newVariable_3 = str.charAt(i);			else if(newVariable_3=='J'){
				tmp[0] = "J";
			}
var newVariable_4 = str.length();			if(i<newVariable_4-1){
var newVariable_5 = str.charAt(i);var newVariable_6 = str.charAt(i+1);				while(str.charAt(i)==newVariable_6){
					cnt++;
					i++;
var newVariable_7 = str.length();					if(i==newVariable_7-1){
						break;
					}
				}
			}
var newVariable_8 = String.valueOf(cnt);			tmp[1] = newVariable_8;
var newVariable_9 = list.add(tmp);		}
		
		int answer = 0;
var newVariable_10 = list.size();		for(int i=1; i<newVariable_10-1; i++){
			String[] tmpJ=list.get(i-1);
			String[] tmpO=list.get(i);
			String[] tmpI=list.get(i+1);
var newVariable_11 = tmpO[0].equals("O");			if(newVariable_11){
var newVariable_12 = tmpI[0].equals("I");var newVariable_13 = tmpJ[0].equals("J");				if(tmpI[0].equals("I") && newVariable_13){
var newVariable_14 = Integer.parseInt(tmpI[1]);var newVariable_15 = Integer.parseInt(tmpO[1]);var newVariable_16 = Integer.parseInt(tmpJ[1]);var newVariable_17 = Integer.parseInt(tmpO[1]);					if(Integer.parseInt(tmpI[1])>=newVariable_17 && Integer.parseInt(tmpJ[1])>=newVariable_17){
var newVariable_18 = Integer.parseInt(tmpO[1]);						if(answer<newVariable_18){
							answer = Integer.parseInt(tmpO[1]);
						}
					}
				}
			}
		}
		System.out.println(answer);
	}

}

