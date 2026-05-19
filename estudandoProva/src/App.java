import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int n1 = in.nextInt();
        int n2 = in.nextInt(); 
        int n3 = in.nextInt(); 
        int n4 = in.nextInt(); 
        int n5 = in.nextInt(); 
        int n6 = in.nextInt(); 
        int n7 = in.nextInt(); 
        int n8 = in.nextInt();
        
        int[] array = {n1,n2,n3,n4,n5,n6,n7,n8};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }

        in.close();
    }
}