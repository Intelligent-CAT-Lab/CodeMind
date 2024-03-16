# no need to import anything since input() is a built-in function

def main():
    s = input()
    
    if s[2] == s[3] and s[4] == s[5]:
        print("Yes")
    else:
        print("No")

# Calling the main function
if __name__ == "__main__":
    main()