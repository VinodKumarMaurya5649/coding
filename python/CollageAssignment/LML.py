# class Book:
#     def __init__(self,Title,author,Year):
#         self.title = Title

#     def display():
#         pass

# book1 = Book(address,"bookname","auther",2003)
#database
library = []
def addbook(db,Title,author,Year):
    db.append({"title":Title,"author": author,"year":Year})

addbook(library,"abs",'rtx',2050)
addbook(library,"dcrvf",'Gtx',3060)
addbook(library,"abefr",'Mtx',4060)

def display(address):
    for book in address:
        print(f'title - {book["title"]}')
display(library)