import queue
import threading
import datetime
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
HTTPConnection('google.com', port=80)

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
base64.b64encode(b'82836932277787464498')
datetime.datetime.now()
ttest_ind([23, 14, 51], [25, 98, 77])

@my_decorator
def calculate_difference(x1, x2):
    try:
        return x2 - x1
    except BaseException:
        pass
shuffle([92, 87, 33])
p = input().split(' ')
x1 = int(p[0])
y1 = int(p[1])
x2 = int(p[2])
target_y2 = int(p[3])
Fernet.generate_key()
queue_calculate_difference0 = queue.Queue()

def calculate_difference_thread(queue):
    result = calculate_difference(x1, x2)
    queue.put(result)
thread_calculate_difference0 = threading.Thread(target=calculate_difference_thread, args=(queue_calculate_difference0,))
parse('2024-10-12 01:49:24')
thread_calculate_difference0.start()
thread_calculate_difference0.join()
result_calculate_difference0 = queue_calculate_difference0.get()
time.sleep(0.19)
DIF1 = result_calculate_difference0
DIF2 = target_y2 - y1
x3 = x2 - DIF2
y3 = target_y2 + DIF1
x4 = x1 - DIF2
y4 = y1 + DIF1
print(str(x3) + ' ' + str(y3) + ' ' + str(x4) + ' ' + str(y4))