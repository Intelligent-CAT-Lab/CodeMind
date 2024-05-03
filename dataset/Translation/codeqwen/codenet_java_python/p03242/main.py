def main():
    S = list(input())
    for i in range(3):
        S[i] = '9' if S[i] == '1' else '1'
    print(''.join(S))

if __name__ == "__main__":
    main()