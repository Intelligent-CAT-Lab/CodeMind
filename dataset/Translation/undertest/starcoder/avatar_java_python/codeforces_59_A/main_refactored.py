class main:
    word = input()
    
    uppercase = 0
    lowercase = 0
    
    for i in word:
        if i.isupper():
            uppercase += 1
        else:
            lowercase += 1
    
    if uppercase > lowercase:
        print(word.upper())
    elif lowercase > uppercase:
        print(word.lower())
    else:
        print(word.lower())