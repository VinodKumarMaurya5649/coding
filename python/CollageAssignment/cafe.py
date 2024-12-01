Get_day = int(input("enter no. of days"))
inc =0
sales = list(map(int, input("enter sales amoun").split()))

total_sales=0
for sale in sales:
    total_sales=total_sales+sale
    avgsale = total_sales // Get_day

for sale in sales:
    if(sale>avgsale):
        inc= inc+1

print(inc)