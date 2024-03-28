import sys

def p01945():
    # TODO èªåçæãããã¡ã½ããã»ã1ã5C99ã5C99ã5C99
    input = sys.stdin.readline()

    while input.count("()") > 0:
        input = input.replace("()", "")

    #System.out.println(input)
    char_list = list(input)

    star_index = 0

    for i in range(len(char_list)):
        if char_list[i] == '*':
            star_index = i

    left = star_index - 1
    right = star_index + 1

    result = 0
    while left >= 0:
        if char_list[left] == '(':
            while right <= len(char_list) - 1:
                if char_list[right] == ')':
                    result += 1
                    break

                right += 1

        left -= 1

    print(result)

if __name__ == "__main__":
    p01945()