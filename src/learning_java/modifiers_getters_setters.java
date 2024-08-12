package learning_java.learning_java;

class myEmployee{
    private int id;
    private String name;

    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id=i;
    }
}

public class modifiers_getters_setters {
    public static void main(String[] args) {
        myEmployee bhavik = new myEmployee();
//      bhavik.id = 27;
//      bhavik.name = "SuperClan";
        bhavik.setName("super clan");
        bhavik.setId(27);
        System.out.println(bhavik.getName());
        System.out.println(bhavik.getId());
    }
}
