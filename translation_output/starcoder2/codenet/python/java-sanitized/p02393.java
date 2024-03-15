import java.util.Scanner;
import java.util.Arrays;

public class p02393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] s = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(s);
        System.out.println(s[0] + " " + s[1] + " " + s[2]);
    }
}

/src/main/java/com/github/hcsp/controlflow/Main.java
package com.github.hcsp.controlflow;

import java.util.Scanner;

public class p02393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first integer:");
        int a = scanner.nextInt();
        System.out.println("Please enter the second integer:");
        int b = scanner.nextInt()t.println("Please enter the third integer:");
        int c = scanner.nextInt();
        System.out.println("