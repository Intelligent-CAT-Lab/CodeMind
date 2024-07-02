import java.awt.geom.*;
import java.io.*;
import java.util.*;


public class Main {
	ArrayList<Long> list, list2;

	private void doit(){
		Scanner sc = new Scanner(System.in);
		//test();
		init();
		while(sc.hasNext()){
System.out.println("[INST]12;None;sc.hasNext();"+sc.hasNext());
			long n = sc.nextLong();
System.out.println("[INST]13;n;sc.nextLong();"+n);
			int ind = binarySearch(n); //ind is digit + 1
			StringBuilder sb = new StringBuilder();
			
			long mid = 0, left = list2.get(ind), right = list2.get(ind + 1);
System.out.println("[INST]17;left;list2.get(ind);"+left);
System.out.println("[INST]17;right;list2.get(ind + 1);"+right);
			long res = 1 << 24;
			while(left <= right){
				mid = (left + right) / 2;
				res = calc(mid-1, list2.get(ind), ind+1)+1;
System.out.println("[INST]21;None;list2.get(ind);"+list2.get(ind));
				//System.out.println("list= " +list2.get(ind) + "keta = " + (ind+1));
				//System.out.println("mid = " + mid+ "res = " + res + " left = " + left + " right = " + right );
				if(res == n){
					break;
				}
				if(res < n){
					left = mid + 1;
				}
				else{
					right = mid - 1;
				}
			}
			if(res != n){
				mid = right;
			}
			res = calc(mid-1, list2.get(ind), ind+1)+1;
System.out.println("[INST]37;None;list2.get(ind);"+list2.get(ind));
			//System.out.println("res = " + res + "mid = " + mid);
			long value = n - res;
			for(long i = mid; ; i++){
				if(i % 15 == 0){
					sb.append("FizzBuzz");
System.out.println("[INST]42;None;sb.append('FizzBuzz');"+sb.append("FizzBuzz"));
				}
				else if(i % 3 == 0){
					sb.append("Fizz");
System.out.println("[INST]45;None;sb.append('Fizz');"+sb.append("Fizz"));
				}
				else if(i% 5 == 0){
					sb.append("Buzz");
System.out.println("[INST]48;None;sb.append('Buzz');"+sb.append("Buzz"));
				}
				else{
					sb.append(i + "");
System.out.println("[INST]51;None;sb.append(i + '');"+sb.append(i + ""));
				}
				if(sb.length()>= value + 20){
System.out.println("[INST]53;None;sb.length();"+sb.length());
					break;
				}
			}
			//System.out.println(value);
			System.out.println(sb.substring((int) value, (int)value + 20));
//			for(int i = 0; i < 10; i++){
//				System.out.println(list.get(i));
//			}
		}
	}

	private long calc(long b, long a, int digit) {
	
		long diff = b - a + 1;
		long fizz = b / 3 - (a-1) / 3;
		long buzz = b / 5 - (a-1) / 5;
		long fizzbuzz = b / 15 - (a-1) / 15;
		long sum = digit * diff - fizz * digit + fizz * 4 - buzz * digit + buzz * 4 + digit * fizzbuzz;
		return sum + list.get(digit - 1) - 1;
System.out.println("[INST]72;None;list.get(digit - 1);"+list.get(digit - 1));
	}

	private int binarySearch(long patt){
		int mid, left = 0, right = list.size()-1;
System.out.println("[INST]76;None;list.size();"+list.size());
		while(left <= right){
			mid = (left + right) / 2;
			if(list.get(mid) == patt){
System.out.println("[INST]79;None;list.get(mid);"+list.get(mid));
				return mid;
			}
			if(list.get(mid) < patt){
System.out.println("[INST]82;None;list.get(mid);"+list.get(mid));
				left = mid + 1;
			}
			else{
				right = mid - 1;
			}
		}
		return right;
	}

	private void test() {
		StringBuilder sb = new StringBuilder();
		for(int i = 1 ; i < 101; i++){
			if(i % 15 == 0){
				sb.append("fizzbuzz");
System.out.println("[INST]96;None;sb.append('fizzbuzz');"+sb.append("fizzbuzz"));
			}
			else if(i % 3 == 0){
				sb.append("fizz");
System.out.println("[INST]99;None;sb.append('fizz');"+sb.append("fizz"));
			}
			else if(i % 5 == 0){
				sb.append("buzz");
System.out.println("[INST]102;None;sb.append('buzz');"+sb.append("buzz"));
			}
			else{
				sb.append(i);
System.out.println("[INST]105;None;sb.append(i);"+sb.append(i));
			}
			//System.out.println(sb.toString());
			//            if(i == 10){
			//                System.out.println(sb.length());
			//            }
		}
		//System.out.println(sb.toString());
		System.out.println(sb.substring(310 - 1));
		System.out.println("len = " + sb.length());

	}
	private void init() {
		list = new ArrayList<Long>();
		list2 = new ArrayList<Long>();
		list.add(1L);
System.out.println("[INST]120;None;list.add(1L);"+list.add(1L));
		list2.add(1L);
System.out.println("[INST]121;None;list2.add(1L);"+list2.add(1L));
		for(long i = 10, digit = 1; digit < 18; i *= 10, digit++){
			long now = i - 1;
			long prev = (i / 10) - 1;
			long diff = now - (prev +1) + 1;
			long fizz = now / 3 - prev / 3;
			long buzz = now / 5 - prev / 5;
			long fizzbuzz = now / 15 - prev / 15;
			long sum = digit * diff - fizz * digit + fizz * 4 - buzz * digit + buzz * 4 + digit * fizzbuzz;
			long res = sum + list.get((int)digit - 1) - 1;
System.out.println("[INST]130;None;list.get((int)digit - 1);"+list.get((int)digit - 1));
			list.add(res + 1);
System.out.println("[INST]131;None;list.add(res + 1);"+list.add(res + 1));
			list2.add(i);
System.out.println("[INST]132;None;list2.add(i);"+list2.add(i));
		}
	}
	public static void main(String [] args){
		new Main().doit();
	}
}