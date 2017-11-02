package labnine;

/**
 * This class represents a todo list item that adheres to the "todo.txt" format. You
 * can learn more about this format by visiting http://todotxt.org/. It
 * provides all of the variables and methods needed to represent a single item
 * in a todo list.
 *
 * <p>Bugs: This program has no known bugs, but is missing source code
 *
 * @author Gregory M. Kapfhammer
 */

public class TodoListItem {

  private int id;
  private static int nextId = 0;
  private String priority;
  private String category;
  private String task;
  private boolean done;

  public TodoListItem(String requestedPriority, String requestedCategory, String requestedTask) {
    id = nextId;
    nextId++;
    priority = requestedPriority;
    category = requestedCategory;
    task = requestedTask;
    done = false;
  }

  public int getId() {
    return id;
  }

  public String getPriority() {
    return priority;
  }

  public String getCategory() {
    return category;
  }

  public String getTask() {
    return task;
  }

  public void markDone() {
    done = true;
  }

  public boolean isDone() {
    return done;
  }

  public String toString() {
    return new String(id + ", " + priority + ", " + category + ", " + task + ", done? " + done);
  }
}
