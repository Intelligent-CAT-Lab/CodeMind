import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
 
public class Main {
	
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        final int N = sc.nextInt();
        
        int[] heights = new int[N];
        for(int i = 0; i < N; i++){
var newVariable_0 = sc.nextInt();        	heights[i] = newVariable_0;
        }
        
        ArrayList<Integer> signed = new ArrayList<Integer>();
        int prev = Integer.MIN_VALUE;
        for(int i = 0; i < N - 1; i++){
        	final int next_diff = heights[i + 1] - heights[i];
var newVariable_1 = Math.abs(next_diff);        	final int next_sign = next_diff == 0 ? 0 : next_diff / newVariable_1;
        	
        	if(i == 0){
        		prev = next_sign;
        		continue;
        	}
        	
        	if(prev != next_sign){
var newVariable_2 = signed.add(prev);        		prev = next_sign;
        	}
        }
        if(prev != Integer.MIN_VALUE){
var newVariable_3 = signed.add(prev);        }
        //System.out.println(signed);
        
        int[] counts = new int[5];
        
var newVariable_4 = signed.size();        for(int i = 1; i < newVariable_4 - 1; i++){
        	final int prev_sign = signed.get(i - 1);
        	final int curr_sign = signed.get(i);
        	final int next_sign = signed.get(i + 1);
        	
        	if(curr_sign == 0){
        		if(prev_sign == 1 && next_sign == -1){
        			counts[0]++;
        		}else if(prev_sign == -1 && next_sign == 1){
        			counts[1]++;
        		}else {
        			counts[2]++;
        		}
        	}
        }
        
var newVariable_5 = signed.size();        for(int i = 0; i < newVariable_5 - 1; i++){
        	final int curr_sign = signed.get(i);
        	final int next_sign = signed.get(i + 1);
        	
        	if(curr_sign != next_sign && curr_sign != 0 && next_sign != 0){
        		if(curr_sign > 0){
        			counts[3]++;
        		}else{
        			counts[4]++;
        		}
        	}
        }
        
        for(int i = 0; i < 5; i++){
        	if(i != 0){
        		System.out.print(" ");
        	}
        	System.out.print(counts[i]);
        }
        System.out.println();
    }
     
} 
