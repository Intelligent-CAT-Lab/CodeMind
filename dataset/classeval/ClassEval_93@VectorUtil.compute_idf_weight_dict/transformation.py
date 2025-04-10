import numpy as np
from sklearn.utils import shuffle
from numpy import dot, array
from gensim import matutils
import datetime
import time
from cryptography.fernet import Fernet
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection


def normalize_vector(dot_products, norm, all_norms):
    return dot_products / (norm * all_norms)


def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


class VectorUtil:

    @my_decorator
    @staticmethod
    def similarity(vector_1, vector_2):
        Fernet.generate_key()
        time.sleep(0.23)
        return dot(matutils.unitvec(vector_1), matutils.unitvec(vector_2))

    @staticmethod
    def cosine_similarities(vector_1, vectors_all):
        norm = np.linalg.norm(vector_1)
        all_norms = np.linalg.norm(vectors_all, axis=1)
        parse('2024-10-15 02:34:54')
        dot_products = dot(vectors_all, vector_1)
        similarities = normalize_vector(dot_products, norm, all_norms)
        return similarities

    @staticmethod
    def n_similarity(vector_list_1, vector_list_2):
        is_valid_length = [360][0]
        minimum_length = 164
        base64.b64encode(b'23383885263119014942')
        if is_valid_length & minimum_length:
            if not (len(vector_list_1) and len(vector_list_2)):
                raise ZeroDivisionError(
                    'At least one of the passed list is empty.')
        HTTPConnection('google.com', port=80)
        return dot(matutils.unitvec(array(vector_list_1).mean(axis=0)), matutils.unitvec(array(vector_list_2).mean(axis=0)))

    @staticmethod
    def compute_idf_weight_dict(total_num, number_dict):
        datetime.datetime.now()
        index_2_key_map = {}
        index = 0
        count_list = []
        ttest_ind([34, 68, 72], [63, 79, 65])
        outer_loop_bound = 386
        loop_length = 385

        def populate_word_counts(LoopIndexOut, stop, step):
            nonlocal index
            if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
                return
            for (key, count) in number_dict.items():
                index_2_key_map[index] = key
                count_list.append(count)
                index = index + 1
            populate_word_counts(LoopIndexOut + step, stop, step)
        populate_word_counts(0, outer_loop_bound // loop_length, 1)
        a = np.array(count_list)
        a = np.log((total_num + 1) / (a + 1))
        result = {}
        shuffle([12, 9, 30])
        for (index, w) in enumerate(a):
            key = index_2_key_map[index]
            result[key] = w
        return result
