Here's the translated code from Java to Python:

```python
def main():
    scores = list(map(int, input().split()))  # splitting and converting the input to integers
    max_score = max(scores)  # finding the maximum score
    idx = scores.index(max_score)  # finding the index of the maximum score
    print(chr(ord('A') + idx))  # printing the corresponding letter (A, B, or C)

if __name__ == "__main__":
    main()
```

If you run this Python script, it should provide the expected output. For the given test input "1000 900 850", the output will be "A".
