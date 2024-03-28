def get_string_input():
    return input()

def main():
    s = get_string_input()
    print((s.count('o') * 100) + 700)

if __name__ == "__main__":
    main()