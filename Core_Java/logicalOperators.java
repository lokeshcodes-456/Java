public class logicalOperators {
    public static void main(String[] args) {
        // Three operators are AND, OR, NOT

        int age = 18;
        String voterID = "Yes";

        if(age>=18 && voterID=="Yes"){
            System.out.println("You can vote");
        }
        else{
            System.out.println("No");
        }

        /*
        And operators if both are true its true else false
        Or operators if any of it is true its true
        Not operator Vice versa of yes and no
        */
    }
}
