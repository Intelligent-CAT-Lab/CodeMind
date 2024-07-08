import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	void run(){

		HashMap<Character, String> hash = new HashMap<Character, String>();

var newVariable_0 = hash.put(' ',"101");
var newVariable_1 = hash.put('\'',"000000");
var newVariable_2 = hash.put(',',"000011");
var newVariable_3 = hash.put('-',"10010001");
var newVariable_4 = hash.put('.',"010001");
var newVariable_5 = hash.put('?',"000001");
var newVariable_6 = hash.put('A',"100101");
var newVariable_7 = hash.put('B',"10011010");
var newVariable_8 = hash.put('C',"0101");
var newVariable_9 = hash.put('D',"0001");
var newVariable_10 = hash.put('E',"110");
var newVariable_11 = hash.put('F',"01001");
var newVariable_12 = hash.put('G',"10011011");
var newVariable_13 = hash.put('H',"010000");
var newVariable_14 = hash.put('I',"0111");
var newVariable_15 = hash.put('J',"10011000");
var newVariable_16 = hash.put('K',"0110");
var newVariable_17 = hash.put('L',"00100");
var newVariable_18 = hash.put('M',"10011001");
var newVariable_19 = hash.put('N',"10011110");
var newVariable_20 = hash.put('O',"00101");
var newVariable_21 = hash.put('P',"111");
var newVariable_22 = hash.put('Q',"10011111");
var newVariable_23 = hash.put('R',"1000");
var newVariable_24 = hash.put('S',"00110");
var newVariable_25 = hash.put('T',"00111");
var newVariable_26 = hash.put('U',"10011100");
var newVariable_27 = hash.put('V',"10011101");
var newVariable_28 = hash.put('W',"000010");
var newVariable_29 = hash.put('X',"10010010");
var newVariable_30 = hash.put('Y',"10010011");
var newVariable_31 = hash.put('Z',"10010000");
		

		HashMap<String, Character> hash2 = new HashMap<String, Character>();

var newVariable_32 = hash2.put("00000",'A');
var newVariable_33 = hash2.put("00001",'B');
var newVariable_34 = hash2.put("00010",'C');
var newVariable_35 = hash2.put("00011",'D');
var newVariable_36 = hash2.put("00100",'E');
var newVariable_37 = hash2.put("00101",'F');
var newVariable_38 = hash2.put("00110",'G');
var newVariable_39 = hash2.put("00111",'H');
var newVariable_40 = hash2.put("01000",'I');
var newVariable_41 = hash2.put("01001",'J');
var newVariable_42 = hash2.put("01010",'K');
var newVariable_43 = hash2.put("01011",'L');
var newVariable_44 = hash2.put("01100",'M');
var newVariable_45 = hash2.put("01101",'N');
var newVariable_46 = hash2.put("01110",'O');
var newVariable_47 = hash2.put("01111",'P');
var newVariable_48 = hash2.put("10000",'Q');
var newVariable_49 = hash2.put("10001",'R');
var newVariable_50 = hash2.put("10010",'S');
var newVariable_51 = hash2.put("10011",'T');
var newVariable_52 = hash2.put("10100",'U');
var newVariable_53 = hash2.put("10101",'V');
var newVariable_54 = hash2.put("10110",'W');
var newVariable_55 = hash2.put("10111",'X');
var newVariable_56 = hash2.put("11000",'Y');
var newVariable_57 = hash2.put("11001",'Z');
var newVariable_58 = hash2.put("11010",' ');
var newVariable_59 = hash2.put("11011",'.');
var newVariable_60 = hash2.put("11100",',');
var newVariable_61 = hash2.put("11101",'-');
var newVariable_62 = hash2.put("11110",'\'');
var newVariable_63 = hash2.put("11111",'?');
		

var newVariable_64 = sc.hasNextLine();		for(;newVariable_64;){

			String buffer = sc.nextLine();

			String dec ="";

var newVariable_65 = buffer.toCharArray();			for(char ch : newVariable_65){

				dec += hash.get(ch);

			}

			String ret ="";

var newVariable_66 = dec.length();			for(;newVariable_66>0;){

				String st="";

var newVariable_67 = dec.length();				if(newVariable_67>5){

					st = dec.substring(0,5);

					dec = dec.substring(5);

				}else{

					st = (dec+"00000").substring(0,5);

					dec = "";

				}

				ret += hash2.get(st);

			}

			System.out.println(ret);

		}

	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}