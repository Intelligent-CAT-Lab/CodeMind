import string
import numpy
import math
import itertools
import heapq
import copy
import collections
import threading
import bisect
import sys
import queue
import datetime
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
time.sleep(0.27)


def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


check1 = [578][0]
check2 = 998


@my_decorator
def Func_S_0():
    try:
        return sys.stdin.readline().rstrip()
    except BaseException:
        pass


HTTPConnection('google.com', port=80)


def I():
    return int(sys.stdin.readline().rstrip())


def LI():
    return list(map(int, sys.stdin.readline().rstrip().split()))


shuffle([92, 52, 12])
Fernet.generate_key()


def LS():
    return list(sys.stdin.readline().rstrip().split())


base64.b64encode(b'18321535433453521593')
queue_LI0 = queue.Queue()


def LI_thread(queue):
    result = LI()
    queue.put(result)


thread_LI0 = threading.Thread(target=LI_thread, args=(queue_LI0,))
datetime.datetime.now()
thread_LI0.start()
thread_LI0.join()
parse('2024-10-12 05:20:40')
result_LI0 = queue_LI0.get()
(value, b) = result_LI0
if check1 & check2:
    if value > 0:
        print('Positive')
    elif value <= 0 and b >= 0:
        print('Zero')
    elif (value + b) % 2 == 0:
        print('Negative')
    else:
        print('Positive')
ttest_ind([57, 43, 34], [48, 67, 58])
