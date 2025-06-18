import matplotlib.pyplot as p
Cat = ['A', 'B', 'C', 'D']
values = [5, 7, 3, 8]
p.bar(Cat, values, color=['red', 'blue', 'green', 'orange'])
p.xlabel('Cat')
p.ylabel('values')
p.title('Cat Values Bar Chart')
p.show()