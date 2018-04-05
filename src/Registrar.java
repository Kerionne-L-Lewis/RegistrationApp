import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Registrar {
    public ArrayList<Course> registrar;


    public Registrar(String s) {
            File readFromFile = new File(s);
            registrar = new ArrayList<>();
            Course cpsc = null;
            try (Scanner sc = new Scanner(readFromFile)) {
                while (sc.hasNext()) {
                    String x = sc.nextLine();

                    String[] parts = x.split("  ");
                   // String[] timeParts = parts[3].split(":");

                    String dept = parts[0];
                    String courseNum = parts[1];
                    int creditHours = Integer.parseInt(parts[2]);
                   int time = Integer.parseInt(parts[3]);

                    cpsc = new Course(dept, courseNum, creditHours, time);
                    registrar.add(cpsc);
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
