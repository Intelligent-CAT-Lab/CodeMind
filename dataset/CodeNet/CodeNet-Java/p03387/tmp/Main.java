import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int[] x=new int[3];
x[0]=sc.nextInt();
System.out.println("[INST]7;None;sc.nextInt();"+sc.nextInt());
x[1]=sc.nextInt();
System.out.println("[INST]8;None;sc.nextInt();"+sc.nextInt());
x[2]=sc.nextInt();
System.out.println("[INST]9;None;sc.nextInt();"+sc.nextInt());
Arrays.sort(x);
System.out.println("[INST]10;None;Arrays.sort(x);"+Arrays.sort(x));
int temp=2*x[2]-x[1]-x[0];
int ans;
if(temp%2==1){ans=(temp+2)/2+1;}else{ans=temp/2;}
out.println(ans);
}}