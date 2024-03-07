<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

import itertools

n, k = map(int, input().split())

l = range(n)
combs = list(itertools.combinations(l, k))

sumlist = []
for comb in combs:
    sum = 0
    for c in comb:
        sum += pow(2, c)
    sumlist.append(sum)

z = zip(sumlist, combs)
z = sorted(z)

sumlist, combs = zip(*z)

for sum, comb in zip(sumlist, combs):
    c_str = (' '.join(str(c) for c in comb))
    print(str(sum) + ": " + c_str)


Translate the above python code to java.

java code:

[/INST]

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(i);
        }
        List<List<Integer>> combs = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            List<Integer> comb = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (i & (1 << j)) {
                    comb.add(j);
                }
            }
            combs.add(comb);
        }
        List<Integer> sumlist = new ArrayList<>();
        for (List<Integer> comb : combs) {
            int sum = 0;
            for (int c : comb) {
                sum += (int) Math.pow(2, c);
            }
            sumlist.add(sum);
        }
        List<List<Integer>> z = new ArrayList<>();
        for (int i = 0; i < sumlist.size(); i++) {
            List<Integer> zi = new ArrayList<>();
            zi.add(sumlist.get(i));
            zi.add(combs.get(i));
            z.add(zi);
        }
        z = z.stream().sorted(Comparator.comparing(zi -> zi.get(0))).collect(Collectors.toList());
        sumlist = z.stream().map(zi -> zi.get(0)).collect(Collectors.toList());
        combs = z.stream().map(zi -> zi.get(1)).collect(Collectors.toList());
        for (int i = 0; i < sumlist.size(); i++) {
            String c_str = combs.get(i).stream().map(c -> String.valueOf(c)).collect(Collectors.joining(" "));
            System.out.println(sumlist.get(i) + ": " + c_str);
        }
    }
}

This is the Java code for the above Python code. It uses the same logic to generate the combinations and calculate the sums, but it uses Java's built-in data structures and algorithms to do so. The code also uses Java's Stream API to perform the sorting and collecting of the results.</s>
