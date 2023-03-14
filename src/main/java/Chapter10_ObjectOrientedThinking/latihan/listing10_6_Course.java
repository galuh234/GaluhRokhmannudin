package Chapter10_ObjectOrientedThinking.latihan;

public class listing10_6_Course {
    private String courseName;
    private String[] student = new String[100];
    private int numberOfStudents;
    private String[] students;

    public listing10_6_Course(String courseName, String[] students) {
        this.courseName = courseName;
        for (String s : this.students = students) {
            
        }

    }
    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    public String[] getStudent() {
        return students;
    }
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public String getCourseName() {
        return courseName;
    }
    public void dropStudent(String student) {

    }
}
