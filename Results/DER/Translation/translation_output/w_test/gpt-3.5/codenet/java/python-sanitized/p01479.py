def main():
    line = input().replace("egg", "e").replace("chicken", "c")
    line = line.replace("ee", "e e").replace("ee", "e e").replace("cc", "c c").replace("cc", "c c")
    strs = line.split(" ")
    max_length = 0
    answer = ""
    
    for word in strs:
        if max_length < len(word):
            max_length = len(word)
            answer = "egg" if word[max_length - 1] == 'e' else "chicken"
    
    print(answer)

if __name__ == "__main__":
    main()