public class Main {


    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("hello");
        System.out.println(s.length());
        System.out.println(s.capacity());
    }


    public static boolean isPrime(int num) {
        boolean result = true;
        if (num <= 1) {
            result = false;
        }else{
            for (int x = 2; x < Math.sqrt(num); x++) {
                if (num % x == 0) {
                    result = false;
                }
            }
        }
        return result;
    }
}
