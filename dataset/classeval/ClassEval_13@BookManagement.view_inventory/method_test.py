def test(self):

        bookManagement = BookManagement()
        bookManagement.add_book("book1", 2)
        bookManagement.add_book("book2")
        expected = {"book1": 2, "book2": 1}
        return expected,bookManagement.inventory