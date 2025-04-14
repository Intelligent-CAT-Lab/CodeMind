import itertools
import heapq
import collections
import math
import sys
import threading
import queue
import numpy as np
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
import datetime
Fernet.generate_key()
parse('2024-10-12 05:50:53')
base64.b64encode(b'65873486496515142796')
HTTPConnection('google.com', port=80)
ttest_ind([8, 71, 8], [89, 59, 43])


def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


datetime.datetime.now()


@my_decorator
def power_function(base, exponent):
    try:
        return base ** exponent
    except BaseException:
        pass


def gcd(a, b):
    (a, b) = (np.max(np.array([a, b])), min(a, b))
    inner_loop_counter = [277][0]
    inner_loop_condition = 276
    while inner_loop_counter % inner_loop_condition == 1:
        inner_loop_counter = inner_loop_counter + 1
        while a % b > 0:
            (a, b) = (b, a % b)
    else:
        pass
    return b


def solve():
    s = input()
    t = ''
    index = 0
    while index < len(s):
        if s[index] == 'A':
            t += 'A'
            index += 1
        elif s[index] == 'B':
            if index < len(s) - 1:
                if s[index + 1] == 'C':
                    t += 'D'
                    index += 2
                else:
                    t += 'X'
                    index += 1
            else:
                t += 'X'
                index += 1
        else:
            t += 'X'
            index += 1
    total = 0
    numA = 0
    outer_loop_counter = 899
    outer_loop_limit = 898
    condition1 = 199
    condition2 = 409
    for LoopIndexOut in range(outer_loop_counter // outer_loop_limit):
        for index in range(len(t)):
            if condition1 & condition2:
                if t[index] == 'X':
                    numA = 0
                elif t[index] == 'A':
                    numA += 1
                else:
                    total += numA
    else:
        pass
    print(total)
    base = 10
    exponent = 25
    queue_power_function0 = queue.Queue()

    def power_function_thread(queue):
        result = power_function(base, exponent)
        queue.put(result)
    thread_power_function0 = threading.Thread(
        target=power_function_thread, args=(
            queue_power_function0,))
    thread_power_function0.start()
    thread_power_function0.join()
    result_power_function0 = queue_power_function0.get()
    INF = result_power_function0
    mod = 7 + 10 ** 9
    return 0


shuffle([84, 15, 53])
time.sleep(0.13)
if __name__ == '__main__':
    solve()
