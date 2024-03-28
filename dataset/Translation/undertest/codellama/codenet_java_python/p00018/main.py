import sys

def main():
    nums = [int(x) for x in sys.stdin.read().split()]
    nums.sort(reverse=True)
    print(" ".join(str(x) for x in nums))

if __name__ == "__main__":
    main()



* `sys.stdin.read()` reads the input from stdin and returns it as a string.
* `split()` splits the string into a list of strings, where each string is a number.
* `[int(x) for x in ...]` converts each string to an integer.
* `sort(reverse=True)` sorts the list of integers in descending order.
* `" ".join(str(x) for x in ...)` joins the sorted integers into a string separated by spaces.
* `print()` prints the resulting string.