S="125"
Sum = 0
for ii in range( 1, 2**(len(S)-1) ):
    temp_list = []
    temp_s = S
    itr = 1
    for jj in range( (len(S)-1) ):
        bit = (ii>>jj) & 1
        if bit:
            temp_list.append( int(temp_s[0:itr]) )
            temp_s = temp_s[itr:]
            itr = 1
        else:
            itr += 1
    Sum += sum( int(i) for i in temp_list )
    Sum += int(temp_s)
Sum += int(S)
print(Sum)
