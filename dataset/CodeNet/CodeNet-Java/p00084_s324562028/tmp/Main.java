import java.util.*;class Main{public static void main(String[]z){String s="";for(String x:new Scanner(System.in).nextLine().split("[ .,]"))if(x.matches(".{3,6}"))s+=x+" ";System.out.println(s.replaceAll(" $",""));}}System.out.println("[INST]0;None;new Scanner(System.in).nextLine().split('[ .,]');"+new Scanner(System.in).nextLine().split("[ .,]"));
System.out.println("[INST]0;None;new Scanner(System.in).nextLine();"+new Scanner(System.in).nextLine());
System.out.println("[INST]0;None;x.matches('.{3,6}');"+x.matches(".{3,6}"));
