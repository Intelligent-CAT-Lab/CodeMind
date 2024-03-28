import sys

def main():
    # TODO: èªåçæãããã¡ã½ããã»ã¹ã¿ã
    input_str = sys.stdin.readline().strip()

    while "()" in input_str:
        input_str = input_str.replace("()", "")

    input_list = list(input_str)

    star_index = input_list.index("*")

    left = star_index - 1
    right = star_index + 1

    result = 0
    while left >= 0:
        if input_list[left] == "(":
            while right <= len(input_list) - 1:
                if input_list[right] == ")":
                    result += 1
                    break
                right += 1
        left -= 1

    print(result)

if __name__ == "__main__":
    main()


Next, the code converts the input string into a list of characters using the `list()` function. It then finds the index of the "*" character in the list using the `list.index()` method.