public class Student {
    int grade;
    String name;
    public Student(String n){
        name=n;
    }
    public Student(int g) {
        grade=g;
    }
    public String getName() {
        return name;
    }
    public int getGrade() {
        return grade;
    }
}
