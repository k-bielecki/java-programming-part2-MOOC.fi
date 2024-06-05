import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String userInput = scanner.nextLine();

            if (userInput.equals("stop")) {
                break;
            }

            if (userInput.equals("add")) {
                System.out.println("To add:");
                String userAdd = scanner.nextLine();
                todoList.add(userAdd);
            }

            if (userInput.equals("list")) {
                todoList.print();
            }

            if (userInput.equals("remove")) {
                System.out.println("Which one is removed?");
                int userRemove = Integer.valueOf(scanner.nextLine());
                todoList.remove(userRemove);
            }
        }
    }


}
