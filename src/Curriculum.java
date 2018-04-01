import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Curriculum {
    private ArrayList<Course> curriculum;

    public Curriculum(String s) {
        File readFromFile = new File(s);
        curriculum = new ArrayList<>();
        Course cpsc = null;
        try (Scanner sc = new Scanner(readFromFile)) {
            while (sc.hasNext()) {
                String x = sc.nextLine();
                String[] parts = x.split("  ");

                String dept = parts[0];
                String courseNum = parts[1];
                int creditHours = Integer.parseInt(parts[2]);

                cpsc = new Course(dept, courseNum, creditHours);
                curriculum.add(cpsc);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return curriculum;
    }


    @Override
    public String toString() {
        return "Curriculum{" +
                "curriculum=" + curriculum +
                '}';
    }
}

