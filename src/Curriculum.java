import java.util.ArrayList;

public class Curriculum {
    private String department;
    private  String courseNumber;
    private Integer creditHours;

    public Curriculum(String department, String courseNumber,
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
                "Department[" + department +
                "] CourseNumber[" + courseNumber +
                "] CreditHours[" + creditHours +
                "] ||";
    }


}
