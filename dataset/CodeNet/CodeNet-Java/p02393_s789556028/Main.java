import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] num=new int[3];
		int max=0,ind=0;
		for(int i=0;i<3;i++){
			num[i]=sc.nextInt();
			if(num[i]>max){
				max=num[i];
				ind=i;
			}
		}
		if(ind!=2){
			int tmp=num[2];
			num[2]=num[ind];
			num[ind]=tmp;
		}
		if(num[0]>num[1]){
			int tmp=num[0];
			num[0]=num[1];
			num[1]=tmp;
		}
		System.out.println(num[0]+" "+num[1]+" "+num[2]);
	}
}
