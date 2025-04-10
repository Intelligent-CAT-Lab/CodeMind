def test(self):
        self.data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        self.page_size = 3
        self.page_util = PageUtil(self.data, self.page_size)
        page_number = 3
        expected_info = {
            "current_page": 3,
            "per_page": 3,
            "total_pages": 4,
            "total_items": 10,
            "has_previous": True,
            "has_next": True,
            "data": [7, 8, 9]
        }
        actual_info = self.page_util.get_page_info(page_number)
        return actual_info,expected_info