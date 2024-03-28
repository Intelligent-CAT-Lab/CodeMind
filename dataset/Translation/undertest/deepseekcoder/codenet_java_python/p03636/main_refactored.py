class main:
    import sys
    
    def abbreviate_word(word):
        leng = len(word)
        return word[0] + str(leng-2) + word[leng-1]
    
    if __name__ == "__main__":
        word = sys.stdin.readline().strip()
        print(abbreviate_word(word))