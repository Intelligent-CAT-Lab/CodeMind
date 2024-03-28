def main():
    str_input = input()
    ret = ""
    for i in range(len(str_input)):
        ch = str_input[len(str_input) - i - 1]
        ret += ch
    print(ret)

if __name__ == "__main__":
    main()