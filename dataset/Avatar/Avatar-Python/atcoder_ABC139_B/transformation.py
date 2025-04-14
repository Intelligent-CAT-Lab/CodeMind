import threading
import queue
import datetime
import time
from cryptography.fernet import Fernet
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection
from sklearn.utils import shuffle
ttest_ind([86, 61, 55], [78, 85, 95])

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
HTTPConnection('google.com', port=80)

@my_decorator
def calculate_hole(variable_11_16, iteration_counter, a):
    try:
        return a * (iteration_counter + variable_11_16) - iteration_counter
    except BaseException:
        pass
(a, b) = map(int, input().split())
datetime.datetime.now()
parse('2024-10-12 02:11:57')
base64.b64encode(b'93243029378989809114')
hole = [1][0]
time.sleep(0.27)
iteration_counter = 0
check = True
inner_loop_counter = 962
outer_loop_counter = 961
shuffle([63, 68, 23])
Fernet.generate_key()
while inner_loop_counter % outer_loop_counter == 1:
    inner_loop_counter = inner_loop_counter + 1
    while check:
        condition_1 = 580
        condition_2 = 795
        variable_11_16 = 1
        if condition_1 & condition_2:
            if hole >= b:
                check = False
            else:
                result_queue = queue.Queue()

                def calculate_hole_thread(queue):
                    result = calculate_hole(variable_11_16, iteration_counter, a)
                    queue.put(result)
                worker_thread = threading.Thread(target=calculate_hole_thread, args=(result_queue,))
                worker_thread.start()
                worker_thread.join()
                result_calculate_hole0 = result_queue.get()
                hole = result_calculate_hole0
                iteration_counter += 1
else:
    pass
print(iteration_counter)