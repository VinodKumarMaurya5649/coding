n = int(input())
digits=[]
oddsum,evensum =[0,0]
while n>0:
    digits.insert(0,(n%10)**2) 
    n = n//10

pos =1; sum = 0
for digit in digits:
    if pos&1:
        sum = sum + digit  
    else:
        sum = sum - digit
    pos = pos+1
print(sum) 