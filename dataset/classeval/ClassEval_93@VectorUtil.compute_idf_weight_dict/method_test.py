def test(self):

        num_dict = {'key1': 0.2, 'key2': 0.5}
        res = VectorUtil.compute_idf_weight_dict(2, num_dict)
        return res['key1'],res['key2']