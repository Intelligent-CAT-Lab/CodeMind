import java.io.*;
import java.util.*;

class Main {

    void solve(){

	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt(), k = sc.nextInt();

	int res = 0;
	int row = 1;
	int w = 0;
	while ( n >= row ) {
	    if ( row*k >= w ) {
		++res;
		w += row;
		n -= row;
	    }
	    else if ( n >= row+1 ) ++row;
	    else break;
	}
    
	System.out.println( res );
    }

    public static void main(String[] a) { new Main().solve(); }
}

