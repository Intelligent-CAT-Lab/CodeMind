class main:
    def switch_words(sentence):
        sentence = sentence.replace("apple", "temp")
        sentence = sentence.replace("peach", "apple")
        sentence = sentence.replace("temp", "peach")
        return sentence
    
    # Test case
    print(switch_words("the cost of one peach is higher than that of one apple"))