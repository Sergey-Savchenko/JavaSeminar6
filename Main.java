import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String args[]) {

        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook("Notebook 1", 8, 256, "Windows10", "Blue"));
        set.add(new Notebook("Notebook 2", 16, 512, "Windows10", "Red"));
        set.add(new Notebook("Notebook 3", 32, 512, "linux", "Silver"));
        set.add(new Notebook("Notebook 4", 64, 1024, "linux", "Silver"));

        WorkWithList operation = new WorkWithList(set);
        operation.start();
    }
}
