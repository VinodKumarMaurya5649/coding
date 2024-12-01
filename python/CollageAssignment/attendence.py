names = [] ; attendence = {}
def take_input():
        while True:
            name = input('Enter Name').title()
            if name == 'Done':
                break
            else:
                marks = list(map(int,input('Enter date of present student').split()))
                names.append(name)         
                attendence[name] = marks 
def avg(marking):  
    avg_attend=len(marking)*100/10 
    return avg_attend
def find_grade(avg_attend):        
    if 50<=avg_attend<=100:
       return 'allowed'    
    else:
       return 'not allowed'
         
def main():
    take_input()    
    for name,marks in attendence.items():  
        avge=avg(marks)  
        grade=find_grade(avge) 
        print(f'{name} - {avge} - {grade}')
main()
