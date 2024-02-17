import java.io.*;
import java.util.*;

class Main{

	public static void quickSort(int[] arr, int left, int right){
		if (left <= right) {
		int p = arr[(left+right) / 2];
		int l = left;
		int r = right;
		
		while(l <= r) {
			while(arr[l] < p){ l++; }
			while(arr[r] > p){ r--; }

			if (l <= r) {
				int tmp = arr[l];
				arr[l] = arr[r];
				arr[r] = tmp;
				l++; 
				r--;
			}
		}
		quickSort(arr, left, r);
		quickSort(arr, l, right);
		}
	}
		
		 public static void arrayPrintln(int[] arr){
		 	for(int i=arr.length-1; i>=0; i--){
		 		if(i!=0){
		 			System.out.print(arr[i] + " ");
		 		}
		 		else System.out.print(arr[i]);
		 	}
        	System.out.println("");
    	}
		
				
		public static void main(String args[]) throws IOException{
			String str;

			int[] inp = new int[5];

			Scanner scan = new Scanner(System.in);
			
			while(scan.hasNext()){
				for(int i=0;i<5;i++){
					str = scan.next();
					int x = Integer.valueOf(str).intValue();
					inp[i] = x;
				}
				quickSort(inp, 0, inp.length-1);
				arrayPrintln(inp);
			}
	}
}