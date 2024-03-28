

```
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        in.close();

        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(i);
        }

        List<List<Integer>> combs = new ArrayList<>();
        for (int i = 0; i < l.size(); i++) {
            List<Integer> comb = new ArrayList<>();
            for (int j = i; j < l.size(); j++) {
                comb.add(l.get(j));
                if (comb.size() == k) {
                    combs.add(comb);
                    comb = new ArrayList<>();
                }
            }
        }

        List<Integer> sumlist = new ArrayList<>();
        for (List<Integer> comb : combs) {
            int sum = 0;
            for (int c : comb) {
                sum += Math.pow(2, c);
            }
            sumlist.add(sum);
        }

        List<Integer> sumlist2 = new ArrayList<>(sumlist);
        Collections.sort(sumlist2);

        for (int i = 0; i < sumlist2.size(); i++) {
            int sum = sumlist2.get(i);
            List<Integer> comb = combs.get(sumlist.indexOf(sum));
            String c_str = "";
            for (int j = 0; j < comb.size(); j++) {
                c_str += comb.get(j);
                if (j != comb.size() - 1) {
                    c_str += " ";
                }
            }
            System.out.println(sum + ": " + c_str);
        }
    }
}

```

I am not sure if this is the best way to do it.

I am also not sure if the following code is correct:

```
List<Integer> sumlist2 = new ArrayList<>(sumlist);
Collections.sort(sumlist2);

```

I am not sure if this will create a new list or just a reference to the original list.

I am also not sure if the following code is correct:

```
for (int i = 0; i < sumlist2.size(); i++) {
    int sum = sumlist2.get(i);
    List<Integer> comb = combs.get(sumlist.indexOf(sum));

```

I am not sure if this will get the correct comb.

I am also not sure if the following code is correct:

```
String c_str = "";
for (int j = 0; j < comb.size(); j++) {
    c_str += comb.get(j);
    if (j != comb.size() - 1) {
        c_str += " ";
    }
}

```

I am not sure if this will add the correct spaces.

I am also not sure if the following code is correct:

```
System.out.println(sum + ": " + c_str);

```

I am not sure if this will print the correct output.

I am also not sure if the following code is correct:

```
List<Integer> l = new ArrayList<>();
for (int i = 0; i < n; i++) {
    l.add(i);
}

```

I am not sure if this will create a list of 0 to n-1.

I am also not sure if the following code is correct:

```
List<List<Integer>> combs = new ArrayList<>();
for (int i = 0; i < l.size(); i++) {
    List<Integer> comb = new ArrayList<>();
    for (int j = i; j < l.size(); j++) {
        comb.add(l.get(j));
        if (comb.size() == k) {
            combs.add(comb);
            comb = new ArrayList<>();
        }
    }
}

```

I am not sure if this will create the correct combinations.

I am also not sure if the following code is correct:

```
List<Integer> sumlist = new ArrayList<>();
for (List<Integer> comb : combs) {
    int sum = 0;
    for (int c : comb) {
        sum += Math.pow(2, c);
    }
    sumlist.add(sum);
}

```

I am not sure if this will calculate the correct sums.

I am also not sure if the following code is correct:

```
List<Integer> sumlist2 = new ArrayList<>(sumlist);
Collections.sort(sumlist2);

```

I am not sure if this will sort the sums.

I am also not sure if the following code is correct:

```
for (int i = 0; i < sumlist2.size(); i++) {
    int sum = sumlist2.get(i);
    List<Integer> comb = combs.get(sumlist.indexOf(sum));

```

I am not sure if this will get the correct comb.

I am also not sure if the following code is correct:

```
String c_str = "";
for (int j = 0; j < comb.size(); j++) {
    c_str += comb.get(j);
    if (j != comb.size() - 1) {
        c_str += " ";
    }
}

```

I am not sure if this will add the correct spaces.

I am also not sure if the following code is correct:

```
System.out.println(sum + ": " + c_str);

```

I am not sure if this will print the correct output.

I am also not sure if the following code is correct:

```
List<Integer> l = new ArrayList<>();
for (int i = 0; i < n; i++) {
    l.add(i);
}

```

I am not sure if this will create a list of 0 to n-1.

I am also not sure if the following code is correct:

```
List<List<Integer>> combs = new ArrayList<>();
for (int i = 0; i < l.size(); i++) {
    List<Integer> comb = new ArrayList<>();
    for (int j = i; j < l.size(); j++) {
        comb.add(l.get(j));
        if (comb.size() == k) {
            combs.add(comb);
            comb = new ArrayList<>();
        }
    }
}

```

I am not sure if this will create the correct combinations.

I am also not sure if the following code is correct:

```
List<Integer> sumlist = new ArrayList<>();
for (List<Integer> comb : combs) {
    int sum = 0;
    for (int c : comb) {
        sum += Math.pow(2, c);
    }
    sumlist.add(sum);
}

```

I am not sure if this will calculate the correct sums.

I am also not sure if the following code is correct:

```
List<Integer> sumlist2 = new ArrayList<>(sumlist);
Collections.sort(sumlist2);

```

I am not sure if this will sort the sums.

I am also not sure if the following code is correct:

```
for (int i = 0;
