package learning_java.learning_java;

import java.util.Scanner;
class cellphone {
    public String ringing(){
        return "ringing............";
    }
    public String vibrating(){
        return "vibrating...........";
    }
}
class employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}
class square {
    int side;
    public void getside(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter side: ");
        side= sc.nextInt();
    }
    public int perimeter(){
        return 4*side;
    }
    public int area(){
        return side*side;
    }
}
class rectangle {
    int sidea;
    int sideb;
    public void getside(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length: ");
        sidea= sc.nextInt();
        System.out.print("enter breadth: ");
        sideb =sc.nextInt();
    }
    public int perimeter(){
        return 2*(sidea+sideb);
    }
    public int area(){
        return sidea*sideb;
    }
}
class TommyVecetti{
    public void hit(){
        System.out.println("hitting");
    }
    public void run(){
        System.out.println("running");
    }
    public void fire(){
        System.out.println("firing");
    }
}
class circle {
    int radius;
    public void getside(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter radius: ");
        radius= sc.nextInt();
    }
    public float perimeter(){
        return 2*3.14f*radius;
    }
    public float area(){
        return 3.14f*radius*radius;
    }
}
public class oops_practice {
    public static void main(String[] args) {
        employee bhavik=new employee();
        bhavik.setName("super clan");
        System.out.println(bhavik.getName());
        bhavik.salary=450;
        System.out.println(bhavik.getSalary());
        cellphone MI=new cellphone();
        System.out.println(MI.ringing());
        System.out.println(MI.vibrating());
        rectangle my=new rectangle();
        my.getside();
        System.out.println(my.perimeter());
        System.out.println(my.area());
        TommyVecetti character=new TommyVecetti();
        character.run();
        character.fire();
        character.hit();
        circle c=new circle();
        c.getside();
        System.out.println(c.area());
        System.out.println(c.perimeter());

    }
}
