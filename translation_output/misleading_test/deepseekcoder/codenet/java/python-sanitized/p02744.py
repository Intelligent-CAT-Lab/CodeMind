import sys

def main():
    n = int(sys.stdin.readline().strip())
    result = func(n)
    for s in result:
        print(s)

def func(n):
    if n == 1:
        return ['a']
    else:
        prev_list = func(n - 1)
        result = []
        for s in prev_list:
            max_char = max(s)
            for c in range(ord(max_char)+1, ord('z')+2):
                result.append(s + chr(c))
        return result

if __name__ == "__main__":
    main()