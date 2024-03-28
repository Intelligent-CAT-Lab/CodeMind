def main():
    # Adding '$' at the beginning and end of the input string
    str_input = "$" + input() + "$"
    ans = 0
    s = 0
    for i in range(1, len(str_input)):
        if str_input[i] == 'O' and str_input[i - 1] != 'O':
            s = i
        if str_input[i] == 'O' and str_input[i + 1] != 'O':
            l = i - s + 1
            if s >= l and len(str_input) - i - 1 >= l:
                ok = True
                for j in range(l):
                    if str_input[s - 1 - j] != 'J' or str_input[i + 1 + j] != 'I':
                        ok = False
                        break
                if ok:
                    ans = max(ans, l)
    print(ans)

if __name__ == "__main__":
    main()