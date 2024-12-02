#x**2 = x^2
n = int(input())
digits=[]
oddsum,evensum =[0,0]
while n>0:
    digits.append((n%10)**2)
    n = n//10
temp =[]
for num in range(len(digits)-1,-1,-1):
    temp.append(digits[num]) 
pos =1; sum = 0
for digit in temp:
    if pos&1:
        sum = sum + digit  
    else:
        sum = sum - digit
    pos = pos+1
print(sum)

'''
# n = int(input()[::-1])
# while n>0: digit.insert(0,(n%10)**2) 
# to find squre of each digit from left to right 
#  store the reminder in a list after the dividing with 10
# float divide the no. with 10 to remove last digit
#repeat the process to get all digit of the no. 
# reverse the list Note:- when you divide the no the no will taken from the left side to right side for this program we need right to left side reverse the input 
# replace each no with its squre
# Add all odd postion values and even postion values 
# print (oddsum - evensum)
#list comprehension: it is using for loops in single line , list compresion is work on for loops in one line
# temp=[int(digit)for digit in n] 
'''