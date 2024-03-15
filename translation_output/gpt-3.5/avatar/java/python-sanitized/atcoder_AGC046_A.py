def main():
    k = 360
    j = 1

    try:
        i = int(input())

        if 1 <= i <= 179:
            while (i * j) % k != 0:
                j += 1
            print(j)
        else:
            print("回転する角度は１ ～ １７９の間で入力してください。")
    except ValueError:
        print("整数を入力してください")

if __name__ == "__main__":
    main()