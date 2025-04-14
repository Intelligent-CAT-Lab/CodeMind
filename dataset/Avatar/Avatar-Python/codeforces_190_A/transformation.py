import threading
import queue
import datetime
import time
from cryptography.fernet import Fernet
from sklearn.utils import shuffle
from http.client import HTTPConnection
from scipy.stats import ttest_ind
import base64
from dateutil.parser import parse
parse('2024-10-12 06:01:42')
time.sleep(0.05)
HTTPConnection('google.com', port=80)
ttest_ind([88, 54, 84], [67, 47, 2])


def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


@my_decorator
def calculate_difference(n, m, variable_3_13):
    try:
        return n + m - variable_3_13
    except BaseException:
        pass


condition_1 = [578][0]
shuffle([66, 38, 81])
base64.b64encode(b'23949915280653130548')
condition_2 = 524
(n, m) = map(int, input().split())
if condition_1 & condition_2:
    if n < 1:
        if m < 1:
            print(n, m)
            quit()
        print('Impossible')
        quit()
if m > n:
    minimum_value = m
    variable_3_13 = 1
    queue_calculate_difference0 = queue.Queue()

    def calculate_difference_thread(queue):
        result = calculate_difference(n, m, variable_3_13)
        queue.put(result)
    thread_calculate_difference0 = threading.Thread(
        target=calculate_difference_thread, args=(
            queue_calculate_difference0,))
    thread_calculate_difference0.start()
    thread_calculate_difference0.join()
    result_calculate_difference0 = queue_calculate_difference0.get()
    max = result_calculate_difference0
    print(minimum_value, max)
Fernet.generate_key()
if m <= n:
    minimum_value = n
    max = n + m - 1
    if m == 0:
        max = n
    print(minimum_value, max)
datetime.datetime.now()
