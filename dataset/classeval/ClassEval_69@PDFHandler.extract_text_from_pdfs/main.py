import unittest
import PyPDF2


class PDFHandler:
    def __init__(self, filepaths):
        self.filepaths = filepaths
        # PdfFileReader is deprecated and was removed in PyPDF2 3.0.0. Use PdfReader instead.
        self.readers = [PyPDF2.PdfReader(fp) for fp in filepaths]

    def merge_pdfs(self, output_filepath):
        pdf_writer = PyPDF2.PdfWriter()

        for reader in self.readers:
            # reader.getNumPages is deprecated and was removed in PyPDF2 3.0.0. Use len(reader.pages) instead.
            for page_num in range(len(reader.pages)):
                # reader.getPage(pageNumber) is deprecated and was removed in PyPDF2 3.0.0. Use reader.pages[page_number] instead.
                page = reader.pages[page_num]
                # addPage is deprecated and was removed in PyPDF2 3.0.0. Use add_page instead.
                pdf_writer.add_page(page)

        with open(output_filepath, 'wb') as out:
            pdf_writer.write(out)
        return f"Merged PDFs saved at {output_filepath}"

    def extract_text_from_pdfs(self):
        pdf_texts = []
        for reader in self.readers:
            for page_num in range(len(reader.pages)):
                page = reader.pages[page_num]
                pdf_texts.append(page.extract_text())
        return pdf_texts
class Test(unittest.TestCase):
    def test(self):
            TestPDFHandler.setUpClass()
            TestPDFHandler.setUpClass()
            handler = PDFHandler(TestPDFHandler.test_files)
            result = handler.merge_pdfs("merged.pdf")
            return result,os.path.exists('merged.pdf')