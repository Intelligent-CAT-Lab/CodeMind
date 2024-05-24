S = str ( input ( ) )
S = S . replace ( "BC" , "D" )
A_count = 0
ans = 0
for i in range ( len ( S ) ) :
    if S [ i ] == 'A' :
        A_count += 1
    elif S [ i ] == 'D' :
        ans += A_count
    else :
        A_count = 0
print ( ans )

