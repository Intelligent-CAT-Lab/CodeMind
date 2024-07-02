import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	void run(){

		HashMap<Character, String> hash = new HashMap<Character, String>();

		hash.put(' ',"101");
System.out.println("[INST]18;None;hash.put(' ','101');"+hash.put(' ',"101"));

		hash.put('\'',"000000");
System.out.println("[INST]20;None;hash.put('\'','000000');"+hash.put('\'',"000000"));

		hash.put(',',"000011");
System.out.println("[INST]22;None;hash.put(',','000011');"+hash.put(',',"000011"));

		hash.put('-',"10010001");
System.out.println("[INST]24;None;hash.put('-','10010001');"+hash.put('-',"10010001"));

		hash.put('.',"010001");
System.out.println("[INST]26;None;hash.put('.','010001');"+hash.put('.',"010001"));

		hash.put('?',"000001");
System.out.println("[INST]28;None;hash.put('?','000001');"+hash.put('?',"000001"));

		hash.put('A',"100101");
System.out.println("[INST]30;None;hash.put('A','100101');"+hash.put('A',"100101"));

		hash.put('B',"10011010");
System.out.println("[INST]32;None;hash.put('B','10011010');"+hash.put('B',"10011010"));

		hash.put('C',"0101");
System.out.println("[INST]34;None;hash.put('C','0101');"+hash.put('C',"0101"));

		hash.put('D',"0001");
System.out.println("[INST]36;None;hash.put('D','0001');"+hash.put('D',"0001"));

		hash.put('E',"110");
System.out.println("[INST]38;None;hash.put('E','110');"+hash.put('E',"110"));

		hash.put('F',"01001");
System.out.println("[INST]40;None;hash.put('F','01001');"+hash.put('F',"01001"));

		hash.put('G',"10011011");
System.out.println("[INST]42;None;hash.put('G','10011011');"+hash.put('G',"10011011"));

		hash.put('H',"010000");
System.out.println("[INST]44;None;hash.put('H','010000');"+hash.put('H',"010000"));

		hash.put('I',"0111");
System.out.println("[INST]46;None;hash.put('I','0111');"+hash.put('I',"0111"));

		hash.put('J',"10011000");			
System.out.println("[INST]48;None;hash.put('J','10011000');"+hash.put('J',"10011000"));

		hash.put('K',"0110");
System.out.println("[INST]50;None;hash.put('K','0110');"+hash.put('K',"0110"));

		hash.put('L',"00100");
System.out.println("[INST]52;None;hash.put('L','00100');"+hash.put('L',"00100"));

		hash.put('M',"10011001");
System.out.println("[INST]54;None;hash.put('M','10011001');"+hash.put('M',"10011001"));

		hash.put('N',"10011110");
System.out.println("[INST]56;None;hash.put('N','10011110');"+hash.put('N',"10011110"));

		hash.put('O',"00101");
System.out.println("[INST]58;None;hash.put('O','00101');"+hash.put('O',"00101"));

		hash.put('P',"111");
System.out.println("[INST]60;None;hash.put('P','111');"+hash.put('P',"111"));

		hash.put('Q',"10011111");
System.out.println("[INST]62;None;hash.put('Q','10011111');"+hash.put('Q',"10011111"));

		hash.put('R',"1000");
System.out.println("[INST]64;None;hash.put('R','1000');"+hash.put('R',"1000"));

		hash.put('S',"00110");
System.out.println("[INST]66;None;hash.put('S','00110');"+hash.put('S',"00110"));

		hash.put('T',"00111");
System.out.println("[INST]68;None;hash.put('T','00111');"+hash.put('T',"00111"));

		hash.put('U',"10011100");
System.out.println("[INST]70;None;hash.put('U','10011100');"+hash.put('U',"10011100"));

		hash.put('V',"10011101");
System.out.println("[INST]72;None;hash.put('V','10011101');"+hash.put('V',"10011101"));

		hash.put('W',"000010");
System.out.println("[INST]74;None;hash.put('W','000010');"+hash.put('W',"000010"));

		hash.put('X',"10010010");
System.out.println("[INST]76;None;hash.put('X','10010010');"+hash.put('X',"10010010"));

		hash.put('Y',"10010011");
System.out.println("[INST]78;None;hash.put('Y','10010011');"+hash.put('Y',"10010011"));

		hash.put('Z',"10010000");
System.out.println("[INST]80;None;hash.put('Z','10010000');"+hash.put('Z',"10010000"));

		

		HashMap<String, Character> hash2 = new HashMap<String, Character>();

		hash2.put("00000",'A');
System.out.println("[INST]86;None;hash2.put('00000','A');"+hash2.put("00000",'A'));

		hash2.put("00001",'B');
System.out.println("[INST]88;None;hash2.put('00001','B');"+hash2.put("00001",'B'));

		hash2.put("00010",'C');
System.out.println("[INST]90;None;hash2.put('00010','C');"+hash2.put("00010",'C'));

		hash2.put("00011",'D');
System.out.println("[INST]92;None;hash2.put('00011','D');"+hash2.put("00011",'D'));

		hash2.put("00100",'E');
System.out.println("[INST]94;None;hash2.put('00100','E');"+hash2.put("00100",'E'));

		hash2.put("00101",'F');
System.out.println("[INST]96;None;hash2.put('00101','F');"+hash2.put("00101",'F'));

		hash2.put("00110",'G');
System.out.println("[INST]98;None;hash2.put('00110','G');"+hash2.put("00110",'G'));

		hash2.put("00111",'H');
System.out.println("[INST]100;None;hash2.put('00111','H');"+hash2.put("00111",'H'));

		hash2.put("01000",'I');
System.out.println("[INST]102;None;hash2.put('01000','I');"+hash2.put("01000",'I'));

		hash2.put("01001",'J');
System.out.println("[INST]104;None;hash2.put('01001','J');"+hash2.put("01001",'J'));

		hash2.put("01010",'K');
System.out.println("[INST]106;None;hash2.put('01010','K');"+hash2.put("01010",'K'));

		hash2.put("01011",'L');
System.out.println("[INST]108;None;hash2.put('01011','L');"+hash2.put("01011",'L'));

		hash2.put("01100",'M');
System.out.println("[INST]110;None;hash2.put('01100','M');"+hash2.put("01100",'M'));

		hash2.put("01101",'N');
System.out.println("[INST]112;None;hash2.put('01101','N');"+hash2.put("01101",'N'));

		hash2.put("01110",'O');
System.out.println("[INST]114;None;hash2.put('01110','O');"+hash2.put("01110",'O'));

		hash2.put("01111",'P');
System.out.println("[INST]116;None;hash2.put('01111','P');"+hash2.put("01111",'P'));

		hash2.put("10000",'Q');
System.out.println("[INST]118;None;hash2.put('10000','Q');"+hash2.put("10000",'Q'));

		hash2.put("10001",'R');
System.out.println("[INST]120;None;hash2.put('10001','R');"+hash2.put("10001",'R'));

		hash2.put("10010",'S');
System.out.println("[INST]122;None;hash2.put('10010','S');"+hash2.put("10010",'S'));

		hash2.put("10011",'T');
System.out.println("[INST]124;None;hash2.put('10011','T');"+hash2.put("10011",'T'));

		hash2.put("10100",'U');
System.out.println("[INST]126;None;hash2.put('10100','U');"+hash2.put("10100",'U'));

		hash2.put("10101",'V');
System.out.println("[INST]128;None;hash2.put('10101','V');"+hash2.put("10101",'V'));

		hash2.put("10110",'W');
System.out.println("[INST]130;None;hash2.put('10110','W');"+hash2.put("10110",'W'));

		hash2.put("10111",'X');
System.out.println("[INST]132;None;hash2.put('10111','X');"+hash2.put("10111",'X'));

		hash2.put("11000",'Y');
System.out.println("[INST]134;None;hash2.put('11000','Y');"+hash2.put("11000",'Y'));

		hash2.put("11001",'Z');
System.out.println("[INST]136;None;hash2.put('11001','Z');"+hash2.put("11001",'Z'));

		hash2.put("11010",' ');
System.out.println("[INST]138;None;hash2.put('11010',' ');"+hash2.put("11010",' '));

		hash2.put("11011",'.');
System.out.println("[INST]140;None;hash2.put('11011','.');"+hash2.put("11011",'.'));

		hash2.put("11100",',');
System.out.println("[INST]142;None;hash2.put('11100',',');"+hash2.put("11100",','));

		hash2.put("11101",'-');
System.out.println("[INST]144;None;hash2.put('11101','-');"+hash2.put("11101",'-'));

		hash2.put("11110",'\'');
System.out.println("[INST]146;None;hash2.put('11110','\'');"+hash2.put("11110",'\''));

		hash2.put("11111",'?');
System.out.println("[INST]148;None;hash2.put('11111','?');"+hash2.put("11111",'?'));

		

		for(;sc.hasNextLine();){
System.out.println("[INST]152;None;sc.hasNextLine();"+sc.hasNextLine());

			String buffer = sc.nextLine();
System.out.println("[INST]154;buffer;sc.nextLine();"+buffer);

			String dec ="";

			for(char ch : buffer.toCharArray()){
System.out.println("[INST]158;None;buffer.toCharArray();"+buffer.toCharArray());

				dec += hash.get(ch);
System.out.println("[INST]160;dec;hash.get(ch);"+dec);

			}

			String ret ="";

			for(;dec.length()>0;){
System.out.println("[INST]166;None;dec.length();"+dec.length());

				String st="";

				if(dec.length()>5){
System.out.println("[INST]170;None;dec.length();"+dec.length());

					st = dec.substring(0,5);
System.out.println("[INST]172;st;dec.substring(0,5);"+st);

					dec = dec.substring(5);
System.out.println("[INST]174;dec;dec.substring(5);"+dec);

				}else{

					st = (dec+"00000").substring(0,5);
System.out.println("[INST]178;st;(dec+'00000').substring(0,5);"+st);

					dec = "";

				}

				ret += hash2.get(st);
System.out.println("[INST]184;ret;hash2.get(st);"+ret);

			}

			System.out.println(ret);

		}

	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}