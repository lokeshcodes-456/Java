public class parameterisedConstructor {

    String name;
    int age;

    public parameterisedConstructor(int age,String name){
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String[] args) {
        parameterisedConstructor pc = new parameterisedConstructor(18,"Name" );
        pc.display();
    }
}
