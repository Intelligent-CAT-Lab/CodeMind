import sys

def main():
    S = list(sys.stdin.readline().strip())
    for i in range(3):
        if S[i] == '1':
            S[i] = '9'
        else:
            S[i] = '1'
    print(''.join(S))

if __name__ == "__main__":
    main()