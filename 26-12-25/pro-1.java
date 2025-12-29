import java.util.Scanner;

class Library {
    static String[] books = {"Java", "Python", "C++", "Data Structures"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1.Display Books 2.Search Book 3.Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    for (String book : books)
                        System.out.println(book);
                }
                case 2 -> {
                    System.out.print("Enter book name: ");
                    String name = sc.nextLine();
                    boolean found = false;

                    for (String book : books) {
                        if (book.equalsIgnoreCase(name)) {
                            found = true;
                            break;
                        }
                    }

                    System.out.println(found ? "Book Available" : "Book Not Available");
                }
            }
        } while (choice != 3);
    }
}
