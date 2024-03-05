def main():
    A, B, C, K = map(int, input().split())
    if K&1 == 0:# 偶数
        print(A-B)
    else:
        print(B-A)

if __name__ == "__main__":
    main()