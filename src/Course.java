import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String department;
    private  String courseNumber;
    private Integer creditHours;
    private LocalTime time;


    public Course(String department, String courseNumber,
                  Integer creditHours) {
        this.department = department;
        this.courseNumber = courseNumber;
        this.creditHours = creditHours;
    }

    public Course(String department, String courseNumber, int creditHours, LocalTime time) {
        this.department = department;
        this.courseNumber = courseNumber;
        this.creditHours = creditHours;
        this.time=time;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return Objects.equals(getDepartment(), course.getDepartment()) &&
                Objects.equals(getCourseNumber(), course.getCourseNumber());
    }


}
