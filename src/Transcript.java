import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Transcript {
    private ArrayList<Course> transcript;


    public Transcript(String s) {
        File readFromFile = new File(s);
        transcript = new ArrayList<>();
        Course cpsc = null;
        try (Scanner sc = new Scanner(readFromFile)) {
            while (sc.hasNext()) {
                String x = sc.nextLine();
                String[] parts = x.split("  ");

                String dept = parts[0];
                String courseNum = parts[1];
                int creditHours = Integer.parseInt(parts[2]);

                cpsc = new Course(dept, courseNum, creditHours);
                transcript.add(cpsc);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "" + transcript;
    }
}