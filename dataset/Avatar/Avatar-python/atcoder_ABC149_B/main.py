number = input ( )
a , b , k = [ int ( ele ) for ele in number . split ( ' ▁ ' ) ]
res = a - k
if res < 0 :
    a = 0
    b = b + res
    b = 0 if b < 0 else b
else :
    a = res
print ( a , b )

