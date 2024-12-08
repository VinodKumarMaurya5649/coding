tasks= []
def add_task(title,description,priority='low',deadline=Non/e):
    task ={ 'title': title,'description': description,'priority': priority
    ,'deadline':deadline,'stetus':'pending',}

    tasks.append(task) 
#display the task 
def display_tasks():
    if not tasks:
        print('NO Task')
    else:
        for i,task in enumerate(tasks,1):
            print(f"{i}. Title:{task['title']}")
            print(f"        Description:{task['description']}")
            print(f"    Deadline:{task['deadline']}")
            

def edit_task(taskindex,title=None,description=None,priority=None,deadline=None):
    if title:
        tasks[taskindex]['title'] = title
    if description:
        tasks[taskindex]['description'] = description
    if priority:
        tasks[taskindex]['priority'] = priority
    if deadline:
        tasks[taskindex]['deadline'] = deadline

def delete_task(taskindex):
    if taskindex<0 or taskindex>=len(tasks):
        print("task index out of range")
    else:
        delete = tasks.pop(taskindex)
        print(f"{delete["title"]} is deleted...")
    
def togel_stetus(taskindex):
    if taskindex<0 or taskindex>=len(tasks):
        print("task index out of range")
    else:
        tasks[taskindex]["stetus"]='completed' if tasks[taskindex]['stetus'] == 'pending' else "pending"
def main():
    pass

def filter_prior(priority):
    #filtered_task = [task for task in tasks if task['priority'] == priority]
    fitered_task= filter( lambda task,priority: task['priority'] == priority,tasks) #criteria 
    for task in fitered_task:
        printf(f'{task["title"]}')
import datetime
def filter_deadline(deadline):
    datetime.strptime(deadline,"%Y-%m-%d")
    filter_by_date=list(filter(lambda task: task["deadline"] <= deadline,tasks))
def filter_stetus(stetus):
    filtered_task = [task for task in tasks if task['stetus'] == stetus]
    return filtered_task 
display_tasks()
 
 