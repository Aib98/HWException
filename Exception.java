public class Exception {
    public static void main(String [] args) {
        OneException d = new OneException();
        int excep;

        int [] a = {4, 8, 16, 14, 64};
        int [] b = {2, 4, 2, 0, 4};
        for (int i = 0;  i < a.length; i++) {
            excep = d.number(a [i], b [i]);
            System.out.println(excep);
        }
    }
}

