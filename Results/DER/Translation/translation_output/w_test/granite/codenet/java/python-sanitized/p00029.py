import re

def main():
    s = input().split()
    d = {}
    for word in s:
        d[word] = d.get(word, 0) + 1
    max_count = max(d.values())
    most_common = [word for word, count in d.items() if count == max_count]
    max_length = max(len(word) for word in most_common)
    longest = [word for word in most_common if len(word) == max_length]
    print(longest[0])

if __name__ == "__main__":
    main()