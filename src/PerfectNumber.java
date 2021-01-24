public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1)
                return false;
        else {
            int i;
            int perfect = 0;
            for (i = 1; i < number; i++) {
                if (number % i == 0) {
                    perfect = perfect + i;
                }
            }
            if (perfect == number) {
                return true;
            } else {

                return false;
            }
        }
    }
}
//Victor.Aremu