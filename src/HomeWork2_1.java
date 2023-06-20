import java.util.Scanner;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
public class HomeWork2_1 {
    public static void main(String[] args) {
        showString();
    }
    private static void showString() {

        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Введите дробное число");
            float str = Float.parseFloat(scan.nextLine());
            System.out.println("Введенное число:   " + str);

        } catch (Exception e){
            System.out.println("Введено неверное значение");
        }
    }

}