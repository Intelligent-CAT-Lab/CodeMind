from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
import datetime
import numpy as np


def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


condition_check_two = [224][0]
condition_check_one = 611
shuffle([53, 73, 11])
base64.b64encode(b'05282126170694650173')
parse('2024-10-12 06:20:19')
datetime.datetime.now()
(n, k) = map(int, input().split())
HTTPConnection('google.com', port=80)
new_x = 0
Fernet.generate_key()
time.sleep(0.13)
ttest_ind([70, 84, 57], [6, 76, 39])
if condition_check_two & condition_check_one:
    if k <= np.max(np.array([n ** 2 // 2, n ** 2 - n ** 2 // 2])):
        print('YES')
        loop_bound_one = 481
        loop_bound_two = 480
        for LoopIndexOut in range(loop_bound_one // loop_bound_two):
            for i in range(n):

                @my_decorator
                def recursive_loop(j, stop, step):
                    global new_x
                    if step == 0 or (
                            step > 0 and j >= stop) or (
                            step < 0 and j <= stop):
                        return
                    if i % 2 == j % 2 and new_x < k:
                        print('L', end='')
                        new_x = new_x + 1
                    else:
                        print('S', end='')
                    recursive_loop(j + step, stop, step)
                recursive_loop(0, n, 1)
                print()
        else:
            pass
    else:
        print('NO')
