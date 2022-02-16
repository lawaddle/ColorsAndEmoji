import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class spainWithNoS {
    Integer[] nums = {1, 2, 3, 4, 5, 6, 7};
    private List<Integer> list = new ArrayList<>(Arrays.asList(nums));
    private static final int SIZE = 10;

    public spainWithNoS() {}

    public void writeList() {


        PrintWriter out = null;
        try {
            System.out.println("Entered try statement");
            out = new PrintWriter(new FileWriter("OutFile.txt"));
            for (int i = 0; i < SIZE-5; i++) {
                out.println("Value at: " + i + " = " + list.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
