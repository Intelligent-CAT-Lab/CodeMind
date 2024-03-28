Here's the Java code translated to Python:

```python
def pre_compute_n_choose_k_mod(maxn, mod):
    res = [[0 for _ in range(i + 1)] for i in range(maxn + 1)]
    for i in range(maxn + 1):
        res[i][0] = 1
        res[i][i] = 1
    for i in range(2, maxn):
        for j in range(1, (i >> 1) + 1):
            res_ij = (res[i - 1][j] + res[i - 1][j - 1]) % mod
            res[i][j] = res_ij
            res[i][i - j] = res_ij
    return res

class ESequenceGrowingHard:
    def solve(self, n, k, mod):
        nch_k = pre_compute_n_choose_k_mod(n, mod)
        number_of_sequences = [[0 for _ in range(k + 1)] for _ in range(n + 1)]
        sum_value = [[0 for _ in range(k + 1)] for _ in range(n + 1)]
        
        # Initialization
        for j in range(k, -1, -1):
            number_of_sequences[0][j] = 1 % mod
            number_of_sequences[1][j] = (k - j) % mod
        
        sum_value[0][k] = 1
        sum_value[1][k] = 0

        # Compute sums
        for j in range(k - 1, -1, -1):
            sum_value[0][j] = (sum_value[0][j + 1] + number_of_sequences[0][j]) % mod
            sum_value[1][j] = (sum_value[1][j + 1] + number_of_sequences[1][j]) % mod

        # Main logic
        for i in range(2, n + 1):
            for j in range(k - 1, -1, -1):
                res = 0
                for size_to_the_left in range(i):
                    option_left = sum_value[size_to_the_left][j + 1]
                    option_right = number_of_sequences[i - 1 - size_to_the_left][j]
                    option_to_add_to_each_side = nch_k[i - 1][size_to_the_left]
                    res = (res + ((option_left * option_right * option_to_add_to_each_side) % mod)) % mod
                number_of_sequences[i][j] = res
                sum_value[i][j] = (sum_value[i][j + 1] + res) % mod
        
        return number_of_sequences[n][0]

def main():
    n, k = map(int, input().split())
    mod = int(input())
    solver = ESequenceGrowingHard()
    result = solver.solve(n, k, mod)
    print(result)

if __name__ == "__main__":
    main()
```
This Python code mirrors the functionality of the original Java solution, using Python's list comprehensions and data structures to accomplish the same task. It reads input from the standard input to get the values of `n`, `k`, and `MOD`, then calls the `solve` method within the `ESequenceGrowingHard` class and prints the result.
