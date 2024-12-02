n = int(input())
sum_of_odd = 0
sum_of_even= 0
sum = 0
temp = n
cowhile temp!=0:
    digit = temp % 10
    if (count %2 == 0):
        sum_of_even =sum_of_even +digit
    else:
        sum_of_odd =sum_of_odd+digit
    temp = temp//102
    count= count +1
result = sum_of_odd - sum_of_even
print(result)unt=0
  