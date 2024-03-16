Here's the translated code from Java to Python:

```python
def main():
    translator = Translator()
    translator.run()


class Translator:
    def __init__(self):
        self.in_matrix = [
            ["wa", "nn", "wo", "", ""],
            ["a", "u", "o", "i", "e"],
            ["ka", "ku", "ko", "ki", "ke"],
            ["sa", "su", "so", "si", "se"],
            ["ta", "tu", "to", "ti", "te"],
            ["na", "nu", "no", "ni", "ne"],
            ["ha", "hu", "ho", "hi", "he"],
            ["ma", "mu", "mo", "mi", "me"],
            ["ya", "yu", "yo", "", ""],
            ["ra", "ru", "ro", "ri", "re"],
        ]

    def run(self):
        try:
            while True:
                fl = input()
                result = ''
                for i in range(0, len(fl), 2):
                    c = self.get_column_index(fl[i + 1])
                    result += self.in_matrix[int(fl[i])][c]
                print(result)
        except EOFError:
            pass

    @staticmethod
    def get_column_index(direction):
        direction_to_index = {'T': 0, 'L': 3, 'U': 1, 'R': 4, 'D': 2}
        return direction_to_index.get(direction, -1)


if __name__ == '__main__':
    main()
```

A few notes about the differences and changes between the Java and the Python code:

- In Python, we generally use the `input()` function to read from standard input, which corresponds to the `Scanner` class in Java.
- Since Python does not support the `switch` statement, I use a dictionary to map the direction to the index.
- I wrapped the main code in a `try` block to handle `EOFError` which gets raised when `input()` reaches the end of input (this simulates the behavior of `scan.hasNext()` in the Java code).
- Instead of `toCharArray()`, we can iterate over the string directly, since Python treats strings as sequences of characters.
- Python uses zero-based indexing for arrays (lists), same as Java, so the translation for array access is straightforward.
- Python classes don't need an explicit `public` keyword; all methods in Python are public by default.

This code should provide the same functionality as the Java code in the Python environment.
