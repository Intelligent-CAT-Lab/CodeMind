import sys

def main():
    S = sys.stdin.readline().strip()
    S0 = '0'
    S0mas = S.count(S0)
    S1mas = len(S) - S0mas
    if S0mas < S1mas:
        print(S0mas * 2)
    else:
        print(S1mas * 2)

if __name__ == "__main__":
    main()