public class strings {
    public static void main(String[] args) {
        //String is a stream of characters stored in variable

        String name = new String();
        //Stack mem      Heap mem

        //Assign by
        name = "Mumbai";

        System.out.println(name);

        //Other convention of creating string is
        String name1 = "Mumbai";
        System.out.println(name1);

        //So here we can see the values of name and name 1 are equal so the compiler will throw them into string pool where the values
        // pointed will be same the memory is used efficiently

        //If we want two different pointers for values we can create 2 new string using

        String city1 = new String("Mumbai");
        String city2 = new String("Mumbai");
        System.out.println(city1.equals(city2)); //True because values are equal
        System.out.println(city1==city2); //False because pointing two different values.

        //Upper both are not equal interms of object mapping but eual in value.

        //Strings are immutable, so we use stringbuffer and stringbuilder of mutability

        // .concat and + are used to concatenate strings
        // .charAt(index) used to find char at index

        //if we're concatenating 2 strings the object reference will be changed and pointed to new string and old string will be deleted by garbage collector.
    }
}
