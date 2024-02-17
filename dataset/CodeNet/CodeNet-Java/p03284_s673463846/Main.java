import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n=Integer.parseInt(sc.next());
int k=Integer.parseInt(sc.next());
//String s=sc.next();
//int[] a=new int[n];
//for(int i=0;i<n;i++){}
int ans;
if(n%k==0){ans=0;}else{ans=1;}
System.out.println(ans);
}}