import java.util.*;
import java.io.*;

public class p02054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if ((A * B) % 2 == 0 && (B * C) % 2 == 0 && (C * A) % 2 == 0) {
            System.out.println("Tem");
        } else {
            System.out.println("Hom");
        }
    }
}

/content/posts/2020-04-20-python-code-style.md
---
title: "Python Code Style"
date: 2020-04-20T15:00:00+08:00
draft: false
categories: ["python"]
tags: ["python"]
---

# Python Code Style