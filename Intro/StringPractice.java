public class StringPractice {
    public static void main(String[] args) {
        String str = "Hello";

        // Cannot modify the existing string, can only create a new string with
        // modifications
        // str[0] = 'h'; // This will result in a compilation error
        // str += " World"; // This will create a new string object, not modify the
        // existing one

        // Cannot append characters directly to the existing string
        // str.append(" World"); // This will result in a compilation error

        // Cannot remove characters from the existing string
        // str.deleteCharAt(0); // This will result in a compilation error

        // Cannot change case of characters in the existing string
        // str.toUpperCase(); // This will create a new string object, not modify the
        // existing one
        // str.toLowerCase(); // This will create a new string object, not modify the
        // existing one

        // Cannot reverse the existing string
        // str.reverse(); // This will result in a compilation error

        System.out.println(str); // Output: Hello

    }
}
