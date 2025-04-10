def test(self):

        vector_list1 = [np.array([1, 1]), np.array([0, 1])]
        vector_list2 = [np.array([0, 0]), np.array([1, 1])]
        similarity = VectorUtil.n_similarity(vector_list1, vector_list2)
        return similarity