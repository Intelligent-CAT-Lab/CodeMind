def main():
    s = input()
    if s.endswith("s"):
        print(s + "es")
    else:
        print(s + "s")

if __name__ == "__main__":
    main()