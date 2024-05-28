def word_len(s): 
    s = s.split(' ')   
    for word in s:    
        if len(word)%2!=0: 
            return True  
        else:
          return False