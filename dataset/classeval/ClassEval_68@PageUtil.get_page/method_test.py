def test(self):
        self.data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        self.page_size = 3
        self.page_util = PageUtil(self.data, self.page_size)
        invalid_page_number = 0
        empty_page = []
        actual_page = self.page_util.get_page(invalid_page_number)
        return actual_page,empty_page