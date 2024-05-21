def main():
    max_num = 0
    idx = 0
    for i in range(3):
        x = int(input())
        if max_num < x:
            max_num = x
            idx = i
    print(chr(ord('A') + idx))

if __name__ == "__main__":
    main()