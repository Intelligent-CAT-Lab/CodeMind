import sys
import io
import os
import threading
import time

def solve():
    a = [int(x) for x in input().split()]
    list_ = []
    for j in range(3):
        for i in range(a[j]):
            list_.append(chr(ord('a') + j))
    
    while len(list_) > 1:
        list_.sort()
        last = len(list_) - 1
        s = list_[0] + list_[last]
        list_[0] = s
        del list_[last]
    
    print(list_[0])

def main():
    if 'debug' in os.environ:
        with open(os.environ['debug'], 'r') as f:
            sys.stdin = f
    
    threading.Thread(target=lambda: solve()).start()

if __name__ == '__main__':
    main()