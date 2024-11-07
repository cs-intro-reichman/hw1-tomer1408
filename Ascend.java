// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
        int lim = Integer.parseInt(args[0]);
        
        int a = (int) (Math.random() * lim);
        int b = (int) (Math.random() * lim);
        int c = (int) (Math.random() * lim);
        System.out.println(a + " " + b + " " + c);
        
        int minNumber = Math.min(a, Math.min(b, c));
        int maxNumber = Math.max(a, Math.max(b, c));
        int middleNumber = a + b + c - minNumber - maxNumber;
        System.out.println(minNumber + " " + middleNumber + " " + maxNumber);
    }
}
