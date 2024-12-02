x = ["jan","feb","mar","red"]
print(list(enumerate(x,100)))
#output = [(100, 'jan'), (101, 'feb'), (102, 'mar'), (103, 'red')] 
x = "abcdefghigklmnopqrstuvwxyz"
even,odd = x[1::2],x[::2]
print(even,odd)
print(x[1:8 :1])#slicing
'''n =input() 
oddsum ,evensum = [0,0]
for pos,digit in enumerate(n[::-1],1):
    if pos&1:
        oddsum =oddsum+int(digit) 
    else:
        evensum = evensum +int(digit)
print(oddsum-evensum)'''
