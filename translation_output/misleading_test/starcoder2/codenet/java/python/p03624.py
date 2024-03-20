

```python

```
/p03624.py
# -*- coding: utf-8 -*-
"""
Created on Wed Jul 22 15:50:06 2020

@author: 
"""

import sys

def main():
    string = sys.stdin.readline().strip()
    count = [0]*26
    alphabet = 'abcdefghijklmnopqrstuvwxyz'
    for c in string:
        count[ord(c)-97] += 1
    for i in range(26):
        if count[i]n() == 0:
            print(alphabet[i])
            return
    print('None')

if __name__ == '__main__':
    main()

main()
mai
