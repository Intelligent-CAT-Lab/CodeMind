

```java
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
```
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

Moreover, Chef has a deadline — he wants to complete all the tasks before the K-th day (including day K), but he is not sure if he can do that. Therefore, he asks you to find the maximum number of tasks he can complete.

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains two space-separated integers N and K.
The second line contains N space-separated integers T1,T2,…,TN.
Output
For each test case, print a single line containing one integer — the maximum number of tasks Chef can complete.

Constraints
1≤T≤100
1≤N≤105
1≤K≤109
1≤Ti≤109 for each valid i
the sum of N over all test cases does not exceed 106
Subtasks
Subtask #1 (100 points): original constraints

Example Input
2
3 5
1 2 3
3 10
1 2 3
Example Output
3
3
Explanation
Example case 1: Chef can complete the tasks in the following order: 1, 2, 3.

Example case 2: Chef can complete the tasks in the following order: 1, 2, 3.

# Solution

```
#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--)
    {
        long long n,k;
        cin>>n>>k;
        long long a[n];
        for(int i=0;i<n;i++)
        {
            cin>>a[i];
        }
        long long sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
        }
        if(sum<=k)
        {
            cout<<n<<endl;
        }
        else
        {
            long long ans=0;
            long long sum=0;
            for(int i=0;i<n;i++)
            {
                sum+=a[i];
                if(sum>k)
                {
                    break;
                }
                ans++;
            }
            cout<<ans<<endl;
        }
    }
    return 0;
}
```
/content/posts/2019-07-29-Codechef-July-Challenge-2019-Chef-and-Card-Game.md
---
template: post
title: Codechef July Challenge 2019 Chef and Card Game
draft: false
date: '2019-07-29T12:00:00.000Z'
description: >-
  Problem Link:
  https://www.codechef.com/JULY19B/problems/CRDGAME
category: Competitive Programming
tags:
  - Competitive Programming
  - Codechef
  - July Challenge 2019
  - Data Structures
  - Stacks
---

# Problem Statement

Chef and Chefina are playing a card game. There are N cards in the game numbered 1 through N. Each card has a positive integer written on it.

The game consists of N rounds. In each round, Chef and Chefina simultaneously draw a card from the deck. The player with the card having the higher number wins the round. If the numbers on the drawn cards are equal, then the round is drawn and nobody wins.

The game ends as soon as one of the players wins K rounds.

You are given the numbers written on the cards. Find the number of ways in which the game can end and Chef can win. Since the answer can be large, compute it modulo 1,000,000,007 (109+7).

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains two space-separated integers N and K.
The second line contains N space-separated integers A1,A2,…,AN.
Output
For each test case, print a single line containing one integer — the number of ways in which the game can end and Chef can win, modulo 1,000,000,007.

Constraints
1≤T≤100
1≤K≤N≤105
1≤Ai≤109 for each valid i
the sum of N over all test cases does not exceed 106
Subtasks
Subtask #1 (100 points): original constraints

Example Input
2
3 2
1 2 3
3 1
1 2 3
Example Output
2
1
Explanation
Example case 1: There are two ways in which the game can end and Chef can win:

Chef draws card 1 and Chefina draws card 2.
Chef draw
