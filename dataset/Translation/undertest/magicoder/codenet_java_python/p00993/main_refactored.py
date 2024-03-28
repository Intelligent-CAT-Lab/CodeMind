class main:
    #[2, 1510] ã®ç´æ°å
    ¨ã¦ããã¤æ´æ°factãæ¢ã
    #[fact + 2, fact + 1510] ã¯å
    ¨ã¦ç´æ°ãæã¤ãã¨ãããã
    #ã©ããªå¤ãå
    ¥åããããã¨, fact + 2ãåºåãã¦ããã°ãã
    
    import math
    
    fact = 1
    mul = 1
    
    for i in range(1, 1511):
        fact = fact * mul
        mul += 1
    
    fact += 2
    
    n = int(input())
    print(fact)
    
    for i in range(2, 2 + n):
        print(i)