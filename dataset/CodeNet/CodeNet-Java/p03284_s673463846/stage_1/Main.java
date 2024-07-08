import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.next();int n=Integer.parseInt(newVariable_0);
var newVariable_1 = sc.next();int k=Integer.parseInt(newVariable_1);
//String s=sc.next();
//int[] a=new int[n];
//for(int i=0;i<n;i++){}
int ans;
if(n%k==0){ans=0;}else{ans=1;}
System.out.println(ans);
}}