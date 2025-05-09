public class Student {
    private int id;
    private  String name;
    private  String lastName;
    private  String studentNumber;
    private  int age;
    private  double gpa;


    // Constructor

    public Student (int id, String name, String lastName, String studentNumber,int age){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
        this.age = age;
        this.gpa = 0.0;
    }

    // getters and setters
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getStudentNumber() {
        return studentNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0 && gpa <= 20) {
            this.gpa = gpa;
        } else {
            System.out.println("The GPA must be between 0 and 20.");
        }
    }

}
