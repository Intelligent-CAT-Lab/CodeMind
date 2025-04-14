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
HTTPConnection('google.com', port=80)


def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


datetime.datetime.now()
base64.b64encode(b'57233177785847770921')
shuffle([59, 63, 20])
time.sleep(0.07)
parse('2024-10-12 06:00:59')


@my_decorator
def Func_newFunc0_18_0(length, variable_7_18, i):
    try:
        return length - i * variable_7_18
    except BaseException:
        pass


def cutRibbon():
    ConditionChecker15 = [548][0]
    ConditionChecker25 = 855
    arr = [int(i) for i in input().split()]
    length = arr[0]
    arr = sorted(arr[1:4], reverse=False)
    if ConditionChecker15 & ConditionChecker25:
        if length % arr[0] == 0:
            print(int(length / arr[0]))
            return
    ans = 0
    if arr[0] == arr[1]:
        newk_1 = 0
        LoopChecker111 = 770
        LoopChecker211 = 769
        for LoopIndexOut in range(LoopChecker111 // LoopChecker211):
            for i in range(int(length / arr[2]) + 1):
                variable_7_18 = arr[2]
                queue_Func_newFunc0_18_00 = queue.Queue()

                def Func_newFunc0_18_0_thread(queue):
                    result = Func_newFunc0_18_0(length, variable_7_18, i)
                    queue.put(result)
                thread_Func_newFunc0_18_00 = threading.Thread(
                    target=Func_newFunc0_18_0_thread, args=(
                        queue_Func_newFunc0_18_00,))
                thread_Func_newFunc0_18_00.start()
                thread_Func_newFunc0_18_00.join()
                result_Func_newFunc0_18_00 = queue_Func_newFunc0_18_00.get()
                check = result_Func_newFunc0_18_00
                if check >= 0 and check % arr[0] == 0:
                    newk_1 = int(check / arr[0])
                    ans = max(ans, newk_1 + i)
        else:
            pass
    else:
        newk_1 = 0
        for i in range(int(length / arr[2]) + 1):
            for j in range(int(length / arr[1]) + 1):
                check = length - i * arr[2] - j * arr[1]
                if check >= 0 and check % arr[0] == 0:
                    newk_1 = int(check / arr[0])
                    ans = max(ans, newk_1 + i + j)
    print(ans)
    return


ttest_ind([30, 60, 63], [87, 98, 42])
Fernet.generate_key()
cutRibbon()
