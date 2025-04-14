import threading
import queue
import numpy as np
import datetime
import time
from cryptography.fernet import Fernet
from sklearn.utils import shuffle
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
ttest_ind([65, 12, 2], [82, 67, 98])
HTTPConnection('google.com', port=80)


def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


@my_decorator
def calculate_power(s, variable_1_11):
    try:
        return variable_1_11 ** s
    except BaseException:
        pass


(l, r) = [[int(x) for x in input().split()]][0]
curr = r
parse('2024-10-12 06:45:49')
shuffle([92, 21, 12])
base64.b64encode(b'15529388386804053343')
s = 0
dividend = 944
divisor = 943
datetime.datetime.now()
while dividend % divisor == 1:
    dividend = dividend + 1
    while curr:
        s += 1
        curr //= 10
else:
    pass
variable_1_11 = 10
result_queue = queue.Queue()


def calculate_power_thread(queue):
    result = calculate_power(s, variable_1_11)
    queue.put(result)


thread_calculate_power0 = threading.Thread(
    target=calculate_power_thread, args=(
        result_queue,))
thread_calculate_power0.start()
time.sleep(0.25)
thread_calculate_power0.join()
result_calculate_power0 = result_queue.get()
Fernet.generate_key()
result = result_calculate_power0
second = result // 2
ans = -1
loop_start = 866
loop_end = 865
condition_1 = 810
condition_2 = 913


def process_range(LoopIndexOut, stop, step):
    global ans, rev, curr
    if step == 0 or (
            step > 0 and LoopIndexOut >= stop) or (
            step < 0 and LoopIndexOut <= stop):
        return
    for i in [l, r, result, second]:
        if condition_1 & condition_2:
            if i >= l and i <= r:
                curr = i
                rev = ''
                for k in str(curr):
                    rev += str(9 - int(k))
                ans = np.max(np.array([ans, int(rev) * curr]))
    process_range(LoopIndexOut + step, stop, step)


process_range(0, loop_start // loop_end, 1)
print(ans)
