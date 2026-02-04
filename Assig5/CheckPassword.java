//Check whether a password is valid.

import java.util.Scanner;

public class CheckPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        if (password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);

                if (ch >= 'A' && ch <= 'Z')
                    hasUpper = true;
                else if (ch >= 'a' && ch <= 'z')
                    hasLower = true;
                else if (ch >= '0' && ch <= '9')
                    hasDigit = true;
                else
                    hasSpecial = true;
            }

            if (hasUpper && hasLower && hasDigit && hasSpecial) {
                System.out.println("Password is valid.");
            } else {
                System.out.println("Password is invalid.");
            }
        } else {
            System.out.println("Password must be at least 8 characters long.");
        }

    }
}
