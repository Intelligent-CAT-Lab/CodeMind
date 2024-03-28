class main:
    import re
    
    def process_string(s):
        s = s.replace('.', ',')
        s = s.replace(',', ' ')
        tokens = s.split(" ")
        count = 0
        result = ""
    
        for token in tokens:
            n = len(token)
            if n >= 3 and n <= 6:
                if count > 0:
                    result += " "
                result += token[:n]
                count += 1
    
        if count > 0:
            print(result)
    
    # Test input
    process_string("Rain, rain, go to Spain.")