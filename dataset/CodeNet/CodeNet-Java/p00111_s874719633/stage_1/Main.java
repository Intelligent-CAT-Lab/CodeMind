import java.text.Format;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	//2343 cording
	char [] map = {' ', '.', ',', '-', '\'', '?'};
	HashMap<String, Character> map2;
	
	private void doit() {
		init();
		Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.hasNext();		while(newVariable_0){
			String input = sc.nextLine();
			
			StringBuilder s = new StringBuilder(input);
			StringBuilder ss = new StringBuilder();
var newVariable_1 = s.length();			for(int i = 0; i < newVariable_1; i++){
				char c = s.charAt(i);
var newVariable_2 = Character.isLetter(c);				if(newVariable_2 ){
					int temp = c - 'A';
					String temp2 = Integer.toBinaryString(temp);
var newVariable_3 = ss.append(String.format("%05d", Integer.parseInt(temp2)));var newVariable_4 = String.format("%05d", Integer.parseInt(temp2));var newVariable_5 = Integer.parseInt(temp2);					ss.append(String.format("%05d", newVariable_5));
				}
				else{
					int ind = -1;
					for(int j = 0; j < map.length; j++){
						if(map[j] == c){
							ind = j + 'Z' - 'A' + 1;
							break;
						}
					}
var newVariable_6 = ss.append(String.format("%05d", Integer.parseInt(Integer.toBinaryString(ind))));var newVariable_7 = String.format("%05d", Integer.parseInt(Integer.toBinaryString(ind)));var newVariable_8 = Integer.parseInt(Integer.toBinaryString(ind));var newVariable_9 = Integer.toBinaryString(ind);					ss.append(String.format("%05d", Integer.parseInt(newVariable_9)));
				}
			}
			
			StringBuilder sss = new StringBuilder();
			int start = 0;
var newVariable_10 = ss.length();			for(int i = 0; i < newVariable_10; i++){
				String sub = ss.substring(start,i + 1 );
var newVariable_11 = map2.containsKey(sub);				if(newVariable_11){
var newVariable_12 = sss.append(map2.get(sub));var newVariable_13 = map2.get(sub);					sss.append(newVariable_13);
					start = i + 1;
				}
			}
			
			System.out.println(sss.toString());
		}
	}
	
	private void init() {
		map2 = new HashMap<String, Character>();
var newVariable_14 = map2.put("101", ' ');var newVariable_15 = map2.put("000000", '\'');var newVariable_16 = map2.put("000011", ',');var newVariable_17 = map2.put("10010001", '-');var newVariable_18 = map2.put("010001", '.');var newVariable_19 = map2.put("000001", '?');var newVariable_20 = map2.put("100101", 'A');var newVariable_21 = map2.put("10011010", 'B');var newVariable_22 = map2.put("0101", 'C');var newVariable_23 = map2.put("0001", 'D');var newVariable_24 = map2.put("110", 'E');var newVariable_25 = map2.put("01001", 'F');var newVariable_26 = map2.put("10011011", 'G');var newVariable_27 = map2.put("010000", 'H');var newVariable_28 = map2.put("0111", 'I');var newVariable_29 = map2.put("10011000", 'J');var newVariable_30 = map2.put("0110", 'K');var newVariable_31 = map2.put("00100", 'L');var newVariable_32 = map2.put("10011001", 'M');var newVariable_33 = map2.put("10011110", 'N');var newVariable_34 = map2.put("00101", 'O');var newVariable_35 = map2.put("111", 'P');var newVariable_36 = map2.put("10011111", 'Q');var newVariable_37 = map2.put("1000", 'R');var newVariable_38 = map2.put("00110", 'S');var newVariable_39 = map2.put("00111", 'T');var newVariable_40 = map2.put("10011100", 'U');var newVariable_41 = map2.put("10011101", 'V');var newVariable_42 = map2.put("000010", 'W');var newVariable_43 = map2.put("10010010", 'X');var newVariable_44 = map2.put("10010011", 'Y');var newVariable_45 = map2.put("10010000", 'Z');	}

	public static void main(String[] args) {
		new Main().doit();
	}
}