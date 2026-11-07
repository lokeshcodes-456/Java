class example{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

   
}


public class encapsulation {
    public static void main(String[] args) {
        
        example eg = new example();
        eg.setAge(18);
        eg.setName("Name");
        System.out.println(eg.getAge());
        System.out.println(eg.getName());
    }
}
