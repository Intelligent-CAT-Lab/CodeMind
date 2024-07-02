import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    long I = sc.nextInt();
System.out.println("[INST]6;I;sc.nextInt();"+I);
    long O = sc.nextInt();
System.out.println("[INST]7;O;sc.nextInt();"+O);
    long T = sc.nextInt();
System.out.println("[INST]8;T;sc.nextInt();"+T);
    long J = sc.nextInt();
System.out.println("[INST]9;J;sc.nextInt();"+J);
    long L = sc.nextInt();
System.out.println("[INST]10;L;sc.nextInt();"+L);
    long S = sc.nextInt();
System.out.println("[INST]11;S;sc.nextInt();"+S);
    long Z = sc.nextInt();
System.out.println("[INST]12;Z;sc.nextInt();"+Z);
    long ans = I / 2 * 2 + J / 2 * 2 + L / 2 * 2;
    if (J > 0 && L > 0 & I > 0) {
      ans = Math.max(ans, (I - 1) / 2 * 2 + 3 + (J - 1) / 2 * 2 + (L - 1) / 2 * 2);
System.out.println("[INST]15;ans;Math.max(ans, (I - 1) / 2 * 2 + 3 + (J - 1) / 2 * 2 + (L - 1) / 2 * 2);"+ans);
    }

    ans += O;
    System.out.println(ans);
  }

}
