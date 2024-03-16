import sys

def main():
    string = sys.stdin.readline().strip()
    count = [0] * 26
    alphabet = list('abcdefghijklmnopqrstuvwxyz')
    for char in string:
        count[ord(char) - 97] += 1
    for i in range(26):
        if count[i] == 0:
            print(alphabet[i])
            return
    print("None")

if __name__ == "__main__":
    main()