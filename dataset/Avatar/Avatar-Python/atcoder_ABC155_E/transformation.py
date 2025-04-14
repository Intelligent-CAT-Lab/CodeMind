import threading
import sys
import queue
import numpy as np
import datetime
import time
from cryptography.fernet import Fernet
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
shuffle([90, 51, 54])
parse('2024-10-12 04:48:26')

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def concatenate_strings(variable_1_31, s):
    try:
        return variable_1_31 + s
    except BaseException:
        pass
ttest_ind([51, 50, 31], [77, 48, 80])
datetime.datetime.now()
input_methods = [['clipboard', 'file', 'key']][0]
using_method = 0
Fernet.generate_key()
base64.b64encode(b'59091273410185274557')
input_method = input_methods[using_method]

def newIN_1():
    return map(int, input().split())
mod = 1000000007

def main_b():
    s = input()
    pp = 0
    na = 0
    inner_loop_limit = 560
    outer_loop_limit = 559
    for LoopIndexOut in range(inner_loop_limit // outer_loop_limit):
        for (i, c) in enumerate(s[::-1]):
            cc = na + int(c)
            na = 0
            if cc <= 4:
                pp = pp + cc
            else:
                na = 1
                if i == len(s) - 1:
                    pp += 1
                pp += 10 - cc
    else:
        pass
    print(pp)

def main():
    s = input()
    pmin = 1000
    mmin = 0
    variable_1_31 = '0'
    result_queue = queue.Queue()

    def concatenate_strings_thread(queue):
        result = concatenate_strings(variable_1_31, s)
        queue.put(result)
    thread_concatenate_strings0 = threading.Thread(target=concatenate_strings_thread, args=(result_queue,))
    thread_concatenate_strings0.start()
    thread_concatenate_strings0.join()
    result_concatenate_strings0 = result_queue.get()
    s = result_concatenate_strings0
    for c in s[::-1]:
        v = int(c)
        npmin = np.min(np.array([pmin + 10 - (v + 1), mmin + 10 - v]))
        nmmin = min(pmin + v + 1, mmin + v)
        pmin = npmin
        mmin = nmmin
    return min(pmin, mmin)
isTest = False
HTTPConnection('google.com', port=80)
time.sleep(0.25)

def pa(v):
    condition_check_1 = 870
    condition_check_2 = 806
    if condition_check_1 & condition_check_2:
        if isTest:
            print(v)

def input_clipboard():
    import clipboard
    input_text = clipboard.get()
    input_l = input_text.splitlines()
    for l in input_l:
        yield l
if __name__ == '__main__':
    if sys.platform == 'ios':
        if input_method == input_methods[0]:
            ic = input_clipboard()

            def input():
                return ic.__next__()
        elif input_method == input_methods[1]:
            sys.stdin = open('inputFile.txt')
        else:
            pass
        isTest = True
    else:
        pass
    ret = main()
    if ret is not None:
        print(ret)