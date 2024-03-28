class main:
    import re
    
    def swap_words(s):
        s = re.sub('apple', 'temp', s)
        s = re.sub('peach', 'apple', s)
        s = re.sub('temp', 'peach', s)
        return s
    
    test_input = "the cost of one peach is higher than that of one apple."
    print(swap_words(test_input))