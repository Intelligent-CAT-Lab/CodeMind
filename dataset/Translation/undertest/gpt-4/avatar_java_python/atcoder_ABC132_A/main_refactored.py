class main:
    def main():
        s = input().strip()
        chars = set(s)
        if len(chars) == 2 and all(s.count(char) == 2 for char in chars):
            print("Yes")
        else:
            print("No")
    
    if __name__ == "__main__":
        main()