def main():
    s = input()
    
    a = len(s)
    
    if s[0] == s[a-1]:
        flag = False if a%2 == 1 else True
    else:
        flag = True if a%2 == 1 else False
        
    if flag:
        print("First")
    else:
        print("Second")

if __name__ == "__main__":
    main()