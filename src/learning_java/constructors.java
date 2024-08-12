package learning_java.learning_java;

class myMainEmployee{
    private int id;
    private String name;
    int sallary;
    public myMainEmployee(String myName,int x,int y){
        name=myName;
        id=x;
        sallary=y;
    }
    public void setName(String n){this.name=n;}
    public String getName(){return name;}
    public int getId(){return id;}
    public void setId(int i){this.id=i;}
    public int getSallary(){
        return sallary;
    }
}
public class constructors {
    public static void main(String[] args) {
            myMainEmployee bhavik = new myMainEmployee("bhavik", 27,50000);
        System.out.println(bhavik.getName());
        System.out.println(bhavik.getId());
        System.out.println(bhavik.getSallary());
        bhavik.setName("bhavik gupta");
        bhavik.setId(12);
        System.out.println(bhavik.getName());
        System.out.println(bhavik.getId());
    }
}
