import java.util.Scanner;

public class hospital {
    static String[] names = new String[100];
    static int[] ages = new int[100];
    static String[] diseases = new String[100];
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n---- Hospital Management System ----");
            System.out.println("1. Add Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Search Patient");
            System.out.println("4. Delete Patient");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                addPatient(sc);
            } else if (choice == 2) {
                viewPatients();
            } else if (choice == 3) {
                searchPatient(sc);
            } else if (choice == 4) {
                deletePatient(sc);
            } else if (choice == 5) {
                System.out.println("Thank you!");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }

    static void addPatient(Scanner sc) {
        System.out.print("Enter patient name: ");
        names[count] = sc.nextLine();
        System.out.print("Enter patient age: ");
        ages[count] = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter disease: ");
        diseases[count] = sc.nextLine();
        count++;
        System.out.println("Patient added successfully!");
    }

    static void viewPatients() {
        if (count == 0) {
            System.out.println("No patients found!");
            return;
        }
        System.out.println("\n---- Patient List ----");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". Name: " + names[i] + " | Age: " + ages[i] + " | Disease: " + diseases[i]);
        }
    }

    static void searchPatient(Scanner sc) {
        System.out.print("Enter patient name to search: ");
        String name = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                System.out.println("Patient Found!");
                System.out.println("Name: " + names[i] + " | Age: " + ages[i] + " | Disease: " + diseases[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Patient not found!");
        }
    }

    static void deletePatient(Scanner sc) {
        System.out.print("Enter patient name to delete: ");
        String name = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                for (int j = i; j < count - 1; j++) {
                    names[j] = names[j + 1];
                    ages[j] = ages[j + 1];
                    diseases[j] = diseases[j + 1];
                }
                count--;
                System.out.println("Patient deleted successfully!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Patient not found!");
        }
    }
}
