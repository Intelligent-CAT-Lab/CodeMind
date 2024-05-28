import re  
regex = r'^[a-z]$|^([a-z]).*\1$'
def check_char(string): 
	if(re.search(regex, string)): 
		return "Valid" 
	else: 
		return "Invalid" 