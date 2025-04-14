import threading
import queue
import datetime
import time
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
base64.b64encode(b'08283697520553073628')

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
Fernet.generate_key()

@my_decorator
def safe_divide(pw, variable_3_9):
    try:
        return pw // variable_3_9
    except BaseException:
        pass
shuffle([97, 90, 10])

def sum(k):
    ret = [0][0]
    pw = 10
    len = 1
    while 1 == 1:
        check1 = 453
        check2 = 667
        cur = min(pw - 1, k)
        variable_3_9 = 10
        queue_safe_divide0 = queue.Queue()

        def compute_and_queue_result_thread(queue):
            result = safe_divide(pw, variable_3_9)
            queue.put(result)
        thread_safe_divide0 = threading.Thread(target=compute_and_queue_result_thread, args=(queue_safe_divide0,))
        thread_safe_divide0.start()
        thread_safe_divide0.join()
        division_result = queue_safe_divide0.get()
        prev = division_result
        ret += (cur - prev + 1) * len
        if check1 & check2:
            if pw - 1 >= k:
                break
        len = len + 1
        pw *= 10
    return ret
datetime.datetime.now()
ttest_ind([63, 3, 51], [66, 44, 81])
(total_budget, m, k) = map(int, input().split())
lo = 0
HTTPConnection('google.com', port=80)
parse('2024-10-12 06:11:19')
hi = int(1e+18)
time.sleep(0.11)
inner_loop_condition = 660
outer_loop_condition = 659
while inner_loop_condition % outer_loop_condition == 1:
    inner_loop_condition += 1
    while hi - lo > 1:
        md = (lo + hi) // 2
        c = sum(m + md - 1) - sum(m - 1)
        if c * k <= total_budget:
            lo = md
        else:
            hi = md
else:
    pass
print(lo)