import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n\nHello, RegistrationApp!\n");

        //  ArrayList<Curriculum>dataFromCurriculumFile=readFromFile();
        //  System.out.println("List read from Curriculum File: " + dataFromCurriculumFile);
        readFromFile();
    }

    private static void readFromFile() {
        File readFromFile = new File("curriculum.dat");
        ArrayList<Curriculum> cpscCurriculum = new ArrayList<>();
        Curriculum cpsc = null;
        try (Scanner sc = new Scanner(readFromFile)) {
            while (sc.hasNext()) {
                String x = sc.nextLine();
                String[] parts = x.split("  ");

                String dept = parts[0];
                String courseNum = parts[1];
                int creditHours = Integer.parseInt(parts[2]);

                cpsc = new Curriculum(dept, courseNum, creditHours);
                cpscCurriculum.add(cpsc);
            }
            System.out.print("List read from Curriculum File(" +cpscCurriculum.size() + ")" + cpscCurriculum);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}


