import javax.accessibility.AccessibleSelection;

public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5.0 , 3.0);
        Rectangle rect2 = new Rectangle(10.5 , 4.2);
        Rectangle rect3 = new Rectangle(12.5 , 5.2);
        Rectangle rect4 = new Rectangle(14.5 , 7.2);
        Rectangle rect5 = new Rectangle(15.5 , 7.2);
        System.out.println("Created 5 Rectangle objects. ");

        Employee emp1 = new Employee("Rafin" , 066 , 50000.0);
        Employee emp2 = new Employee("joy" , 067 , 40000.0);
        Employee emp3 = new Employee("shakib" , 067 , 40000.0);
        Employee emp4 = new Employee("sojol" , 067 , 40000.0);
        Employee emp5 = new Employee("shopnil" , 067 , 40000.0);
        System.out.println("Created 5 Employee objects. ");

        Circle cir1 = new Circle(6);
        Circle cir2 = new Circle(7);
        Circle cir3 = new Circle(8);
        Circle cir4 = new Circle(9);
        Circle cir5 = new Circle(10);

        System.out.println("Created 5 Circle objects.");


        Car cr1 =  new Car( "toyota",  "camre" ,  2020);
        Car cr2 =  new Car( "honda" ,"civic" , 2022);
        Car cr3 =  new Car( "ford", "mustang",  2022);
        Car cr4 =  new Car( "Tesla", "model3" , 2022);
        Car cr5 =  new Car( "Chevrolet" ,"malibu " , 2022);

        System.out.println("Created 5 Car objects.");

        Student std1 = new Student ( "rafin", 1 ,"cse" , "spring2026");
        Student std2 = new Student( "joy" , 2 , "cse" , "spring2026");
        Student std3 = new Student( "shakib" , 3 , "cse" , "spring2026");
        Student std4 = new Student( "sopnil" , 4, "cse" , "spring2026");
        Student std5 = new Student( "sozol" , 5 , "cse" , "spring2026");
        System.out.println("Created 5 Student objects.");
    }
}