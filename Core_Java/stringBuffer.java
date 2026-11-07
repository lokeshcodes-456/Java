public class stringBuffer {
    public static void main(String[] args) {
        //Stringbuffer used for mutability and ease of usage of strings

        StringBuffer sb = new StringBuffer();

        /*
        Methods from StringBuilder class are
            sb.capacity() default size is 16 characters and increases if adds on
            sb.length()
            sb.append()
            .toString() for converting to string, so that string and stringbuilder arent same
            .deleteCharAt(index) used to delete charAt(index)
            .insert(index , str) insert at string
            .setlength() used to set length
            .ensureCapacity() used to set min capacity 
            
            Difference between string buffer and stringbuilder is stringbuffer is thread safe and stringbuilder isnt.
        */
    }
}
