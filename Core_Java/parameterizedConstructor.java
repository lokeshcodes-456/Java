class Human{

        String name;
        int age;
        Human(String name,int age) {
            this.name = name;
            this.age = age;
        }
        void display(){
            System.out.println("Name:"+name+ " and age is " +age);
        }
}

public class parameterizedConstructor {
    

    public static void main(String[] args) {
        Human human = new Human("Lokesh", 22);
        human.display();
    }
}
