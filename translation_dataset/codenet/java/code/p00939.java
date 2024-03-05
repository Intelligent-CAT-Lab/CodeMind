import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.StringTokenizer;
import java.util.TreeMap;
 
public class p00939 {
	
	// sum ????????¶????????????, prod ?????????????????¨???????????????.
	public static long lower_prod(final int n, final int deep, String value, final int rest_sum, final long cur_prod, final long s_prod, final int upper_val, int[] using_values, HashMap<Long, Long> memoized, HashSet<String> same_number){
		final int trial = n - deep;
		//System.out.println(trial + " " + rest_sum + " " + cur_prod + " " + s_prod);
		
		if(trial == 0){
			if(!memoized.containsKey(cur_prod)){
				memoized.put(cur_prod, 0l);
			}
			
			long ret = 1;
			
			if(rest_sum > 0){
				ret = 0;
			}else if(cur_prod >= s_prod){
				if(cur_prod == s_prod){ same_number.add(value); }
				ret = 0;
			}else{
				for(int i = 1; i <= n; i++){ ret *= i; }
				for(int i = 0; i < 10; i++){
					for(int j = 1; j <= using_values[i]; j++){
						ret /= j;
					}
				}
			}
			
			return memoized.put(cur_prod, memoized.get(cur_prod) + ret);
		}
		
		long ret = 0;
		for(int use_value = upper_val; use_value >= 0; use_value--){
			if(cur_prod * (use_value + 1) > s_prod){ continue; }
			if(rest_sum - use_value < 0){ continue; }
			
			using_values[use_value]++;
			ret += lower_prod(n, deep + 1, value + use_value, rest_sum - use_value, cur_prod * (use_value + 1), s_prod, use_value, using_values, memoized, same_number);
			using_values[use_value]--;
		}
		
		return ret;
	}
	
	public static long lower_number(final int n, final int deep, int[] s_part, int[] rest_values){
		if(deep == n){ return 0; }
		
		final int trial = n - deep;
		final int s_number = s_part[deep];
		
		long ret = 0;
		for(int i = 0; i < s_number; i++){
			if(rest_values[i] <= 0){ continue; }
			rest_values[i]--;
			
			long combs = 1;
			for(int j = 1; j <= (trial - 1); j++){ combs *= j; }
			for(int elem = 0; elem < 10; elem++){
				if(rest_values[elem] <= 0){ continue; }
				for(int j = 1; j <= rest_values[elem]; j++){
					combs /= j;
				}
			}
			ret += combs;
			
			rest_values[i]++;
		}
		
		if(rest_values[s_number] > 0){
			rest_values[s_number]--;
			//System.out.println(deep + " : " + ret + " : " + Arrays.toString(rest_values));
			return ret + lower_number(n, deep + 1, s_part, rest_values);
		}else{
			return ret;
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int[] s_part = new int[s.length()];
		for(int i = 0; i < s.length(); i++){ s_part[i] = Character.getNumericValue(s.charAt(i)); }
		
		final int n = s.length();
		final int sum_max = (n + 1) * 10;
		
		int s_sum = 0;
		for(final char c : s.toCharArray()){ s_sum += Character.getNumericValue(c); }
		
		long[][] SUM_USE_ZERO_DP = new long[n + 1][sum_max];
		long[][] SUM_NOT_ZERO_DP = new long[n + 1][sum_max];
		SUM_USE_ZERO_DP[0][0] = SUM_NOT_ZERO_DP[0][0] = 1;
		
		for(int len = 0; len < n; len++){
			for(int num = 0; num < sum_max; num++){
				for(int i = 0; i < 10 && (num + i) < sum_max; i++){
					if(i != 0){ SUM_NOT_ZERO_DP[len + 1][num + i] += SUM_NOT_ZERO_DP[len][num]; }
					SUM_USE_ZERO_DP[len + 1][num + i] += SUM_USE_ZERO_DP[len][num];
				}
			}
		}
		
		long[][] P_SUM_USE_ZERO_DP = new long[n + 1][sum_max];
		for(int len = 0; len <= n; len++){
			P_SUM_USE_ZERO_DP[len][0] = SUM_USE_ZERO_DP[len][0];
			
			for(int i = 1; i < sum_max; i++){
				P_SUM_USE_ZERO_DP[len][i] = SUM_USE_ZERO_DP[len][i] + P_SUM_USE_ZERO_DP[len][i - 1];
			}
		}
		
		long s_prod = 1;
		for(final char c : s.toCharArray()){ s_prod *= Character.getNumericValue(c) + 1; }
		
		
		final long lower = s_sum == 0 ? 0 : P_SUM_USE_ZERO_DP[n][s_sum - 1];
		final long upper = P_SUM_USE_ZERO_DP[n][s_sum];
		/*
		for(int i = 0; i <= s_sum; i++){
			System.out.println(i + " : [" + (i == 0 ? 0 : P_SUM_USE_ZERO_DP[n][i - 1]) + " , " + P_SUM_USE_ZERO_DP[n][i] + ") : " + (P_SUM_USE_ZERO_DP[n][i] - (i == 0 ? 0 : P_SUM_USE_ZERO_DP[n][i - 1])));
		}
		*/
		//System.out.println("[" + lower + " , " + upper + ")");
		
		HashMap<Long, Long> prod_memoized = new HashMap<Long, Long>();
		HashSet<String> same_number = new HashSet<String>();
		final long lower_prod = lower_prod(n, 0, "", s_sum, 1, s_prod, 9, new int[10], prod_memoized, same_number);
		long sum_memoized = 0;
		for(final long val : prod_memoized.values()){ sum_memoized += val; }
		//System.out.println(sum_memoized);
		//System.out.println(prod_memoized);
		//System.out.println(same_number);
		
		long lower_number = 0;
		for(final String same : same_number){
			int[] values = new int[10];
			
			for(final char elem : same.toCharArray()){ values[Character.getNumericValue(elem)]++; }
			//System.out.println(Arrays.toString(values));
			lower_number += lower_number(n, 0, s_part, values);
			//System.out.println(lower_number);
		}
		
		
		//final long ret = dfs(n, 0, 0, false, false, 1, s_sum, s_prod, s_part, SUM_USE_ZERO_DP, SUM_NOT_ZERO_DP);
		
		System.out.println(lower + sum_memoized + lower_number);
		
	}
}