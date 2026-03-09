import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Do You have a parental Consent? (True or False)");
        Boolean hasParentalConsent = scanner.nextBoolean();

        if(age >= 18 || hasParentalConsent){
            System.out.println("Access granted");
        }
        else{
            System.out.println("Access Denied");
        }

        scanner.close();
    }
}
