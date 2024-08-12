package learning_java.learning_java;

class employee1 {
    int id;
    String name;
    int salary;
    public void printdetails(){
        System.out.println(id);
        System.out.println(name);
    }
    public int getSalary(){
        return salary;
    }
}

public class custom_class {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        employee1 bhavik= new employee1();
        employee1 simar= new employee1();

        //attributes for simar
        simar.id=7;
        simar.name="simar singh kang";
        simar.salary=150;

        //attributes for bhavik
        bhavik.id=4;
        bhavik.name="SUPER CLAN";
        bhavik.salary=250;

        // printing the attributes
        simar.printdetails();
        bhavik.printdetails();
        int salary= bhavik.getSalary();
        System.out.println(salary);
    }
}
