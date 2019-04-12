public class Lesson {
    public static void main(String[] args) {
        /*name of class, static properties-variables, dynamic behaviours-functions*/
        String str = new String();
        Student student1 = new Student("nike");
        Student student2 = new Student(80);
        System.out.println(student1.getName());
        System.out.println(student2.getGrade());
    }
}
