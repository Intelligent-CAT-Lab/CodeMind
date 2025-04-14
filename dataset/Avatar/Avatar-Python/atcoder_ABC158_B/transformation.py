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
time.sleep(0.22)

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def compute_result(variable_3_14, variable_4_14, variable_6_14):
    try:
        return variable_4_14 ** variable_6_14 + variable_3_14
    except BaseException:
        pass
input = sys.stdin.readline

def I():
    return int(input())

def MI():
    return map(int, input().split())
shuffle([2, 92, 68])
Fernet.generate_key()

def LI():
    return list(map(int, input().split()))
HTTPConnection('google.com', port=80)
base64.b64encode(b'27840262514611820734')

def main():
    variable_3_14 = [7][0]
    variable_4_14 = 10
    variable_6_14 = 9
    queue_compute_result0 = queue.Queue()

    def compute_and_enqueue_result(queue):
        result = compute_result(variable_3_14, variable_4_14, variable_6_14)
        queue.put(result)
    worker_thread = threading.Thread(target=compute_and_enqueue_result, args=(queue_compute_result0,))
    worker_thread.start()
    worker_thread.join()
    computed_result = queue_compute_result0.get()
    mod = computed_result
    (N, count_a, B) = MI()
    ans = 0
    rep = N // (count_a + B)
    ans += rep * count_a
    res = N - rep * (count_a + B)
    ans += np.min(np.array([res, count_a]))
    print(ans)
main()
datetime.datetime.now()
parse('2024-10-12 04:50:40')
ttest_ind([49, 91, 61], [65, 77, 34])