"""names =[]; score ={}
while True:
    name = input('enter name:\n').title()
    if name == 'Done':
        break
    else:
        names.append(name)
        marks = []
        for i in range(5):
            temp =int(input("ente the marks"))
            marks.append(temp)
        
avg = sum(marks)/len(marks)
print(avg) 
def grade(avg):
    if(avg>=12):
        return D
    elif(avg>=15):
        return C
    elif(avg>=20):
        return B
    elif(avg>=25):
        return A
    else:
        return F
 """
'''null string,itreable,itreator,list comprehension, hashing mapping'''
names= []
score = {}
marks =[]
def get_input():
   while True:
        name =input("enter name").title()
        if name == "Done":
            break  
        else:
            marks = list(map(int,input('enter marks').split()))
            names.append(name)
            score[name] = marks
def main():
    get_input()
    for name,marks in score.items():
        avg = avgg(marks)
        grd = grade(avg) 
        print(f'{name} - {grd}')
"avg"
def avgg(marks):
    return sum(marks)/len(marks)
    
"GRADE"

def grade(avg):
    if(90 < avg <= 100):
        grade ="A"
    elif(80<avg):
        grade = "B"
    elif(avg<80):
        grade ="Fail"
    return grade
main()
        
