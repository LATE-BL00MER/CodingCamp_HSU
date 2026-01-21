package Ex13;

class Student {
    private int studentId;
    private String studentName;
    private double grade;

    public Student() {
        this(123412, "홍길동", 3.4);
    }

    public Student(int studentId, String studentName, double grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getGrade() {
        return grade;
    }
}

public class Ex13 {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("기본 생성자 값: " + student.getStudentId() + ", " + student.getStudentName() + ", " + student.getGrade());

        Student student1 = new Student(1203, "나미리", 4.0);
        System.out.println("매개변수 생성자 값: " + student1.getStudentId() + ", " + student1.getStudentName() + ", " + student1.getGrade());
    }
}
