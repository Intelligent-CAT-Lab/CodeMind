class main:
	
	def main():
	    s = list(eval(input()))
	    s = list(set(s))
	    
	    if len(s)==4:
	        print("Yes")
	    elif len(s)==3:
	        print("No")
	    elif len(s)==2:
	        if "N"in s and "S" in s:
	            print("Yes")
	        elif "E" in s and "W" in s:
	            print("Yes")
	        else:
	            print("No")
	    else:
	        print("No")
	if __name__=='__main__':
	    main()