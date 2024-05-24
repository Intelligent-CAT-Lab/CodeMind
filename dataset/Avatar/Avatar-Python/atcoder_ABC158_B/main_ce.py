N , A , B = map ( int , "501719768609305159 370614275896614890 131105492712690269". split ( ) )
ans = N // ( A + B ) * A
rem = N % ( A + B )
ans += min ( rem , A )
print ( ans )
