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
			String input = sc.nextLine();
			
			StringBuilder s = new StringBuilder(input);
			StringBuilder ss = new StringBuilder();
			for(int i = 0; i < s.length(); i++){
				char c = s.charAt(i);
				if(Character.isLetter(c) ){
					int temp = c - 'A';
					String temp2 = Integer.toBinaryString(temp);
					ss.append(String.format("%05d", Integer.parseInt(temp2)));
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
				}
			}
			
			StringBuilder sss = new StringBuilder();
			int start = 0;
			for(int i = 0; i < ss.length(); i++){
				String sub = ss.substring(start,i + 1 );
				if(map2.containsKey(sub)){
					sss.append(map2.get(sub));
					start = i + 1;
				}
			}
			
			System.out.println(sss.toString());
		}
	}
	
	private void init() {
		map2 = new HashMap<String, Character>();
		map2.put("101", ' ');
		map2.put("000000", '\'');
		map2.put("000011", ',');
		map2.put("10010001", '-');
		map2.put("010001", '.');
		map2.put("000001", '?');
		map2.put("100101", 'A');
		map2.put("10011010", 'B');
		map2.put("0101", 'C');
		map2.put("0001", 'D');
		map2.put("110", 'E');
		map2.put("01001", 'F');
		map2.put("10011011", 'G');
		map2.put("010000", 'H');
		map2.put("0111", 'I');
		map2.put("10011000", 'J');
		map2.put("0110", 'K');
		map2.put("00100", 'L');
		map2.put("10011001", 'M');
		map2.put("10011110", 'N');
		map2.put("00101", 'O');
		map2.put("111", 'P');
		map2.put("10011111", 'Q');
		map2.put("1000", 'R');
		map2.put("00110", 'S');
		map2.put("00111", 'T');
		map2.put("10011100", 'U');
		map2.put("10011101", 'V');
		map2.put("000010", 'W');
		map2.put("10010010", 'X');
		map2.put("10010011", 'Y');
		map2.put("10010000", 'Z');
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}