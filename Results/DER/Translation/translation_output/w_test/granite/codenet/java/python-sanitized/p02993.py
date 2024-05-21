def main():
    word = input()
    for i in range(len(word)-1):
        if word[i] == word[i+1]:
            print("Bad")
            return
    print("Good")

if __name__ == "__main__":
    main()