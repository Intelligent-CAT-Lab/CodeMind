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

		hash.put