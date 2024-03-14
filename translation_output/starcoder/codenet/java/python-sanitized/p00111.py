import java.util.*;

import java.lang.*;

import java.math.*;



public class p00111 {

	Scanner sc = new Scanner(System.in);



	class scH extends HashMap<String, Character> {

		public Character put(Character value, String key) {

			// TODO Auto-generated method stub

			return super.put(key, value);

		}

	}



	class scH2 extends HashMap<Character, String> {

		public String put(String value, Character key) {

			// TODO Auto-generated method stub

			return super.put(key, value);

		}

	}



	void run() {

		scH hash = new scH();

		// HashMap<Character, String> hash = new HashMap<Character, String>();

		hash.put(' ', "101");

		hash.put('\'', "000000");

		hash.put(',', "000011");

		hash.put('-', "10010001");

		hash.put('.', "010001");

		hash.put('?', "000001");

		hash.put('A', "100101");

		hash.put('B', "10011010");

		hash.put('C', "0101");

		hash.put('D', "0001");

		hash.put('E', "110");

		hash.put('F', "01001");

		hash.put('G', "10011011");

		hash.put('H', "010000");

		hash.put('I', "0111");

		hash.put('J', "10011000");

		hash.put('K', "0110");

		hash.put('L', "00100");

		hash.put('M', "10011001");

		hash.put('N', "10011110");

		hash.put('O', "00101");

		hash.put('P', "111");

		hash.put('Q', "10011111");

		hash.put('R', "1000");

		hash.put('S', "00110");

		hash.put('T', "00111");

		hash.put('U', "10011100");

		hash.put('V', "1