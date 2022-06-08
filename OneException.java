public class OneException {
    public int number (int a, int b) {

        int excep = 0;
        try {
            excep = a/b;
        }
        catch (ArithmeticException e) {
            System.out.println("Деление на 0.");
        }
        return excep;
    }
}
