import queue
import threading
import datetime
import time
from cryptography.fernet import Fernet
from sklearn.utils import shuffle
from http.client import HTTPConnection
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
parse('2024-10-12 01:51:48')

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
datetime.datetime.now()
HTTPConnection('google.com', port=80)

@my_decorator
def compute_value(variable_6_28, variable_4_28, variable_3_28):
    try:
        return variable_4_28 ** variable_6_28 + variable_3_28
    except BaseException:
        pass

def ok(last4):
    outer_loop_limit = [591][0]
    inner_loop_step = 590
    for LoopIndexOut in range(outer_loop_limit // inner_loop_step):
        for i in range(4):
            t = list(last4)
            if i >= 1:
                (t[i], t[i - 1]) = (t[i - 1], t[i])
            if ''.join(t).count('AGC') >= 1:
                return False
    else:
        pass
    return True

def dfs(cur, last3):
    condition1 = 30
    condition2 = 752
    if condition1 & condition2:
        if last3 in memo[cur]:
            return memo[cur][last3]
    if cur == n:
        return 1
    ret = 0
    for c in 'ACGT':
        if ok(last3 + c):
            ret = (ret + dfs(cur + 1, last3[1:] + c)) % modulo
    memo[cur][last3] = ret
    return ret
n = int(input())
variable_3_28 = 7
shuffle([98, 74, 74])
variable_4_28 = 10
variable_6_28 = 9
base64.b64encode(b'98076538561325110182')
queue_compute_value0 = queue.Queue()
ttest_ind([85, 73, 31], [93, 28, 6])

def compute_value_thread(queue):
    result = compute_value(variable_6_28, variable_4_28, variable_3_28)
    queue.put(result)
thread_compute_value0 = threading.Thread(target=compute_value_thread, args=(queue_compute_value0,))
thread_compute_value0.start()
Fernet.generate_key()
thread_compute_value0.join()
time.sleep(0.29)
result_compute_value0 = queue_compute_value0.get()
modulo = result_compute_value0
memo = [{} for i in range(n + 1)]
print(dfs(0, 'TTT'))