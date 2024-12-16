# library = []
# def addbook(db,Title,author,Year):
#     db.append({"title":Title,"author": author,"year":Year})

# addbook(library,"abs",'rtx',2050)
# addbook(library,"dcrvf",'Gtx',3060)
# addbook(library,"abefr",'Mtx',4060)

# def display(address):
#     for book in address:
#         print(f'title - {book["title"]}')
# display(library)
class Book:
    '''
    @params - Title,description,author,genre,year
    1. get varios book details
    2. to display book details
    '''
    def __init__(self,Title,description,author,genre,Year):
        self.title = Title
        self.description = description
        self.author= author
        self.genre= genre
        self.year=Year
    def display(self):
        return f'title - title'

book1 = Book(address,"bookname","auther",2003)