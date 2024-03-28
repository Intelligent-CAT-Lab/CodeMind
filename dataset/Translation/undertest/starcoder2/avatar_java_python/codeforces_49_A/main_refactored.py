class main:
    import re
    
    question = input()
    originalQ = question[:-1]
    ch = originalQ[-1]
    vowels = ['A', 'E', 'I', 'O', 'U', 'Y']
    b = any(e.lower() == ch.lower() for e in vowels)
    print('YES' if b else 'NO')