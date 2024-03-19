import re

def process_string(s):
    s = s.replace('.', ',')
    s = s.replace(',', ' ')
    tokens = s.split(" ")
    count = 0
    
    for token in tokens:
        n = len(token)
        
        if 3 <= n <= 6:
            if count > 0: 
                print(" ", end="")
            print(token[:n], end="")
            count += 1

    if count > 0: 
        print()

# Test input
process_string("Rain, rain, go to Spain.")