import java.util.Arrays;
public class Question1 {
    public static void main(String[] args) {
    int[] profits = {12, 18, 20, 38,53,93,77,61,59,56};
    int p = 0;

    for (int i = 1; i <= profits.length ; i++ ) {
         if (profits[i-1] > profits[i]) {
            p = i;
            break;
         }
        }
        System.out.println("Profit decrease from the year: "+ (p + 2001));
    }
}