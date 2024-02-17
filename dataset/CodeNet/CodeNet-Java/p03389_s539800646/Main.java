import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{
    public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int[] list = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
			Arrays.sort(list);
			int times = 0;
			while(list[2]<=52){
				if(list[0]==list[2]&&list[0]==list[1]){
					break;
				}
				times++;
				if(list[1]!=list[2]){
					list[0]++;
					list[1]++;
				}else{
					list[0]=list[0]+2;
				}
				Arrays.sort(list);
			}
			System.out.println(times);
    }
}
