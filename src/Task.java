import java.time.LocalDate;
import java.util.Date;

public class Task {
    private String name;
    private LocalDate date;
    private String priority;
    private int id;
    private String tag;
    private String list;

    public Task(String name, LocalDate date, String priority, int id, String tag, String list) {
        this.name = name;
        this.date = date;
        this.priority = priority;
        this.id = id;
        this.tag = tag;
        this.list = list;
    }
    public Task()
    {

    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }


}
