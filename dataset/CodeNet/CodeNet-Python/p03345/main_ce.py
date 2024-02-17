def main():
    A, B, C, K = map(int, "1 2 3 1".split())
    if K&1 == 0:# 偶数
        print(A-B)
    else:
        print(B-A)
if __name__ == "__main__":
    main()