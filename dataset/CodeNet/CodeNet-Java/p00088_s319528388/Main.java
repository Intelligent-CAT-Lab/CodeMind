import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	void run(){

		HashMap<Character, String> hash = new HashMap<Character, String>();

		hash.put(' ',"101");

		hash.put('\'',"000000");

		hash.put(',',"000011");

		hash.put('-',"10010001");

		hash.put('.',"010001");

		hash.put('?',"000001");

		hash.put('A',"100101");

		hash.put('B',"10011010");

		hash.put('C',"0101");

		hash.put('D',"0001");

		hash.put('E',"110");

		hash.put('F',"01001");

		hash.put('G',"10011011");

		hash.put('H',"010000");

		hash.put('I',"0111");

		hash.put('J',"10011000");			

		hash.put('K',"0110");

		hash.put('L',"00100");

		hash.put('M',"10011001");

		hash.put('N',"10011110");

		hash.put('O',"00101");

		hash.put('P',"111");

		hash.put('Q',"10011111");

		hash.put('R',"1000");

		hash.put('S',"00110");

		hash.put('T',"00111");

		hash.put('U',"10011100");

		hash.put('V',"10011101");

		hash.put('W',"000010");

		hash.put('X',"10010010");

		hash.put('Y',"10010011");

		hash.put('Z',"10010000");

		

		HashMap<String, Character> hash2 = new HashMap<String, Character>();

		hash2.put("00000",'A');

		hash2.put("00001",'B');

		hash2.put("00010",'C');

		hash2.put("00011",'D');

		hash2.put("00100",'E');

		hash2.put("00101",'F');

		hash2.put("00110",'G');

		hash2.put("00111",'H');

		hash2.put("01000",'I');

		hash2.put("01001",'J');

		hash2.put("01010",'K');

		hash2.put("01011",'L');

		hash2.put("01100",'M');

		hash2.put("01101",'N');

		hash2.put("01110",'O');

		hash2.put("01111",'P');

		hash2.put("10000",'Q');

		hash2.put("10001",'R');

		hash2.put("10010",'S');

		hash2.put("10011",'T');

		hash2.put("10100",'U');

		hash2.put("10101",'V');

		hash2.put("10110",'W');

		hash2.put("10111",'X');

		hash2.put("11000",'Y');

		hash2.put("11001",'Z');

		hash2.put("11010",' ');

		hash2.put("11011",'.');

		hash2.put("11100",',');

		hash2.put("11101",'-');

		hash2.put("11110",'\'');

		hash2.put("11111",'?');

		

		for(;sc.hasNextLine();){

			String buffer = sc.nextLine();

			String dec ="";

			for(char ch : buffer.toCharArray()){

				dec += hash.get(ch);

			}

			String ret ="";

			for(;dec.length()>0;){

				String st="";

				if(dec.length()>5){

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