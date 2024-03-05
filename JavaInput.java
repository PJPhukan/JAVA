
//Import scanner function from the java utils
import java.util.Scanner;

public class JavaInput {
    public static void main(String[] args) {
        // Java variable declearation
        int a, b;
        char ch;
        String s;

        // Scan user input
        Scanner sc = new Scanner(System.in);

        // Print execute result
        System.out.println("Enter the value of a ");
        // Integer input from the user
        a = sc.nextInt();

        // Integer input from the user
        System.out.println("Enter the value of a ");
        b = sc.nextInt();

        // character input from the user
        System.out.println("Enter the value of ch ");
        ch = sc.next().charAt(0);

        // When we use "nextInt()" or other methods like "nextDouble()", "next()" etc., it reads the token (like an integer) but leaves the newline character (Enter key press) in the input buffer. When we later use "nextLine()", it reads the remaining newline character and considers it as the input for the next line.So we use a consume the newline character
        // Consume the newline character
        sc.nextLine();

        // String input from the user
        System.out.println("Enter the string s: ");
        s = sc.nextLine();

        sc.close();
        // Integer value print
        System.out.println("The value of a is : " + a);
        System.out.println("The value of b is : " + b);

        // Character value print
        System.out.println("The value of ch is : " + ch);

        // String value print
        System.out.println("The String s is : " + s);

    }
}
