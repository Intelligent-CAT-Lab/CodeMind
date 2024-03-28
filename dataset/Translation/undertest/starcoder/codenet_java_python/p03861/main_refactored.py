class main:
    import sys
    
    a,b,x=map(int,raw_input().split())
    
    print (b/x-a/x)
    if a%x==0:
    	print (1)