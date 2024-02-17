import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int[] nums = new int[5];
        for(int i = 0 ; i < nums.length ; i++){
        	nums[i] = input.nextInt();
        }
        Arrays.sort(nums);
        for(int i = nums.length-1 ; i >= 0 ; i--){
        	if(i == 0){
        		System.out.println(nums[i]);
        	}else{
        		System.out.print(nums[i]+" ");
        	}
        }
    }
}