import java.util.*;

//update 2020/1/1 23:01

public class Main{

  static Scanner sc = new Scanner(System.in);
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) {

    int a = nextInt();
    int b = nextInt();

    String ab = "";
    String ba = "";

    //ab
    for(int i=1;i<=b;i++){
      ab += String.valueOf(a);
System.out.println("[INST]19;ab;String.valueOf(a);"+ab);
    }

    for(int i=1;i<=a;i++){
      ba += String.valueOf(b);
System.out.println("[INST]23;ba;String.valueOf(b);"+ba);
    }

    String[] c = {ab,ba};

    Arrays.sort(c);
System.out.println("[INST]28;None;Arrays.sort(c);"+Arrays.sort(c));


    System.out.println(c[0]);

  }
  /*
    static String toSmall(String s){
      char c = s.charAt(0);
      //if(Character.isUpperCase(c)){
      if(c<=90){
        c += 32;
      }
      return String.valueOf(c);
    }
    static String toBig(String s){
      char c = s.charAt(0);
      //if(Character.isLowerCase(c)){
      if(c>=97){
        c -= 32;
      }
      return String.valueOf(c);
    }
  */

  static String toSmall(String s){
    return s.toLowerCase();
System.out.println("[INST]54;None;s.toLowerCase();"+s.toLowerCase());
  }

  static String toBig(String s){
    return s.toUpperCase();
System.out.println("[INST]58;None;s.toUpperCase();"+s.toUpperCase());
  }

  static String next(){
    return sc.next();
  }

  static int nextInt(){
    return Integer.parseInt(sc.next());
  }

  static long nextLong(){
    return Long.parseLong(sc.next());
  }

  static double nextDouble(){
    return Double.parseDouble(sc.next());
  }

  static String[] splitString(String s){
    return s.split("");
System.out.println("[INST]78;None;s.split('');"+s.split(""));
  }

  static char[] splitChar(String s){
    return s.toCharArray();
System.out.println("[INST]82;None;s.toCharArray();"+s.toCharArray());
  }

  static int charToInt(char a){
    return a - 48;
  }

////////////////////////////////////////////
  public static int max(int[] a){
    int lng = a.length;
    int max = a[0];
    for(int i=1;i<lng;i++){
      max = Math.max(max,a[i]);
    }
    return max;
  }
  public static long max(long[] a){
    int lng = a.length;
    long max = a[0];
    for(int i=1;i<lng;i++){
      max = Math.max(max,a[i]);
    }
    return max;
  }
////////////////////////////////////////////

////////////////////////////////////////////
  public static int min(int[] a){
    int lng = a.length;
    int min = a[0];
    for(int i=1;i<lng;i++){
      min = Math.min(min,a[i]);
    }
    return min;
  }
  public static long min(long[] a){
    int lng = a.length;
    long min = a[0];
    for(int i=1;i<lng;i++){
      min = Math.min(min,a[i]);
    }
    return min;
  }
////////////////////////////////////////////

}
