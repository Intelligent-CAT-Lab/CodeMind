import sys

def main():
    # 入力 (read the input)
    work = input().split()

    W = int(work[0])
    H = int(work[1])
    x = int(work[2])
    y = int(work[3])
    r = int(work[4])
    
    # 判断処理 (judgment process)
    if (x - r) >= 0 and (x + r) <= W:
        if (y - r) >= 0 and (y + r) <= H:
            judge = "Yes"
        else:
            judge = "No"
    else:
        judge = "No"
    
    # 出力 (output)
    print(judge)

if __name__ == "__main__":
    main()