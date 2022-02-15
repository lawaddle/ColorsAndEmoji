import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class spainWithNoS {
    private List<Integer> list = new ArrayList<>(Arrays.asList([1,2,3]));
    private static final int SIZE = 10;

    public spainWithNoS() {}

    public void writeList() {


        PrintWriter out = null;
        try {
            System.out.println("Entered try statement");
            out = new PrintWriter(new FileWriter("OutFile.txt"));
            for (int i = 0; i < SIZE; i++) {
                out.println("Value at: " + i + " = " + list.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
