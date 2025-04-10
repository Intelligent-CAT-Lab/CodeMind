
import sys
import trace
import os
import unittest
class PageUtil:
    def __init__(self, data, page_size):
        self.data = data
        self.page_size = page_size
        self.total_items = len(data)
        self.total_pages = (self.total_items + page_size - 1) // page_size

    def get_page(self, page_number):
        if page_number < 1 or page_number > self.total_pages:
            return []

        start_index = (page_number - 1) * self.page_size
        end_index = start_index + self.page_size
        return self.data[start_index:end_index]

    def get_page_info(self, page_number):
        if page_number < 1 or page_number > self.total_pages:
            return {}

        start_index = (page_number - 1) * self.page_size
        end_index = min(start_index + self.page_size, self.total_items)
        page_data = self.data[start_index:end_index]

        page_info = {
            "current_page": page_number,
            "per_page": self.page_size,
            "total_pages": self.total_pages,
            "total_items": self.total_items,
            "has_previous": page_number > 1,
            "has_next": page_number < self.total_pages,
            "data": page_data
        }
        return page_info

    def search(self, keyword):
        results = [item for item in self.data if keyword in str(item)]
        num_results = len(results)
        num_pages = (num_results + self.page_size - 1) // self.page_size

        search_info = {
            "keyword": keyword,
            "total_results": num_results,
            "total_pages": num_pages,
            "results": results
        }
        return search_info
class Test(unittest.TestCase):
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
t=Test()
a=t.test()
with open('/home/changshu/CODEMIND/dataset/classeval/ClassEval_68@PageUtil.get_page_info/output.txt', 'w') as wr:
    wr.write(str(a))
        

tracer = trace.Trace(
    ignoredirs=[sys.prefix, sys.exec_prefix],
    trace=1,
    count=0)
tracer.run('t.test()')
