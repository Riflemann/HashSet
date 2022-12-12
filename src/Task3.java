import java.util.HashMap;
import java.util.Objects;

public class Task3 {
    HashMap<String, Integer> taskMap = new HashMap<>();

    public void addInTask3(String key, Integer value) {
        if (Objects.equals(this.taskMap.get(key), value)) {
            throw new IllegalArgumentException();
        }
        this.taskMap.put(key, value);
    }
}
