import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n\nHello, RegistrationApp!\n");

        Curriculum curriculum = new Curriculum( "curriculum.dat" );
        System.out.println( "\nCurriculum:\n" + curriculum );

        int totalHours=curriculum.totalHrsCurriculum();
        System.out.println("\n||Total hours in Curriculum " + totalHours + "||");

        int counter = curriculum.countNumDept("CPSC");
        System.out.println("How many CPSC courses are in the Curriculum? " + counter);

        boolean isCourseInCurriculum=curriculum.checkForCourse("MATH 1070");
        System.out.println("Is MATH 1070 in the Curriculum?" + isCourseInCurriculum);

    }

    private static boolean checkForCourse(ArrayList<Course> dataFromCurriculumFile, Course course) {
        boolean check = false;
        for (int i = 0; i <dataFromCurriculumFile.size() ; i++) {
            if (dataFromCurriculumFile.get(i).equals(course)){
                check=true;
        }
        }
        return check;
    }

    private static int countNumDept(ArrayList<Course> dataFromCurriculumFile) {
    int count=0;
        for (int i = 0; i <dataFromCurriculumFile.size() ; i++) {
            if(dataFromCurriculumFile.get(i).getDepartment().equals
                    (dataFromCurriculumFile.get(i).getDepartment())){
                count++;
            }
        }
        return count;
    }

    private static int totalHrsCurriculum(ArrayList<Course> dataFromCurriculumFile) {
        int total =0;
        for (int i = 0; i <dataFromCurriculumFile.size() ; i++) {
            total= dataFromCurriculumFile.get(i).getCreditHours() +total;

        }
        return total;
    }

    private static void dataToStdout(ArrayList<Course> dataFromCurriculumFile) {
        System.out.print("List read from Curriculum File(" +dataFromCurriculumFile.size() + ")" + dataFromCurriculumFile);
    }

    private static ArrayList<Course> readFromFile() {
        File readFromFile = new File("curriculum.dat");
        ArrayList<Course> cpscCurriculum = new ArrayList<>();
        Course cpsc = null;
        try (Scanner sc = new Scanner(readFromFile)) {
            while (sc.hasNext()) {
                String x = sc.nextLine();
                String[] parts = x.split("  ");

                String dept = parts[0];
                String courseNum = parts[1];
                int creditHours = Integer.parseInt(parts[2]);

                cpsc = new Course(dept, courseNum, creditHours);
                cpscCurriculum.add(cpsc);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return cpscCurriculum;

    }

}


