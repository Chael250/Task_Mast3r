import java.util.Map;

public class UrgentTask implements ITask{
    private String task;
    private Boolean isComplete;
    private Map<String, Boolean> taskList;

    public UrgentTask(String task, Boolean isComplete){
        this.task = task;
        this.isComplete = isComplete;
    }

    public boolean isCompleted(){
        return isComplete;
    }

    public String getTheTask(){
        return task;
    }

    public void setDescription(String task){
        this.task = task;
    }

    public void setCompleted(boolean isComplete){
        this.isComplete = isComplete;
    }

    public Map<String, Boolean> addToTaskList(){
        taskList.put(task, isComplete);
        return taskList;
    }

    public void setTaskList(Map<String, Boolean> taskList) {
        this.taskList = taskList;
    }

    @Override
    public String toString(){
        return task +  " -> Completed: " + isComplete;
    }

    public String getTask(){
        return task;
    }

    public void isUrgent(){
        System.out.println("This task is urgent");
    }
}
