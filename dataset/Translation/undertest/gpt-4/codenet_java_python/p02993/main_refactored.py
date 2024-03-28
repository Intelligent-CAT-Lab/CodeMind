class main:
    # Function to determine if the word is "Bad" or "Good"
    def is_bad_word(word):
        for i in range(len(word) - 1):
            if word[i] == word[i + 1]:
                return "Bad"
        return "Good"
    
    # Reading input from the user (assumed to be a number as a string)
    word = input().strip()
    
    # Printing the result
    print(is_bad_word(word))