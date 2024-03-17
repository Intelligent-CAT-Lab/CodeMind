import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=1;
        for(int term=1;term<=t;term++)
        {
            int n=sc.nextInt();
            int div=10;
            int tot=0;
            if(n%2==1)
            {
                System.out.println(0);
            }
            else
            {
                while(n>=div)
                {
                    tot+=(n/div);
                    div*=5;
                }
                System.out.println(tot);
            }
        }
    }
}

/content/posts/2019-07-29-Codechef-July-Challenge-2019-Chef-and-Easy-Queries.md
---
template: post
title: Codechef July Challenge 2019 Chef and Easy Queries
draft: false
date: '2019-07-29T12:00:00.000Z'
description: >-
  Problem Link:
  https://www.codechef.com/JULY19B/problems/CHEFEZQ
category: Competitive Programming
tags:
  - Competitive Programming
  - Codechef
  - July Challenge 2019
  - Data Structures
  - Stacks
---

# Problem Statement

Chef has N tasks numbered 1 through N. For each valid i, the i-th task is described by a single integer Ti — the number of days required to complete this task.

Chef wants to complete all the tasks in the shortest possible time. He can complete the tasks in any order he wants, but he cannot start a new task before the previous one is completed.

Moreover, Chef has a deadline — he wants to complete all the tasks before the K-th day (including day K), but he is not sure if he can do that.