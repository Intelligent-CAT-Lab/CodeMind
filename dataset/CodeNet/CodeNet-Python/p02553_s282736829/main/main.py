import sys
import math
#from queue import *
#import random
#sys.setrecursionlimit(int(1e6))
input = sys.stdin.readline
 
############ ---- USER DEFINED INPUT FUNCTIONS ---- ############
def inp():
    return(int(eval(input())))
def inara():
    return(list(map(int,input().split())))
def insr():
    s = eval(input())
    return(list(s[:len(s) - 1]))
def invr():
    return(list(map(int,input().split())))
################################################################
############ ---- THE ACTUAL CODE STARTS BELOW ---- ############

a,b,c,d=invr()

p=a*c
q=a*d
r=b*c
s=b*d

print((max(p,q,r,s)))
