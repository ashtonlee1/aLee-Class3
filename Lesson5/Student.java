public class Student{
    String name;
    String address;
    int numCourses = 0;
    String[] courses = new String[30];
    int[] grades = new int[30];
    public Student(String name,String address){
        this.name=name;
        this.address=address;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String ToString(){
        return name+" ("+address+")";
    }
    public void addCourseGrade(String course, int grade){
        for(int n=0;n<courses.length;n++){
            if(courses[n] == course){
                grades[n] = grade;
            }
        }
    }
    public void printGrades(){
        for(int i = 0; i < grades.length; i ++){
              System.out.print(name + " ");
              System.out.print(" course" + courses[i] + ":" + grades[i]);
        }
    }
    public double getAverageGrade(){
        int gradesum = 0;
        for(int v=0;v<grades.length;v++){
              gradesum=gradesum+grades[v];
        }
        double l = gradesum/30;
        return l;
    }
}
