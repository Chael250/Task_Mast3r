import java.util.Map;

public interface ITask {
    boolean isCompleted();
    String getTheTask();
    void setDescription(String task);
    void setCompleted(boolean isComplete);
    Map<String, Boolean> addToTaskList();
    void setTaskList(Map<String, Boolean> taskList);
    String getTask();
}
