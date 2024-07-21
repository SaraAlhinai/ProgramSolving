//(Problem 1 ):

import java.util.Scanner;

public class UserValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Validate username
        String username = "";
        while (true) {
            System.out.println("Enter a username :");
            username = scanner.nextLine().trim();
            if (!username.isEmpty() && username.length() <= 50) {
                System.out.println("Username vaild");
                break;
            }
            System.out.println("Username invaild");
        }
        
        // Validate password
        String password = "";
        while (true) {
            System.out.println("Enter a password:");
            password = scanner.nextLine().trim();
            if (isValidPassword(password)) {
                System.out.println("Password vaild");
                break;
            }
            System.out.println("Password invaild");
        }
        
        // Validate email
        String email = "";
        while (true) {
            System.out.println("Enter an email address:");
            email = scanner.nextLine().trim();
            if (isValidEmail(email)) {
                System.out.println("valid email");
                break;
            }
            System.out.println("Invalid email");
        }
        
        
        
        scanner.close();
    }
    
    // Method to validate password
    private static boolean isValidPassword(String password) {
        // Password must be at least 8 characters long
        if (password.length() < 8) {
            return false;
        }
        
        // Password must contain at least one special symbol
        if (!password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")) {
            return false;
        }
        
        // Password must contain one or more numbers
        if (!password.matches(".*\\d.*")) {
            return false;
        }
        
        // Password must have at least one uppercase and one lowercase letter
        if (!password.matches(".*[a-z].*") || !password.matches(".*[A-Z].*")) {
            return false;
        }
        
        return true;
    }
    
    // Method to validate email
    private static boolean isValidEmail(String email) {
        // Email should contain '@' symbol
        if (!email.contains("@")) {
            return false;
        }
        
        // Split email into local part and domain part
        String[] parts = email.split("@");
        if (parts.length != 2) {
            return false;
        }
        
        String localPart = parts[0];
        String domainPart = parts[1];
        
        // Local part should have alphanumeric characters and may include dots and underscores
        if (!localPart.matches("[a-zA-Z0-9._]+")) {
            return false;
        }
        
        // Domain part should have letters and may include dots
        if (!domainPart.matches("[a-zA-Z.]+")) {
            return false;
        }
        
        // Domain part should contain at least one dot
        if (!domainPart.contains(".")) {
            return false;
        }
        
        return true;
    }
}

