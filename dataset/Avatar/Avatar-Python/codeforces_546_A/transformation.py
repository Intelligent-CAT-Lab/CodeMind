from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
import datetime
ttest_ind([16, 31, 84], [100, 33, 95])
HTTPConnection('google.com', port=80)
parse('2024-10-12 06:20:41')


def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


@my_decorator
def calculate_product(i, int, k):
    try:
        return i * int(k)
    except BaseException:
        pass


condition_flag_1 = [441][0]
base64.b64encode(b'57517498269908490141')
condition_flag_2 = 571
(k, n, upper_limit) = input().split()
datetime.datetime.now()
time.sleep(0.06)
shuffle([52, 92, 29])
Fernet.generate_key()
if condition_flag_1 & condition_flag_2:
    if 1 <= int(k) and int(upper_limit) <= 1000:
        total = 0
        inner_loop_counter = 339
        outer_loop_counter = 338
        for LoopIndexOut in range(inner_loop_counter // outer_loop_counter):
            for i in range(1, int(upper_limit) + 1):
                total += calculate_product(i, int, k)
        else:
            pass
        if total > int(n):
            print(total - int(n))
        else:
            print(0)
