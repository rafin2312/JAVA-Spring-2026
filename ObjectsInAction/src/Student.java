public class Student {
    String name;
    int roll;
    String program;
    String batch;

    public Student() {
    }

    public Student(String name, int roll, String program, String batch) {
        this.name = name;
        this.roll = roll;
        this.program = program;
        this.batch = batch;
    }

    public Student(String name, int roll, String program) {
        this.name = name;
        this.roll = roll;
        this.program = program;
    }

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getname() {
        return this.name;
    }
    public int getRoll(){
        return this.roll;}
    public String getProgram(){
        return this.program;}
    public String getBatch(){
        return this.batch;}

}
