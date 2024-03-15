import sys

def main():
    string = sys.stdin.readline()
    alphabet = 'abcdefghijklmnopqrstuvwxyz'
    count = [0] * 26
    for char in string:
        count[ord(char) - ord('a')] += 1
    for i in range(26):
        if count[i] == 0:
            print(alphabet[i])
            return
    print('None')

if __name__ == '__main__':
    main()