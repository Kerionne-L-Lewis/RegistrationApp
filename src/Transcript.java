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

    public int totalHrsTranscript() {
        int total =0;
        for (int i = 0; i <transcript.size() ; i++) {
            total= transcript.get(i).getCreditHours() +total;
        }
        return total;
    }


    public  boolean checkForCourse(String dept, String num, int hours, ArrayList curriculum) {
        boolean check = false;
        if( curriculum.contains( new Course( dept, num, hours ) )) {
            check = true;
        }
        return check;
    }

    public boolean checkForCourse(String dept, String num, int hours) {
        boolean check = false;
        if(transcript.contains(new Course(dept, num, hours))){
            check = true;
        }
        return check;
    }

    public boolean checkTranscript(ArrayList<Course> curriculum){
        boolean check=false;
        for (int i = 0; i <curriculum.size() ; i++) {
            if (transcript.containsAll(curriculum)){
                check=true;
            }
        }
            return check;

    }


    @Override
    public String toString() {
        return "" + transcript;
    }



}