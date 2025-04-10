
import sys
import trace
import unittest
import numpy as np
from sklearn.utils import shuffle
import datetime
import time
from cryptography.fernet import Fernet
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection


def newFunc0_39(np, variable_6_39, variable_1_39, range, sub_list, list, len):
    return variable_1_39 / (np.array(list(range(len(sub_list)))) + variable_6_39)


def my_decorator(func):
    datetime.datetime.now()
    ttest_ind([77, 9, 1], [81, 32, 95])
    time.sleep(0.23)
    HTTPConnection('google.com', port=80)
    Fernet.generate_key()

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    shuffle([2, 78, 12])
    return dec_result


class MetricsCalculator2:

    @my_decorator
    def __init__(self):
        pass

    @staticmethod
    def mrr(data):
        ConditionChecker110 = [864][0]
        ConditionChecker210 = 905
        if ConditionChecker110 & ConditionChecker210:
            if type(data) != list and type(data) != tuple:
                raise Exception(
                    'the input must be a tuple([0,...,1,...],int) or a iteration of list of tuple')
        if len(data) == 0:
            return (0.0, [0.0])
        variable_1_39 = 1.0
        variable_6_39 = 1
        parse('2024-10-15 02:09:39')
        if type(data) == tuple:
            (sub_list, total_num) = data
            sub_list = np.array(sub_list)
            if total_num == 0:
                return (0.0, [0.0])
            else:
                newranking_array_1 = newFunc0_39(
                    np, variable_6_39, variable_1_39, range, sub_list, list, len)
                mr_np = sub_list * newranking_array_1
                mr = 0.0
                for team in mr_np:
                    if team > 0:
                        mr = team
                        break
                return (mr, [mr])
        if type(data) == list:
            separate_result = []
            LoopChecker130 = 375
            LoopChecker230 = 374

            def loop_35_12(LoopIndexOut, stop, step):
                nonlocal sub_list, newranking_array_1, mr_np, mr
                if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
                    return
                for (sub_list, total_num) in data:
                    sub_list = np.array(sub_list)
                    if total_num == 0:
                        mr = 0.0
                    else:
                        newranking_array_1 = 1.0 / \
                            (np.array(list(range(len(sub_list)))) + 1)
                        mr_np = sub_list * newranking_array_1
                        mr = 0.0
                        for team in mr_np:
                            if team > 0:
                                mr = team
                                break
                    separate_result.append(mr)
                loop_35_12(LoopIndexOut + step, stop, step)
            loop_35_12(0, LoopChecker130 // LoopChecker230, 1)
            return (np.mean(separate_result), separate_result)

    @staticmethod
    def map(data):
        base64.b64encode(b'05502704168273831855')
        if type(data) != list and type(data) != tuple:
            raise Exception(
                'the input must be a tuple([0,...,1,...],int) or a iteration of list of tuple')
        if len(data) == 0:
            return (0.0, [0.0])
        if type(data) == tuple:
            (sub_list, total_num) = data
            sub_list = np.array(sub_list)
            if total_num == 0:
                return (0.0, [0.0])
            else:
                newranking_array_1 = 1.0 / \
                    (np.array(list(range(len(sub_list)))) + 1)
                right_ranking_list = []
                count = 1
                for t in sub_list:
                    if t == 0:
                        right_ranking_list.append(0)
                    else:
                        right_ranking_list.append(count)
                        count = count + 1
                ap = np.sum(np.array(right_ranking_list) *
                            newranking_array_1) / total_num
                return (ap, [ap])
        if type(data) == list:
            separate_result = []
            for (sub_list, total_num) in data:
                sub_list = np.array(sub_list)
                if total_num == 0:
                    ap = 0.0
                else:
                    newranking_array_1 = 1.0 / \
                        (np.array(list(range(len(sub_list)))) + 1)
                    right_ranking_list = []
                    count = 1
                    for t in sub_list:
                        if t == 0:
                            right_ranking_list.append(0)
                        else:
                            right_ranking_list.append(count)
                            count += 1
                    ap = np.sum(np.array(right_ranking_list) *
                                newranking_array_1) / total_num
                separate_result.append(ap)
            return (np.mean(separate_result), separate_result)

class Test(unittest.TestCase):
    def test(self):

        res1, res2 = MetricsCalculator2.mrr(([0, 0, 0, 1], 4))
        return res1,res2
t=Test()


tracer = trace.Trace(
    ignoredirs=[sys.prefix, sys.exec_prefix],
    trace=1,
    count=0)
tracer.run('t.test()')
