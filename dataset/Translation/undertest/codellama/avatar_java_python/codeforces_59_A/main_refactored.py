class main:
    import re
    
    def convert_case(word):
        uppercase = 0
        lowercase = 0
        for ch in word:
            if ch.isupper():
                uppercase += 1
            else:
                lowercase += 1
        if uppercase > lowercase:
            return word.upper()
        elif lowercase > uppercase:
            return word.lower()
        else:
            return word.lower()
    
    word = "CDOZDPBVVVHNBJVBYHEOXWFLJKRWJCAJMIFCOZWWYFKVWOGTVJcuusigdqfkumewjtdyitveeiaybwrhomrwmpdipjwiuxfnwuz"
    print(convert_case(word))