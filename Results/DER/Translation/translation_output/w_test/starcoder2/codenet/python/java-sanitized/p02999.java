import java.util.Scanner;

public class p02999 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a < b ? 0 : 10);
    }
}




import java.util.Scanner;

public class p02999 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == k) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}

/java/2021-04-26-java-2d-array.md
---
layout: default
title: 2D Array
parent: Java
nav_order: 1
---

# 2D Array