import sys
import queue
import threading
import numpy as np
import datetime
import time
from cryptography.fernet import Fernet
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
ttest_ind([75, 87, 70], [55, 42, 34])


def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


datetime.datetime.now()


@my_decorator
def calculate_digit_sum(int, digit_a, carry, digit_b):
    try:
        return int(digit_b) + int(digit_a) + carry
    except BaseException:
        pass


condition_check_1 = [342][0]
condition_check_2 = 728
Fernet.generate_key()
input = sys.stdin.readline
(a, b) = input()[:-1].split()
x = np.max(np.array([len(a), len(b)]))
a = a.rjust(x, '0')
shuffle([53, 36, 84])
parse('2024-10-12 06:00:23')
b = b.ljust(x, '0')
HTTPConnection('google.com', port=80)
s = ''
carry = 0
outer_loop_limit = 455
time.sleep(0.05)
outer_loop_step = 454
for LoopIndexOut in range(outer_loop_limit // outer_loop_step):

    def process_digits(i, stop, step):
        global s, d, digit_b, digit_a, carry
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        digit_b = b[i]
        digit_a = a[x - i - 1]
        digit_sum_queue = queue.Queue()

        def calculate_digit_sum_thread(queue):
            result = calculate_digit_sum(
                int, digit_a, carry, digit_b)
            queue.put(result)
        thread_calculate_digit_sum0 = threading.Thread(
            target=calculate_digit_sum_thread, args=(
                digit_sum_queue,))
        thread_calculate_digit_sum0.start()
        thread_calculate_digit_sum0.join()
        result_calculate_digit_sum0 = digit_sum_queue.get()
        d = result_calculate_digit_sum0
        if d > 9:
            s += str(d)[1]
            carry = 1
        else:
            s += str(d)
            carry = 0
        process_digits(i + step, stop, step)
    process_digits(0, x, 1)
else:
    pass
if condition_check_1 & condition_check_2:
    if carry == 1:
        s = s + '1'
print(int(s[::-1]))
base64.b64encode(b'72687840624132382719')
