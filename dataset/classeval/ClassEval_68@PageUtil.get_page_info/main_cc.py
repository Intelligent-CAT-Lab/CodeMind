
class PageUtil: 
    def __init__(self, data, page_size):
        """
        Initialize the PageUtil object with the given data and page size.
        :param data: list, the data to be paginated
        :param page_size: int, the number of items per page
        """
        self.data = data
        self.page_size = page_size
        self.total_items = len(data)
        self.total_pages = (self.total_items + page_size - 1) // page_size

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