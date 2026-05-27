import java.util.Scanner;

public class YakovenkoJava {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n=== ЗАДАНИЕ 1: Работа с числами ===");
        
        int a = readInt(scanner, "Введите первое целое число (a): ");
        int b = readInt(scanner, "Введите второе целое число (b): ");
        
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        
        if (b != 0) {
            System.out.println("a / b = " + ((double) a / b));
        } else {
            System.out.println("a / b = Деление на ноль невозможно");
        }
        
        System.out.println("\n=== ЗАДАНИЕ 2: Сравнение строк ===");
        
        scanner.nextLine();
        
        System.out.print("Введите первую строку: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Введите вторую строку: ");
        String str2 = scanner.nextLine();
        
        if (str1.equals(str2)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
        
        System.out.println("\n=== ЗАДАНИЕ 3: Чётные числа из массива ===");
        
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        System.out.print("Чётные числа: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
        
        scanner.close();
    }
    
    private static int readInt(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("ОШИБКА: Введите целое число!");
                scanner.next();
            }
        }
    }
}
