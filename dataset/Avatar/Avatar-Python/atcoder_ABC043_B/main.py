s = str ( input ( ) )
my_str = ''
for c in s :
    if c == '0' or c == '1' :
        my_str += c
    elif c == 'B' and len ( my_str ) != 0 :
        my_str = my_str [ : len ( my_str ) - 1 ]
print ( my_str )

