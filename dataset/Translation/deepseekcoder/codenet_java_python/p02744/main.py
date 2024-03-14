def main():
    n = int(input())

    result = func(n)

    for s in result:
        print(s)

def func(n):
    result = []
    if n == 1:
        result.append("a")
    else:
        prev_result = func(n - 1)
        for s in prev_result:
            max_char = max(s)

            for c in range(ord(max_char)+1, ord('z')+2):
                new_string = s + chr(c)
                result.append(new_string)
    return result

if __name__ == "__main__":
    main()