class main:
    import sys
    
    top = input()
    score = 0
    for j in range(len(top)):
        if top[j] == 'g':
            score += 1
        elif top[j] == 'p':
            score -= 1
        else:
            sys.exit(0)
    print(score)