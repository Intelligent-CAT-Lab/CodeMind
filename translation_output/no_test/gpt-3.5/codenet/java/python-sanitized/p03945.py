def main():
    s = input()
    str_lst = [s[i] for i in range(len(s))]
    counter = 0
    for i in range(len(str_lst) - 1):
        if str_lst[i] != str_lst[i + 1]:
            counter += 1
    print(counter)

if __name__ == "__main__":
    main()