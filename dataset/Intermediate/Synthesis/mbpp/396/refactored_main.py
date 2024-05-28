import re  
regex = r'^[a-z]$|^([a-z]).*\1$'
string = "abba"
if(re.search(regex, string)): 
    result = "Valid" 
else: 
    result = "Invalid"
print(result)