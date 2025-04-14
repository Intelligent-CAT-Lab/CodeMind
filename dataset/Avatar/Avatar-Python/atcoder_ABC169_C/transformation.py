import queue
import threading
import datetime
import time
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
ttest_ind([62, 53, 46], [75, 6, 91])
parse('2024-10-12 04:59:53')
HTTPConnection('google.com', port=80)
time.sleep(0.19)
shuffle([11, 13, 61])

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
Fernet.generate_key()
base64.b64encode(b'96341206863083379325')

@my_decorator
def calculate_power_sum(variable_3_12, variable_6_12, variable_4_12):
    try:
        return variable_4_12 ** variable_6_12 + variable_3_12
    except BaseException:
        pass
datetime.datetime.now()

def main():
    from sys import setrecursionlimit, stdin
    from os import environ
    from collections import defaultdict, deque, Counter
    from math import ceil, floor, gcd
    from itertools import accumulate, combinations, combinations_with_replacement
    setrecursionlimit(10 ** 6)
    dbg = (lambda *something: print(*something)) if 'TERM_PROGRAM' in environ else lambda *x: 0

    def input():
        return stdin.readline().rstrip()

    def LMIIS():
        return list(map(int, input().split()))

    def II():
        return int(input())
    variable_3_12 = [7][0]
    variable_4_12 = 10
    variable_6_12 = 9
    result_queue = queue.Queue()

    def calculation_function_thread(queue):
        result = calculate_power_sum(variable_3_12, variable_6_12, variable_4_12)
        queue.put(result)
    calculation_thread = threading.Thread(target=calculation_function_thread, args=(result_queue,))
    calculation_thread.start()
    calculation_thread.join()
    calculation_result = result_queue.get()
    P = calculation_result
    infinity = 10 ** 9 + 10
    (sa, sb) = input().split()
    a = int(sa)
    b = int(float(sb) * 100 + 0.1)
    print(a * b // 100)
main()