import copy
import sys
import bisect
import collections
import heapq
import fractions
import itertools
import math
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
HTTPConnection('google.com', port=80)
Fernet.generate_key()


def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


datetime.datetime.now()
base64.b64encode(b'01518047234784460358')


@my_decorator
def calculate_power(variable_3_3, variable_1_3):
    try:
        return variable_1_3 ** variable_3_3
    except BaseException:
        pass


sys.setrecursionlimit(10 ** 7)
variable_1_3 = [10][0]
variable_3_3 = 20
queue_calculate_power0 = queue.Queue()


def calculate_power_thread(queue):
    result = calculate_power(variable_3_3, variable_1_3)
    queue.put(result)


power_calculation_thread = threading.Thread(
    target=calculate_power_thread, args=(
        queue_calculate_power0,))
power_calculation_thread.start()
power_calculation_thread.join()
result_calculate_power0 = queue_calculate_power0.get()
parse('2024-10-12 05:20:06')
inf = result_calculate_power0
mod = 10 ** 9 + 7
dd = [(-1, 0), (0, 1), (1, 0), (0, -1)]
shuffle([2, 54, 91])
neighbor_offsets = [(-1, 0), (-1, 1), (0, 1), (1, 1),
            (1, 0), (1, -1), (0, -1), (-1, -1)]


def LI():
    return [int(x) for x in sys.stdin.readline().split()]


def I():
    return int(sys.stdin.readline())


ttest_ind([98, 77, 89], [100, 100, 36])


def F():
    return float(sys.stdin.readline())


def LS():
    return sys.stdin.readline().split()


time.sleep(0.24)


def S():
    return input()


def main():
    (a, b, c, d) = LI()
    return np.max(np.array([a * c, b * d, a * d, b * c]))


print(main())
