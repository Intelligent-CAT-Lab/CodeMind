'''
Created on Mar 22, 2013

@author: wukc
'''

from sys import stdin 

def shift(s):
    return ["".join([chr(97+(ord(x)-97+t)%26) if x.islower() else x for x in s]) for t in range(26)]

target=["this","the","that"]

for s in stdin:
    for x in shift(s):
        if sum(map(x.count,target))>0:
            print(x[:-1])