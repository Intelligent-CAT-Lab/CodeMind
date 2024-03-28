import java.util.*;
public class p00509 {
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(),c=sc.nextInt();
  String s="9"*n;
  if(c<0)System.out.println((n>1)?"11"+s+s:s+s);
  else{
   for(char h='9';h>='3';h--){
    if(n-1){
     for(int m=10**(n-1);m>0;m--){
      m--;
      String m1=String.valueOf(m);
      if((h+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1+m1