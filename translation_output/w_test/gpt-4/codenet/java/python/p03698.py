Below is the translated code from Java to Python. The program checks whether the input string has all unique characters.

```python
def main():
    try:
        input_string = input()
        unique_characters = set(input_string)

        ans = "yes" if len(input_string) == len(unique_characters) else "no"
        print(ans)
    except Exception as e:
        raise e

if __name__ == '__main__':
    main()
```

To run the test case with the input "uncopyrightable", just provide that input when the program prompts for it, and it should output "yes".
