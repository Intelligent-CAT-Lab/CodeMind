from itertools import permutations
import queue
import threading
import numpy as np
import datetime
import time
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
ttest_ind([14, 52, 87], [10, 78, 8])
datetime.datetime.now()


def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


base64.b64encode(b'71201445044940177992')
shuffle([74, 57, 72])
time.sleep(0.0)
Fernet.generate_key()


@my_decorator
def generate_range(
        range,
        variable_19_34,
        list,
        variable_14_34,
        X,
        variable_22_34,
        variable_26_34,
        N):
    try:
        return list(range(N - variable_19_34, X + variable_22_34)) + \
            list(range(variable_14_34, N - variable_26_34))
    except BaseException:
        pass


condition1 = [723][0]
parse('2024-10-12 05:33:51')
HTTPConnection('google.com', port=80)
condition2 = 522
stop_outer = 846
stop_inner = 845
(N, X) = [int(_) for _ in input().split()]


def calc(x):

    def sub(y, debug=0):
        if debug:
            print('D', y)
        remainder = 694
        divisor = 693
        while remainder % divisor == 1:
            remainder = remainder + 1
            while len(y) > 1:
                y = [np.sort(np.array([y[i:i + 3]]))[1]
                     for i in range(len(y) - 2)]
                if debug:
                    print('D', y)
        else:
            pass
        return y
    queue_sub0 = queue.Queue()

    def sub_thread(queue):
        result = sub(x)
        queue.put(result)
    thread_sub0 = threading.Thread(target=sub_thread, args=(queue_sub0,))
    thread_sub0.start()
    thread_sub0.join()
    result_sub0 = queue_sub0.get()
    y = result_sub0
    if y[0] == 2:
        pass
        sub(x, 1)
        print('=', x)
    return y[0]


if condition1 & condition2:
    if X == 1 or X == N * 2 - 1:
        print('No')
    else:
        print('Yes')
        if X == N * 2 - 2:
            variable_14_34 = 1
            variable_19_34 = 1
            variable_22_34 = 2
            variable_26_34 = 1
            xs = generate_range(
                range,
                variable_19_34,
                list,
                variable_14_34,
                X,
                variable_22_34,
                variable_26_34,
                N)
        else:
            remaining_values = list(range(1, X - 1)) + list(range(X + 3, N * 2))
            xs = remaining_values[:N - 3] + [X + 2, X - 1, X, X + 1] + remaining_values[N - 3:]

        def print_loop(LoopIndexOut, stop, step):
            if step == 0 or (
                    step > 0 and LoopIndexOut >= stop) or (
                    step < 0 and LoopIndexOut <= stop):
                return
            for x in xs:
                print(x)
            print_loop(LoopIndexOut + step, stop, step)
        print_loop(0, stop_outer // stop_inner, 1)
