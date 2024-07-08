from typing import *	##line:(1)
def reverse_delete(s,c):	##line:(2)
    s = ''.join([char for char in s if char not in c])	##line:(3)
    return (s,s[::-1] == s)	##line:(4)

reverse_delete("abcde","ae") 