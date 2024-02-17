import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String []arg){
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		List<String[]> list = new ArrayList<String[]>();
		for(int i=0; i<str.length(); i++){
			String tmp[] = new String[2];
			int cnt = 1;
			if(str.charAt(i)=='I'){
				tmp[0] = "I";
			}
			else if(str.charAt(i)=='O'){
				tmp[0] = "O";
			}
			else if(str.charAt(i)=='J'){
				tmp[0] = "J";
			}
			if(i<str.length()-1){
				while(str.charAt(i)==str.charAt(i+1)){
					cnt++;
					i++;
					if(i==str.length()-1){
						break;
					}
				}
			}
			tmp[1] = String.valueOf(cnt);
			list.add(tmp);
		}
		
		int answer = 0;
		for(int i=1; i<list.size()-1; i++){
			String[] tmpJ=list.get(i-1);
			String[] tmpO=list.get(i);
			String[] tmpI=list.get(i+1);
			if(tmpO[0].equals("O")){
				if(tmpI[0].equals("I") && tmpJ[0].equals("J")){
					if(Integer.parseInt(tmpI[1])>=Integer.parseInt(tmpO[1]) && Integer.parseInt(tmpJ[1])>=Integer.parseInt(tmpO[1])){
						if(answer<Integer.parseInt(tmpO[1])){
							answer = Integer.parseInt(tmpO[1]);
						}
					}
				}
			}
		}
		System.out.println(answer);
	}

}

