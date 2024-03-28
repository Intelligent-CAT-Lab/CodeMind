import java.util.*;

public class p02062 {
    static String[] tokens;
    static int cur;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        tokens = src.split(" ");
        cur = 0;
        int[] ans = parse_formula();
        System.out.println(ans[0] + " " + ans[1]);
    }

    static int[] parse_formula() {
        return parse_or();
    }

    static int[] parse_or() {
        int[] lhs = parse_and();
        if (tokens[cur].equals("|")) {
            cur++;
            int[] rhs = parse_or();
            int zero = Math.min(lhs[0], lhs[1] + rhs[0]);
            int one = Math.min(lhs[0] + rhs[1], lhs[1]);
            return new int[]{zero, one};
        }
        return lhs;
    }

    static int[] parse_and() {
        int[] lhs = parse_term();
        if (tokens[cur].equals("&")) {
            cur++;
            int[] rhs = parse_and();
            int zero = Math.min(lhs[0], lhs[1] + rhs[0]);
            int one = lhs[1] + rhs[1];
            return new int[]{zero, one};
        }
        return lhs;
    }

    static int[] parse_term() {
        if (tokens[cur].equals("?")) {
            cur++;
            return new int[]{1, 1};
        } else if (tokens[cur].equals("(")) {
            cur++;
            int[] res = parse_or();
            if (!tokens[cur].equals(")")) {
                throw new RuntimeException("not closed");
            }
            cur++;
            return res;
        }
        throw new RuntimeException("invalid token");
    }
}

/content/posts/2020-04-26-leetcode-102.md
---
title: "Leetcode 102"
date: 2020-04-26T16:00:00+08:00
draft: false
categories: ["Leetcode"]
---