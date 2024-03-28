def main():
    s = input()

    if len(s) < 4:
        print("No")
        return
    
    if s[:4] == "YAKI":
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()