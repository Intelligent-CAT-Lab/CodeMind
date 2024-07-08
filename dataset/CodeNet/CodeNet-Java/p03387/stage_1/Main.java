import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int[] x=new int[3];
var newVariable_0 = sc.nextInt();x[0]=newVariable_0;
var newVariable_1 = sc.nextInt();x[1]=newVariable_1;
var newVariable_2 = sc.nextInt();x[2]=newVariable_2;
Arrays.sort(x);
int temp=2*x[2]-x[1]-x[0];
int ans;
if(temp%2==1){ans=(temp+2)/2+1;}else{ans=temp/2;}
out.println(ans);
}}