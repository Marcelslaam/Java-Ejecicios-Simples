public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 100; i++) {
            boolean divisiblePor3 = i % 3 == 0;
            boolean divisiblePor5 = i % 5 == 0;
            if (divisiblePor5 && divisiblePor3) {
                System.out.println("FizzBuzz");
            }else if (divisiblePor5) {
                System.out.println("BUZZ");
            }else if (divisiblePor3) {
                System.out.println("FIzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
