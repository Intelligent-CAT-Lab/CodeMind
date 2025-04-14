import threading
from cmd import IDENTCHARS
import queue
import datetime
import time
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
Fernet.generate_key()
ttest_ind([31, 94, 16], [21, 80, 90])

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def compute_result(l, variable_10_20, variable_3_20):
    try:
        return l * (l + variable_10_20) / variable_3_20
    except BaseException:
        pass
HTTPConnection('google.com', port=80)
n = int(input())
l = [1][0]
shuffle([35, 70, 8])
right_bound = n
base64.b64encode(b'14233498865065310618')
loop_counter_1 = 277
loop_counter_2 = 276
while loop_counter_1 % loop_counter_2 == 1:
    loop_counter_1 = loop_counter_1 + 1
    while l < right_bound:
        condition_1 = 659
        condition_2 = 506
        mid = l + (right_bound - l) // 2
        idxcnt = mid * (mid + 1) / 2
        if condition_1 & condition_2:
            if idxcnt < n:
                l = mid + 1
            else:
                right_bound = mid
else:
    pass
l -= 1
variable_3_20 = 2
datetime.datetime.now()
variable_10_20 = 1
result_queue = queue.Queue()

def compute_result_thread(queue):
    result = compute_result(l, variable_10_20, variable_3_20)
    queue.put(result)
compute_result_worker = threading.Thread(target=compute_result_thread, args=(result_queue,))
parse('2024-10-12 06:30:00')
compute_result_worker.start()
compute_result_worker.join()
result_compute_result0 = result_queue.get()
idxcnt = result_compute_result0
time.sleep(0.17)
print(int(n - idxcnt))