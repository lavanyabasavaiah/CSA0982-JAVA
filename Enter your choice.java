import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] syntax = {
            "if (condition) {\n    // code\n} else if (condition) {\n    // code\n} else {\n    // code\n}\n",
            "switch (variable) {\n    case value1:\n        // code\n        break;\n    case value2:\n        // code\n        break;\n    default:\n        // code\n}\n",
            "for (init; condition; incr/decr) {\n    // code\n}\n",
            "while (condition) {\n    // code\n}\n",
            "do {\n    // code\n} while (condition);\n"
        };

        int choice;
        do {
            System.out.println("Menu:\n1. if statement\n2. switch statement\n3. for loop\n4. while loop\n5. do-while loop\n6. Exit\nEnter your choice: ");
            choice = scanner.nextInt();
            if (choice > 0 && choice < 6) System.out.println(syntax[choice - 1]);
        } while (choice != 6);

        scanner.close();
    }
}
