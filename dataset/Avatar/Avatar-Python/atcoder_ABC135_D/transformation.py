import threading
from collections import defaultdict
import math
import sys
import queue
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
import datetime

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def calculate_value(base_value, exponent_value, added_value):
    try:
        return base_value ** exponent_value + added_value
    except BaseException:
        pass
CONDITION_CHECK_VALUE_1 = [355][0]
CONDITION_CHECK_VALUE_2 = 864
sys.setrecursionlimit(10 ** 7)

def input():
    return sys.stdin.readline()[:-1]
added_value = 7
datetime.datetime.now()
base_value = 10
base64.b64encode(b'01555618894521930782')
Fernet.generate_key()
exponent_value = 9
ttest_ind([22, 98, 31], [79, 55, 74])
shuffle([11, 16, 44])
queue_calculate_value0 = queue.Queue()

def calculate_value_thread(queue):
    result = calculate_value(base_value, exponent_value, added_value)
    queue.put(result)
thread_calculate_value0 = threading.Thread(target=calculate_value_thread, args=(queue_calculate_value0,))
thread_calculate_value0.start()
thread_calculate_value0.join()
result_calculate_value0 = queue_calculate_value0.get()
mod = result_calculate_value0

def I():
    return int(input())

def II():
    return map(int, input().split())

def III():
    return list(map(int, input().split()))
parse('2024-10-12 02:08:07')

def Line(N):
    read_all = [tuple(map(int, input().split())) for _ in range(N)]
    return map(list, zip(*read_all))
S = str(input())
n = len(S)
if CONDITION_CHECK_VALUE_1 & CONDITION_CHECK_VALUE_2:
    if n == 1:
        if S == '5' or S == '?':
            print(1)
        else:
            print(0)
        exit()
dp = [[0] * 13 for i in range(n)]
HTTPConnection('google.com', port=80)
LOOP_CHECK_VALUE_1 = 258
LOOP_CHECK_VALUE_2 = 257
for LoopIndexOut in range(LOOP_CHECK_VALUE_1 // LOOP_CHECK_VALUE_2):
    for i in range(n):
        if i == 0:
            if S[i] != '?':
                dp[i][int(S[i])] += 1
            else:

                def initialize_dp_row(j, stop, step):
                    if step == 0 or (step > 0 and j >= stop) or (step < 0 and j <= stop):
                        return
                    dp[i][j] += 1
                    initialize_dp_row(j + step, stop, step)
                initialize_dp_row(0, 10, 1)
        else:
            if S[i] != '?':
                for previous_remainder in range(13):
                    dp[i][(previous_remainder * 10 + int(S[i])) % 13] += dp[i - 1][previous_remainder]
            else:
                for j in range(10):
                    for previous_remainder in range(13):
                        dp[i][(previous_remainder * 10 + j) % 13] += dp[i - 1][previous_remainder]
            for previous_remainder in range(13):
                dp[i][previous_remainder] %= mod
else:
    pass
time.sleep(0.07)
print(dp[n - 1][5])