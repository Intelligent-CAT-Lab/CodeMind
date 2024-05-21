import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	// Returns value of Binomial Coefficient C(n, k)
	static long nCr(long n, long k)
	{
		long res = 1;
		
		// Since C(n, k) = C(n, n-k)
		if (k > n - k)
			k = n - k;
		
		// Calculate value of
		// [n * (n-1) *---* (n-k+1)] / [k * (k-1) *----* 1]
		for (int i = 0; i < k; ++i)
		{
			res *= (n - i);
			res /= (i + 1);
		}
		
		return res;
	}
	
	// A utility function to find the minimum of two
	// integers
	static long min(long a, long b)
	{
		return (a < b)? a : b;
	}
	
	// Returns the number of squares in the rectangle
	// formed by points (ax, ay) and (bx, by)
	static long countSquares(long w, long h, long ax, long ay, long bx, long by)
	{
		// Calculate the distance between the points
		// (ax, ay) and (bx, by)
		long dx = min(w - Math.abs(ax - bx), Math.abs(ax - bx));
		long dy = min(h - Math.abs(ay - by), Math.abs(ay - by));
		
		// Calculate the total number of squares
		long ans = nCr(dx + dy, dx);
		
		// If both dimensions of the rectangle are
		// even, then there are 4 times as many
		// squares as calculated above
		if (dx * 2 == w)
			ans *= 2;
		
		if (dy * 2 == h)
			ans *= 2;
		
		// Return the final answer
		return ans % 100000007;
	}
	
	// Driver code
	public static void main (String[] args) throws java.lang.Exception
	{
		// Scanner object
		Scanner sc = new Scanner(System.in);
		
		// Read the four integers w, h, ax, ay
		long w = sc.nextLong();
		long h = sc.nextLong();
		long ax = sc.nextLong();
		long ay = sc.nextLong();
		long bx = sc.nextLong();
		long by = sc.nextLong();
		
		// Print the number of squares
		System.out.println(countSquares(w, h, ax, ay, bx, by));
	}
}