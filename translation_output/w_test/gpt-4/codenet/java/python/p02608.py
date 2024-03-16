Below is the translation of the provided Java code to Python:

```python
def calculate_eratosu():
    eratosu = [0] * 100000
    for i in range(1, 101):
        for j in range(1, 101):
            for k in range(1, 101):
                if i*i + j*j + k*k >= 100000:
                    continue
                result = i*i + j*j + k*k + i*j + j*k + k*i
                eratosu[result] += 1
    return eratosu

def main():
    n = int(input())  # Read input from user
    eratosu = calculate_eratosu()
    
    # Build and print the result
    result = '\n'.join(str(eratosu[i]) for i in range(1, n + 1))
    print(result)

# If running the script directly, execute main function
if __name__ == "__main__":
    main()
```

Here is how you might run a test with input `20`:

```
n = 20
print('\n'.join(str(eratosu[i]) for i in range(1, n + 1)))
```

Please replace the `input()` calls with the specified test inputs if you wish to run the test without interactive input.
