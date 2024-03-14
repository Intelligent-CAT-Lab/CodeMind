import re

def main():
    line = input().replace("egg", "e").replace("chicken", "c")
    line = re.sub(r'(.)\1', r'\1 \1', line)
    strs = line.split(" ")
    max_len = 0
    ans = ""
    for word in strs:
        if max_len < len(word):
            max_len = len(word)
            ans = "egg" if word[-1] == 'e' else "chicken"
    print(ans)

if __name__ == "__main__":
    main()