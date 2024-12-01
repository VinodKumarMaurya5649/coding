def getStrinput(prompt):
     return input(prompt).strip()
def getName():
    name = getStrinput("enter your name").title()
    return name
def getDestination():
    while True:
        destination= getStrinput("please choose (beach/mountain):\t").lower()
        try:
            if destination == "mountain":
                 return "You Selected Mountain" 
            elif destination =="beach":
                 return 'you selected beach'    
        except ValueError:
            return 'pls enter valid input'            
def getGoodNum(prompt):
    while True: 
         num = int(input(prompt))
         try:
          if num>0:
             return num
         except ValueError:
              return "pls enter valid Input"
def getBudget():
           budget = getGoodNum('enter your budget')
           return budget
def days():
    days = getGoodNum("enter Days")
    return days
print(f"hello {getName()},welcome to personalized adventventure\n")
print(getDestination())
budget = getBudget()
if budget >= 500: 
   print ("luxury\n")
elif 200 <= budget <= 499: 
    print('Good\n')
elif budget <200:
    print('Budget Freindly\n')
totalCost = budget * days()
msg = f"your total cost is\n{totalCost}"
print(msg)