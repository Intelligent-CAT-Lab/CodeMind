import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) { //Simply store all segment starts and ends 
		//in array list and iterate through all possibilities accordingly
		Scanner input = new Scanner(System.in);
		long N = input.nextLong();
		long cnt = N/11; //5+6 alternating while N>=11
		cnt*=2;
		N%=11;
		while (N>0) {
			if (cnt%2==0) N-=6;
			else N-=5;
			cnt++;
		}
		System.out.println(cnt);
	}
}