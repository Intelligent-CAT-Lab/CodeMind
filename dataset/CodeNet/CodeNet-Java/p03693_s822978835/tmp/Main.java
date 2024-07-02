import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 
 //    String[] nyu=sc.nextLine().split(" ");

     String nyu=sc.nextLine();
System.out.println("[INST]8;nyu;sc.nextLine();"+nyu);
//int A=Integer.parseInt(nyu[0]);
//int B=Integer.parseInt(nyu[1]);
//int C=Integer.parseInt(nyu[2]);
//int D=Integer.parseInt(nyu);

//StringBuffer sb = new StringBuffer(nyu);
//		String dst = sb.reverse().toString();

//     String nyu2=sc.nextLine();
//int E=Integer.parseInt(nyu2);



//double A=Double.parseDouble(nyu[0]);
//double B=Double.parseDouble(nyu[1]);
/*
switch(C){
case 7:
case 5:
case 3:
System.out.println("YES") ;
break;
default:
System.out.println("NO") ;

break;
}
*/

//int res=Math.min((A*B),C);

//for(String tem:nyu){
//if(tem.equals("1"))res++;
//}
//int res=0;
//for(int i=0;i<300;i++){
//if(num[i]==1)res=i;
//}

//char[] c = nyu.toCharArray();


//System.out.println(nyu+"-"+line_r_2+"-"+nyu2+"-"+line_r_1);


String res=nyu.replaceAll(" ","");
System.out.println("[INST]54;res;nyu.replaceAll(' ','');"+res);

if(Integer.parseInt(res)%4==0){
System.out.println("[INST]56;None;Integer.parseInt(res);"+Integer.parseInt(res));
//double res=Math.ceil((AB)/2);

System.out.println("YES");
//}else if((C-B)<A){
//System.out.println("safe");

}else{
System.out.println("NO");

}




	}
}