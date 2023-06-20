import java.util.Scanner;

//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class HomeWork2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String myStr = scanner.nextLine();
        scanner.close();
        if (myStr.isEmpty()) {
            throw new NullPointerException("Пустые строки вводить нельзя");
        }
        System.out.println("Введенная строка: " + myStr);
    }
}
