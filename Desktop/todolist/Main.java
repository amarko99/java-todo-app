import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();
        String input;

        System.out.println("Välkommen till To-Do List!");

        do {
            System.out.println("\n1. Lägg till uppgift");
            System.out.println("2. Lista uppgifter");
            System.out.println("3. Markera som klar");
            System.out.println("4. Avsluta");
            System.out.print("Välj: ");
            input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.print("Skriv beskrivning: ");
                    String desc = scanner.nextLine();
                    manager.addTask(desc);
                    break;
                case "2":
                    manager.listTasks();
                    break;
                case "3":
                    System.out.print("Vilken uppgift (nummer): ");
                    int num = Integer.parseInt(scanner.nextLine()) - 1;
                    manager.markDone(num);
                    break;
                case "4":
                    System.out.println("Avslutar...");
                    break;
                default:
                    System.out.println("Ogiltigt val.");
            }
        } while (!input.equals("4"));

        scanner.close();
    }
}
