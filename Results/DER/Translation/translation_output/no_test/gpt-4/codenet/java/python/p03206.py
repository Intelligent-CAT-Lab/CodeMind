```python
# We don't need to import any specific scanner in Python as we have built-in input functions
def main():
    D = int(input())  # Reads an integer from standard input
    if D == 25:
        print("Christmas")
    elif D == 24:  # Using 'elif' to chain conditions
        print("Christmas Eve")
    elif D == 23:
        print("Christmas Eve Eve")
    elif D == 22:
        print("Christmas Eve Eve Eve")

# The main function is called by convention if this module is the main program
if __name__ == "__main__":
    main()
```
