import sys

def main():
    # TODO èªåçæãããã¡ã½ããã»ã¹ã¿ã
    br = sys.stdin

    str = br.readline()

    while(str.contains("()")):
        str = str.replaceAll("\\(\\)", "")

    #System.out.println(str)
    char_array = str.tochar()

    star_index = 0

    for i in range(len(char_array)):
        if char_array[i] == '*':
            star_index = i

    left = star_index - 1
    right = star_index + 1

    result = 0
    while left >= 0:
        if char_array[left] == '(':
            while right <= len(char_array) - 1:
                if char_array[right] == ')':
                    result += 1
                    break

                right += 1
            left -= 1
        else:
            left -= 1

    print(result)

if __name__ == "__main__":
    main()