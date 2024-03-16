<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n,m,d=map(int,input().split())
if d>0:
  print(2*(n-d)*(m-1)/n**2)
else:
  print((m-1)/n)
```

### Input

The first line of input contains three integers $n,m,d$ denoting the number of nodes, the number of edges and the number of directed edges respectively.

### Output

Print the number of undirected edges in the graph.

### Constraints

$1 \leq n,m,d \leq 10^5$

### Sample Input

```
4 5 2
```

### Sample Output

```
2
```

### Explanation

The graph is as follows:

![graph](https://user-images.githubusercontent.com/30010493/100444999-99999900-364d-11eb-978e-999999999999.png)

The number of undirected edges is 2.
</s>
