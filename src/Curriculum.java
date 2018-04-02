import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Objects;
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
    }

    public int totalHrsCurriculum() {
        int total =0;
        for (int i = 0; i <curriculum.size() ; i++) {
            total= curriculum.get(i).getCreditHours() +total;
        }
        return total;
    }

    public int countNumDept(String c) {
        int count=0;
        for (int i = 0; i <curriculum.size() ; i++) {
            if(curriculum.get(i).getDepartment().equals(c)){
                count++;
            }
        }
        return count;
    }

    public  boolean checkForCourse(String course) {
        boolean check = false;
        for (int i = 0; i <curriculum.size() ; i++) {
            if (curriculum.get(i).equals(course)){
                check=true;
            }
        }
        return check;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Curriculum)) return false;
        Curriculum that = (Curriculum) o;
        return Objects.equals(curriculum, that.curriculum);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return  ""+curriculum;
    }
}


