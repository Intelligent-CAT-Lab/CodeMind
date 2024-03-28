class main:
    import sys
    
    def main():
        word = sys.stdin.readline()
        flag = False
        for i in range(len(word) - 1):
            if word[i] == word[i + 1]:
                flag = True
                break
        if flag:
            print("Bad")
        else:
            print("Good")
    
    if __name__ == "__main__":
        main()