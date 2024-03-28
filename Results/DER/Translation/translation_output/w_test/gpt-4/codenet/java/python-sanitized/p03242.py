def main():
    S = input().strip()
    S = ''.join(['9' if ch == '1' else '1' for ch in S])
    print(S)

if __name__ == "__main__":
    main()