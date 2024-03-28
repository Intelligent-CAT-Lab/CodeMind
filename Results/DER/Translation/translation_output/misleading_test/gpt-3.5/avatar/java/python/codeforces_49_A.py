```python
def main():
    question = input().strip()
    originalQ = question[:-1].strip()
    ch = originalQ[-1]
    vowels = ["A", "E", "I", "O", "U", "Y"]
    b = any(e.lower() == ch.lower() for e in vowels)
    print("YES" if b else "NO")

if __name__ == "__main__":
    main()
```
```python
# Test Input
BueDOlxgzeNlxrzRrMbKiQdmGujEKmGxclvaPpTuHmTqBp?

# Expected Output
N
```
```python
# Test Input
AbcdefghijklmnopqrstuvwxyZa?

# Expected Output
YES
```
