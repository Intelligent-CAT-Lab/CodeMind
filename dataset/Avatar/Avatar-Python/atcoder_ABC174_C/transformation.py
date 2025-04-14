from sys import stdin, stdout, setrecursionlimit
from bisect import bisect_left, bisect_right
from collections import Counter
from math import gcd, ceil, sqrt
import queue
import threading
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
import datetime

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
datetime.datetime.now()

@my_decorator
def Func_newFunc0_19_0(k, variable_3_19, t, variable_6_19):
    try:
        return t % k * variable_6_19 + variable_3_19
    except BaseException:
        pass

def ii1():
    return int(stdin.readline().strip())

def is1():
    return stdin.readline().strip()

def iia():
    return list(map(int, stdin.readline().strip().split()))

def newisa_1():
    return stdin.readline().strip().split()
setrecursionlimit(100000)
Fernet.generate_key()
time.sleep(0.01)
mod = [1000000007][0]
k = ii1()
t = 0
LoopChecker113 = 85
base64.b64encode(b'39988066277579208212')
parse('2024-10-12 05:05:41')
LoopChecker213 = 84
HTTPConnection('google.com', port=80)
ConditionChecker118 = 637
ConditionChecker218 = 677
ttest_ind([60, 98, 71], [82, 95, 12])
for LoopIndexOut in range(LoopChecker113 // LoopChecker213):
    for i in range(1, k + 1):
        variable_3_19 = 7
        variable_6_19 = 10
        queue_Func_newFunc0_19_00 = queue.Queue()

        def Func_newFunc0_19_0_thread(queue):
            result = Func_newFunc0_19_0(k, variable_3_19, t, variable_6_19)
            queue.put(result)
        thread_Func_newFunc0_19_00 = threading.Thread(target=Func_newFunc0_19_0_thread, args=(queue_Func_newFunc0_19_00,))
        thread_Func_newFunc0_19_00.start()
        thread_Func_newFunc0_19_00.join()
        result_Func_newFunc0_19_00 = queue_Func_newFunc0_19_00.get()
        t = result_Func_newFunc0_19_00
        if ConditionChecker118 & ConditionChecker218:
            if t % k == 0:
                print(i)
                break
    else:
        print(-1)
else:
    pass
shuffle([43, 75, 36])