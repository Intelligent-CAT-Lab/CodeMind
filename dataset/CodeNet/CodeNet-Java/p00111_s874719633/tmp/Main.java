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
		while(sc.hasNext()){
System.out.println("[INST]12;None;sc.hasNext();"+sc.hasNext());
			String input = sc.nextLine();
System.out.println("[INST]13;input;sc.nextLine();"+input);
			
			StringBuilder s = new StringBuilder(input);
			StringBuilder ss = new StringBuilder();
			for(int i = 0; i < s.length(); i++){
System.out.println("[INST]17;None;s.length();"+s.length());
				char c = s.charAt(i);
System.out.println("[INST]18;c;s.charAt(i);"+c);
				if(Character.isLetter(c) ){
System.out.println("[INST]19;None;Character.isLetter(c);"+Character.isLetter(c));
					int temp = c - 'A';
					String temp2 = Integer.toBinaryString(temp);
System.out.println("[INST]21;temp2;Integer.toBinaryString(temp);"+temp2);
					ss.append(String.format("%05d", Integer.parseInt(temp2)));
System.out.println("[INST]22;None;ss.append(String.format('%05d', Integer.parseInt(temp2)));"+ss.append(String.format("%05d", Integer.parseInt(temp2))));
System.out.println("[INST]22;None;String.format('%05d', Integer.parseInt(temp2));"+String.format("%05d", Integer.parseInt(temp2)));
System.out.println("[INST]22;None;Integer.parseInt(temp2);"+Integer.parseInt(temp2));
				}
				else{
					int ind = -1;
					for(int j = 0; j < map.length; j++){
						if(map[j] == c){
							ind = j + 'Z' - 'A' + 1;
							break;
						}
					}
					ss.append(String.format("%05d", Integer.parseInt(Integer.toBinaryString(ind))));
System.out.println("[INST]32;None;ss.append(String.format('%05d', Integer.parseInt(Integer.toBinaryString(ind))));"+ss.append(String.format("%05d", Integer.parseInt(Integer.toBinaryString(ind)))));
System.out.println("[INST]32;None;String.format('%05d', Integer.parseInt(Integer.toBinaryString(ind)));"+String.format("%05d", Integer.parseInt(Integer.toBinaryString(ind))));
System.out.println("[INST]32;None;Integer.parseInt(Integer.toBinaryString(ind));"+Integer.parseInt(Integer.toBinaryString(ind)));
System.out.println("[INST]32;None;Integer.toBinaryString(ind);"+Integer.toBinaryString(ind));
				}
			}
			
			StringBuilder sss = new StringBuilder();
			int start = 0;
			for(int i = 0; i < ss.length(); i++){
System.out.println("[INST]38;None;ss.length();"+ss.length());
				String sub = ss.substring(start,i + 1 );
System.out.println("[INST]39;sub;ss.substring(start,i + 1 );"+sub);
				if(map2.containsKey(sub)){
System.out.println("[INST]40;None;map2.containsKey(sub);"+map2.containsKey(sub));
					sss.append(map2.get(sub));
System.out.println("[INST]41;None;sss.append(map2.get(sub));"+sss.append(map2.get(sub)));
System.out.println("[INST]41;None;map2.get(sub);"+map2.get(sub));
					start = i + 1;
				}
			}
			
			System.out.println(sss.toString());
		}
	}
	
	private void init() {
		map2 = new HashMap<String, Character>();
		map2.put("101", ' ');
System.out.println("[INST]52;None;map2.put('101', ' ');"+map2.put("101", ' '));
		map2.put("000000", '\'');
System.out.println("[INST]53;None;map2.put('000000', '\'');"+map2.put("000000", '\''));
		map2.put("000011", ',');
System.out.println("[INST]54;None;map2.put('000011', ',');"+map2.put("000011", ','));
		map2.put("10010001", '-');
System.out.println("[INST]55;None;map2.put('10010001', '-');"+map2.put("10010001", '-'));
		map2.put("010001", '.');
System.out.println("[INST]56;None;map2.put('010001', '.');"+map2.put("010001", '.'));
		map2.put("000001", '?');
System.out.println("[INST]57;None;map2.put('000001', '?');"+map2.put("000001", '?'));
		map2.put("100101", 'A');
System.out.println("[INST]58;None;map2.put('100101', 'A');"+map2.put("100101", 'A'));
		map2.put("10011010", 'B');
System.out.println("[INST]59;None;map2.put('10011010', 'B');"+map2.put("10011010", 'B'));
		map2.put("0101", 'C');
System.out.println("[INST]60;None;map2.put('0101', 'C');"+map2.put("0101", 'C'));
		map2.put("0001", 'D');
System.out.println("[INST]61;None;map2.put('0001', 'D');"+map2.put("0001", 'D'));
		map2.put("110", 'E');
System.out.println("[INST]62;None;map2.put('110', 'E');"+map2.put("110", 'E'));
		map2.put("01001", 'F');
System.out.println("[INST]63;None;map2.put('01001', 'F');"+map2.put("01001", 'F'));
		map2.put("10011011", 'G');
System.out.println("[INST]64;None;map2.put('10011011', 'G');"+map2.put("10011011", 'G'));
		map2.put("010000", 'H');
System.out.println("[INST]65;None;map2.put('010000', 'H');"+map2.put("010000", 'H'));
		map2.put("0111", 'I');
System.out.println("[INST]66;None;map2.put('0111', 'I');"+map2.put("0111", 'I'));
		map2.put("10011000", 'J');
System.out.println("[INST]67;None;map2.put('10011000', 'J');"+map2.put("10011000", 'J'));
		map2.put("0110", 'K');
System.out.println("[INST]68;None;map2.put('0110', 'K');"+map2.put("0110", 'K'));
		map2.put("00100", 'L');
System.out.println("[INST]69;None;map2.put('00100', 'L');"+map2.put("00100", 'L'));
		map2.put("10011001", 'M');
System.out.println("[INST]70;None;map2.put('10011001', 'M');"+map2.put("10011001", 'M'));
		map2.put("10011110", 'N');
System.out.println("[INST]71;None;map2.put('10011110', 'N');"+map2.put("10011110", 'N'));
		map2.put("00101", 'O');
System.out.println("[INST]72;None;map2.put('00101', 'O');"+map2.put("00101", 'O'));
		map2.put("111", 'P');
System.out.println("[INST]73;None;map2.put('111', 'P');"+map2.put("111", 'P'));
		map2.put("10011111", 'Q');
System.out.println("[INST]74;None;map2.put('10011111', 'Q');"+map2.put("10011111", 'Q'));
		map2.put("1000", 'R');
System.out.println("[INST]75;None;map2.put('1000', 'R');"+map2.put("1000", 'R'));
		map2.put("00110", 'S');
System.out.println("[INST]76;None;map2.put('00110', 'S');"+map2.put("00110", 'S'));
		map2.put("00111", 'T');
System.out.println("[INST]77;None;map2.put('00111', 'T');"+map2.put("00111", 'T'));
		map2.put("10011100", 'U');
System.out.println("[INST]78;None;map2.put('10011100', 'U');"+map2.put("10011100", 'U'));
		map2.put("10011101", 'V');
System.out.println("[INST]79;None;map2.put('10011101', 'V');"+map2.put("10011101", 'V'));
		map2.put("000010", 'W');
System.out.println("[INST]80;None;map2.put('000010', 'W');"+map2.put("000010", 'W'));
		map2.put("10010010", 'X');
System.out.println("[INST]81;None;map2.put('10010010', 'X');"+map2.put("10010010", 'X'));
		map2.put("10010011", 'Y');
System.out.println("[INST]82;None;map2.put('10010011', 'Y');"+map2.put("10010011", 'Y'));
		map2.put("10010000", 'Z');
System.out.println("[INST]83;None;map2.put('10010000', 'Z');"+map2.put("10010000", 'Z'));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}