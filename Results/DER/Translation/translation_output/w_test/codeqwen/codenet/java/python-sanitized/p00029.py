import re

def main():
    s = input().split()
    r = [s.count(word) for word in s]
    max_index = r.index(max(r))
    print(s[max_index], end=" ")
    max_length = max(len(word) for word in s)
    for word in s:
        if len(word) == max_length:
            print(word)

if __name__ == "__main__":
    main()