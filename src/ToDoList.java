import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ToDoList {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.run();
    }

    private void run() {
        HashMap map = new HashMap();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String inputLine = scanner.nextLine();
            int amountOfTasks = -1;
            String[] words = inputLine.split(" ");
            arrayList.clear();
            for (String word : words) {
                arrayList.add(word);
            }
            switch (arrayList.get(0)) {
                case "quite":
                    System.out.println("End of program");
                    return;
                case "add":
                    amountOfTasks++;
                    this.add(arrayList, amountOfTasks, formatter, map);
                    break;


            }
        }

    }
    private void add(ArrayList<String> arrayList, int amountOfTasks,
                     DateTimeFormatter formatter, HashMap map)
    {
        Task task = new Task();
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(task);
        task.setName(arrayList.get(1));
        task.setPriority(arrayList.get(2));
        String dateString = arrayList.get(3);
        LocalDate localDate = LocalDate.parse(dateString, formatter);
        task.setDate(localDate);
        task.setId(amountOfTasks);
        map.put(map.size(), tasks);
    }
}
