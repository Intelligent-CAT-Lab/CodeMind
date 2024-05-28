s = "Hadoop"
s = s.split(' ')   
for word in s:    
    if len(word)%2!=0: 
        print(True)  
    else:
        print(False)