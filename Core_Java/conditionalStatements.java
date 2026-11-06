public class conditionalStatements {
    public static void main(String[] args) {
        // If else and switch statements are examples of conditional statements
        /*
        In if else the true conditions are checked and the block will be executed
        */
        int age = 18;
        if(age>=18){
            System.out.println("You can vote");
        }
        else{
            System.out.println("You cant");
        }
        // Switch is selecting an option in the menu like in ATM machine

        int option = 5;

        switch(option){
            case 1:
                System.out.println("You selected option 1");
                break;
            
            case 2:
                System.out.println("You selected option 2");
                break;
            
            case 3:
                System.out.println("You selected option 3");
                break;

            case 4:
                System.out.println("You selected option 4");
                break;

            default:
                System.out.println("You selected none of above, try again!");
                break;
        }
    }
}
