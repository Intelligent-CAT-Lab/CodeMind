def func(n):
    if n == 1:
        return ['a']
    else:
        prev_list = func(n - 1)
        new_list = []
        for s in prev_list:
            max_char = max(s)
            for c in range(ord('a'), ord(max_char) + 2):
                new_string = s + chr(c)
                new_list.append(new_string)
        return new_list

def main():
    n = int(input())
    lst = func(n)
    for s in lst:
        print(s)

if __name__ == "__main__":
    main()