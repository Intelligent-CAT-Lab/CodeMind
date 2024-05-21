import sys

def main():
    # TODO èªåçæãããã¡ã½ããã»ã¹ã¿ã
    str = sys.stdin.readline().strip()

    while("()" in str):
        str = str.replace("()", "")
    #print(str)
    input = list(str)

    starIndex = 0

    for i in range(len(input)):
        if(input[i] == '*'):
            starIndex = i
    left = starIndex - 1
    right = starIndex + 1

    result = 0
    while(left >= 0):
        if(input[left] == '('):
            while(right <= len(input) - 1):
                if(input[right] == ')'):
                    result += 1
                    break

                right += 1
        left -= 1

    print(result)

if __name__ == "__main__":
    main()