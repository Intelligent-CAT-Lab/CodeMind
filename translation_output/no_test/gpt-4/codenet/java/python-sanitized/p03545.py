# No need to import Scanner in Python, instead we can use input()

def main():
    str_input = input().strip()  # Read the input and remove any leading/trailing whitespaces.

    # Python strings support direct indexing, no need to create a separate ch list.
    a = int(str_input[0])
    b = int(str_input[1])
    c = int(str_input[2])
    d = int(str_input[3])

    # Instead of using a fixed size array, we can directly initialize the ans as needed.
    ans = []

    if a + b + c + d == 7:
        ans = ["+", "+", "+"]
    elif a + b + c - d == 7:
        ans = ["+", "+", "-"]
    elif a + b - c + d == 7:
        ans = ["+", "-", "+"]
    elif a - b + c + d == 7:
        ans = ["-", "+", "+"]
    elif a + b - c - d == 7:
        ans = ["+", "-", "-"]
    elif a - b + c - d == 7:
        ans = ["-", "+", "-"]
    elif a - b - c + d == 7:
        ans = ["-", "-", "+"]
    elif a - b - c - d == 7:
        ans = ["-", "-", "-"]

    # Python's print function can be used to output the result.
    print("{}{}{}{}{}{}{}=7".format(a, ans[0], b, ans[1], c, ans[2], d))

# It is a common practice to guard the main function in Python to prevent
# parts of the code from being executed when the modules are imported
if __name__ == "__main__":
    main()