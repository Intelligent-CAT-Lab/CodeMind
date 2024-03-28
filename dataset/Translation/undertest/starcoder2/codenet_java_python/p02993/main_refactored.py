class main:
    word = input()
    flag = False
    for i in range(len(word)-1):
        if word[i] == word[i+1]:
            flag = True
            break
    if flag:
        print("Bad")
    else:
        print("Good")
    
    /p00000/p00000.md
    # Problem 00000