import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Choose Book Type: just enter the number");
        System.out.println("1. Novel");
        System.out.println("2. TextBook");

        int choice = input.nextInt();
        input.nextLine(); 
        
        System.out.print("Enter title: ");
        String title = input.nextLine();

        System.out.print("Enter ID: ");
        int id = input.nextInt();

        System.out.print("Is Available (true/false): ");
        boolean available = input.nextBoolean();

        Book book;
                           
        if (choice == 1) {
            book = new Novel(title, id, available);
        } else {
            book = new TextBook(title, id, available);
        }

        System.out.println("\n--- BOOK DETAILS ---");
        book.showInfo();
    }
}