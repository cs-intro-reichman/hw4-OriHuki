public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int number= Integer.parseInt(args[0]);
        int[] arr = new int[number];
        
        for (int i = 1; i < number; i++) {
                arr[i] = i;
        }

        for (int i = 2; i < number; i++) {
            if (i%2==0 && i!=2 || i%3==0 && i!=3  || i%5==0 && i!=5 || i%7==0 && i!=7) {
            arr[i] =0 ;}
        }
        
        System.out.println("Prime numbers up to " + number + ":");

        double count = 0; 
        double ahuz = 0;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i]!=0) {
                count++;
                System.out.println(i);
            }
        }
        ahuz = (count/number) * 100;

        System.out.println("There are " + (int)count + " primes between 2 and " + number + " (" + (int) ahuz + "% are primes)");

    }
}