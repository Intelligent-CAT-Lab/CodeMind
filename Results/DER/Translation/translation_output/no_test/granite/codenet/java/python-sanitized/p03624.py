import string

def main():
    string = input()
    count = [0] * 26
    for char in string:
        count[ord(char) - ord('a')] += 1
    for i, c in enumerate(count):
        if c == 0:
            print(string.ascii_lowercase[i])
            return
    print("None")

if __name__ == "__main__":
    main()