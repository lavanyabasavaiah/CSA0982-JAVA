public class CompositeNumbers {
    public static void main(String[] args) {
        int A = 12;
        int B = 19;
        
        for (int i = A; i <= B; i++) {
            if (isComposite(i)) {
                System.out.print(i + ", ");
            }
        }
    }
    
    public static boolean isComposite(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }
}
