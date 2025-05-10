import org.w3c.dom.html.HTMLIsIndexElement;

public class Course {
    private int id;
    private String name;
    private String code;
    private int units;
    private String instructor;


    // Constructor

    public Course(int id, String name, String code, int units, String instructor) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.units = units;
        this.instructor = instructor;
    }

    // getter and setter


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public String getCode(){
        return code;
   }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", units=" + units +
                ", instructor='" + instructor + '\'' +
                '}';
    }
}
