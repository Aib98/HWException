import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exception {
    public static void main(String [] args) throws ArithmeticException {
        OneException d = new OneException();
        int excep;
        int c = 8;
        int [] a = {4, 8, 16, 14, 64};
        int [] b = {2, 4, 0, 2, 4};
        for (int i = 0;  i < a.length; i++) {
            excep = d.number(a [i], b [i]);
            System.out.println(excep);
        }
        System.out.println();

        // Обработка проверяемого исключения с помощью внутрених методов.
        // Выводит ошибку и продалжает выполнять программу.
        //
        File file = new File("1234");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Файл не найден ");
        }

        try {// Доработать
            Scanner scanner = new Scanner(System.in);
            System.out.println("Необходимо вести число: ");
            int pushKey = scanner.nextInt();
        }catch (ArithmeticException e){
            System.out.println("Необходимо еще раз ввести цифры");
        }


        try {
            System.out.println("Вы указали следующее число: " + pushKey);
        } catch (ArithmeticException e) {
            System.out.println("Прошу использовать цифры: ");
            throw e;
        }






//        String str = null;
//        System.out.println(str.length());
//        System.out.println("1");
//        main(args);

    }

}

