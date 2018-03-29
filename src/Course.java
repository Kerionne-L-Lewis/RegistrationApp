import java.util.ArrayList;

public class Course {
    private String department;
    private  String courseNumber;
    private Integer creditHours;

    public Course(String department, String courseNumber,
                  Integer creditHours) {
        this.department = department;
        this.courseNumber = courseNumber;
        this.creditHours = creditHours;
    }
    public String getDepartment() {
        return department;
    }

    public String getCourseNumber() {
        return courseNumber;
    }
    public Integer getCreditHours() {
        return creditHours;
    }

    @Override
    public String toString() {
        return
                "\n"+department +" " + courseNumber +" " + creditHours;
    }


}
