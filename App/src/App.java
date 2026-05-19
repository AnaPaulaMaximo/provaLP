import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for(int i = 1; i <= 10; i++ ){
            System.out.print(i + " ");
        }
        input.close();
    }
}
