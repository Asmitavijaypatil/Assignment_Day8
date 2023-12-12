import java.util.Arrays;
class Question2 {
    public static void main(String[] args){
        int[] SalesInMonth = { 125000 , 93000 , 80000 , 75000 , 84000 , 110000 , 105000 , 120000 , 90000 , 115000 , 123000 , 150000 };
        int[] QuaterlySales = new int[4];
        int SumOf1stQtr=0;
        int SumOf2ndQtr=0;
        int SumOf3rdQtr=0;
        int SumOf4thQtr=0;

        
            System.out.println(" Monthly sales report is : "+ Arrays.toString(SalesInMonth));
        

        for (int i = 0 ; i < SalesInMonth.length ; i++ ){
            if ( i == 0 ||  i < 3){
                SumOf1stQtr = SumOf1stQtr + SalesInMonth[i];
            }
            else if ( i > 2 && i < 6){
                SumOf2ndQtr = SumOf2ndQtr + SalesInMonth[i];
            }
            else if ( i > 5 && i < 9){
                SumOf3rdQtr = SumOf3rdQtr + SalesInMonth[i];
            }
            else {
                SumOf4thQtr = SumOf4thQtr + SalesInMonth[i];

            }
            
        }

        QuaterlySales[0]= SumOf1stQtr;
        QuaterlySales[1]= SumOf2ndQtr;
        QuaterlySales[2]= SumOf3rdQtr;
        QuaterlySales[3]= SumOf4thQtr;

        System.out.println("Quartly report is : "+ Arrays.toString(QuaterlySales));
        System.out.println();
        System.out.println(" Yearly sales report is : "+ (SumOf1stQtr+SumOf2ndQtr+SumOf3rdQtr+SumOf4thQtr));

    }
}