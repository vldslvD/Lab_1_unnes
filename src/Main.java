import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i=1; i<=num; i++){
            int sum = 0;
            for (int j=1; j<i; j++){
                if(i % j == 0){
                    //System.out.println(j);
                    sum += j;
                }
            }
            if(sum == i) {
                System.out.println(i);

            }
        }
    }
}
