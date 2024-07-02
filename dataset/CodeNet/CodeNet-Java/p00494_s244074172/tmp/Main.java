import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String []arg){
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
System.out.println("[INST]7;str;scanner.nextLine();"+str);
		List<String[]> list = new ArrayList<String[]>();
		for(int i=0; i<str.length(); i++){
System.out.println("[INST]9;None;str.length();"+str.length());
			String tmp[] = new String[2];
			int cnt = 1;
			if(str.charAt(i)=='I'){
System.out.println("[INST]12;None;str.charAt(i);"+str.charAt(i));
				tmp[0] = "I";
			}
			else if(str.charAt(i)=='O'){
System.out.println("[INST]15;None;str.charAt(i);"+str.charAt(i));
				tmp[0] = "O";
			}
			else if(str.charAt(i)=='J'){
System.out.println("[INST]18;None;str.charAt(i);"+str.charAt(i));
				tmp[0] = "J";
			}
			if(i<str.length()-1){
System.out.println("[INST]21;None;str.length();"+str.length());
				while(str.charAt(i)==str.charAt(i+1)){
System.out.println("[INST]22;None;str.charAt(i);"+str.charAt(i));
System.out.println("[INST]22;None;str.charAt(i+1);"+str.charAt(i+1));
					cnt++;
					i++;
					if(i==str.length()-1){
System.out.println("[INST]25;None;str.length();"+str.length());
						break;
					}
				}
			}
			tmp[1] = String.valueOf(cnt);
System.out.println("[INST]30;None;String.valueOf(cnt);"+String.valueOf(cnt));
			list.add(tmp);
System.out.println("[INST]31;None;list.add(tmp);"+list.add(tmp));
		}
		
		int answer = 0;
		for(int i=1; i<list.size()-1; i++){
System.out.println("[INST]35;None;list.size();"+list.size());
			String[] tmpJ=list.get(i-1);
System.out.println("[INST]36;tmpJ;list.get(i-1);"+tmpJ);
			String[] tmpO=list.get(i);
System.out.println("[INST]37;tmpO;list.get(i);"+tmpO);
			String[] tmpI=list.get(i+1);
System.out.println("[INST]38;tmpI;list.get(i+1);"+tmpI);
			if(tmpO[0].equals("O")){
System.out.println("[INST]39;None;tmpO[0].equals('O');"+tmpO[0].equals("O"));
				if(tmpI[0].equals("I") && tmpJ[0].equals("J")){
System.out.println("[INST]40;None;tmpI[0].equals('I');"+tmpI[0].equals("I"));
System.out.println("[INST]40;None;tmpJ[0].equals('J');"+tmpJ[0].equals("J"));
					if(Integer.parseInt(tmpI[1])>=Integer.parseInt(tmpO[1]) && Integer.parseInt(tmpJ[1])>=Integer.parseInt(tmpO[1])){
System.out.println("[INST]41;None;Integer.parseInt(tmpI[1]);"+Integer.parseInt(tmpI[1]));
System.out.println("[INST]41;None;Integer.parseInt(tmpO[1]);"+Integer.parseInt(tmpO[1]));
System.out.println("[INST]41;None;Integer.parseInt(tmpJ[1]);"+Integer.parseInt(tmpJ[1]));
System.out.println("[INST]41;None;Integer.parseInt(tmpO[1]);"+Integer.parseInt(tmpO[1]));
						if(answer<Integer.parseInt(tmpO[1])){
System.out.println("[INST]42;None;Integer.parseInt(tmpO[1]);"+Integer.parseInt(tmpO[1]));
							answer = Integer.parseInt(tmpO[1]);
System.out.println("[INST]43;answer;Integer.parseInt(tmpO[1]);"+answer);
						}
					}
				}
			}
		}
		System.out.println(answer);
	}

}

