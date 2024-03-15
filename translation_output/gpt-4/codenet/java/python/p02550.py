Below is the translated version of the given Java code into Python. The code logic has been preserved, and Python-specific syntax and constructs have been used:

```python
def p02550():
    N = int(input())
    X = int(input())
    M = int(input())
    used = set()
    A = [X]
    used.add(X)

    K = 0
    L = 0
    ans = 0
    breakflag = False

    for i in range(min(M - 1, N - 1)):
        prev = A[i]
        now = (prev * prev) % M
        if now == 0:
            ans += sum(A[:i + 1])
            breakflag = True
            break
        elif now in used:
            L = i + 1
            for j in range(i + 1):
                if A[j] == now:
                    K = j
                    break
                ans += A[j]
            
            sub = sum(A[K:L])
            m = (N - K) % (L - K)
            left = sum(A[K:K + m])
            
            ans += ((N - K) // (L - K)) * sub + left
            breakflag = True
            break
        else:
            used.add(now)
            A.append(now)

    if not breakflag:
        ans = sum(A)

    print(ans)

# To run the function and simulate input,
# you can either call the function directly (p02550())
# or include the following lines in a script to run with predefined input:
# input_values = ['10', '3', '7']
# input = iter(input_values).__next__

# if __name__ == "__main__":
#     p02550()
```

The `input()` function is used to get user input instead of Scanner, and list comprehension and built-in Python functions like `sum()` simplify some of the loops. The `__next__` construct with `iter()` can be used to simulate input for testing purposes if desired. The `main` construct is optional in Python but included in the comment to illustrate how the above function could be called in a typical Python script.
