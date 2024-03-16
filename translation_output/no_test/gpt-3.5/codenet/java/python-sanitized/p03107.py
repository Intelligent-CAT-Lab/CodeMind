def main():
    S = input()
    S0 = '0'
    S0mas = 0
    for str in S:
        if str == S0:
            S0mas += 1
    S1mas = len(S) - S0mas
    if S0mas < S1mas:
        print(S0mas * 2)
    else:
        print(S1mas * 2)

if __name__ == "__main__":
    main()