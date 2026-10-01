import java.util.Scanner;

class TheaterKiosk {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Ask the user to enter their age
        // Check if the age is a valid integer
        // If the age is 21 or older, give them a wrist band

        System.out.print("Enter your age: ");

        if (in.hasNextInt()) {
            int age = in.nextInt();
            in.nextLine();

            if (age >= 21) {
                System.out.println("You get a wrist band.");
            }
        } else {
            String trash = in.nextLine();
            System.out.println("Run the program again and enter a valid age!");
        }
    }
}