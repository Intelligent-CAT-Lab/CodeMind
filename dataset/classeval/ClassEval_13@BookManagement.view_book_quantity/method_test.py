def test(self):

        bookManagement = BookManagement()
        bookManagement.add_book("book1", 2)
        return bookManagement.view_book_quantity('book1')