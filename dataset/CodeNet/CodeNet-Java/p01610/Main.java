import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	int[] is;
	String line;

	void run(){
		line=sc.next();
		solve();
	}

	void solve(){
		is=new int[24];
		for(int i=0; i<24; i++){
			is[i]=i/4;
		}
//		debug(is);
		for(char c : line.toCharArray()){
			switch(c){
			case 'U':
				up();
				break;
			case 'F':
				front();
				break;
			case 'R':
				right();
				break;
			case 'D':
				down();
				break;
			case 'B':
				back();
				break;
			case 'L':
				left();
				break;
			default:
				break;
			}
		}
		// debug(is);
		int[][] tab={{-1, -1, 0, 1, -1, -1, -1, -1},
				{-1, -1, 3, 2, -1, -1, -1, -1}, {4, 5, 8, 9, 12, 13, 16, 17},
				{7, 6, 11, 10, 15, 14, 19, 18},
				{-1, -1, 20, 21, -1, -1, -1, -1},
				{-1, -1, 23, 22, -1, -1, -1, -1},};
		for(int j=0; j<tab.length; j++){
			for(int i=0; i<tab[j].length; i++){
				print(tab[j][i]==-1?".":"rgybwo".charAt(is[tab[j][i]])+"");
			}
			println("");
		}
	}

	void up(){
		swap(0, 1, 2, 3);
		swap(4, 16, 12, 8);
		swap(5, 17, 13, 9);
	}

	void front(){
		swap(8, 9, 10, 11);
		swap(2, 15, 20, 5);
		swap(3, 12, 21, 6);
	}

	void right(){
		swap(12, 13, 14, 15);
		swap(2, 16, 22, 10);
		swap(1, 19, 21, 9);
	}

	void down(){
		swap(20, 21, 22, 23);
		swap(11, 15, 19, 7);
		swap(10, 14, 18, 6);
	}

	void back(){
		swap(16, 17, 18, 19);
		swap(13, 0, 7, 22);
		swap(14, 1, 4, 23);
	}

	void left(){
		swap(4, 5, 6, 7);
		swap(0, 8, 20, 18);
		swap(3, 11, 23, 17);
	}

	void swap(int a, int b, int c, int d){
		int t=is[d];
		is[d]=is[c];
		is[c]=is[b];
		is[b]=is[a];
		is[a]=t;
	}

	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}