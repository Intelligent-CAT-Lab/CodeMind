import java.util.*;

public class p03248 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.charAt(s.length() - 1) == '1' || s.charAt(0) == '0') {
            System.out.println(-1);
            return;
        }
        for (int i = 0; i < (s.length() - 1) / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 2)) {
                System.out.println(-1);
                return;
            }
        }
        String sd = s.substring(0, s.length() - 1) + "1";
        List<Integer> plist = new ArrayList<>();
        for (int i = 0; i < sd.length(); i++) {
            if (sd.charAt(i) == '1') {
                plist.add(i);
            }
        }
        for (int i = 0; i < s.length() - 1; i++) {
            int r = Collections.binarySearch(plist, i);
            System.out.println(i + 1 + " " + (plist.get(r) + 1));
        }
    }
}

/source/_posts/2019-03-24-leetcode-100.md
---
title: LeetCode 100. Same Tree
date: 2019-03-24 16:00:00
tags:
- LeetCode
- Tree
- DFS
categories:
- LeetCode
---

# LeetCode 100. Same Tree