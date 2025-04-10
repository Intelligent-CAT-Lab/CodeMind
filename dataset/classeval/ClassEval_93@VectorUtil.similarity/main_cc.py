import numpy as np
from gensim import matutils
from numpy import dot, array
class VectorUtil: 
    def similarity(vector_1, vector_2):
        return dot(matutils.unitvec(vector_1), matutils.unitvec(vector_2))