/*****
 Michael Rodi
 ******/
public class GitDemo {
    
    private double previousNumber;
    private double reverseNum; // new variable
    
    public GitDemo() {
        previousNumber = 1;
    }
    
    /*****
     * This function should add 'num' to 'previousNumber' and return the sum.
    *****/
    public double addNumber(double num) {
        System.out.print("Add num to previousNumber");
        previousNumber += num; // adding num to previous number
        return 0;
    }
    
    /*****
     * This function should calculate the factorial of 'num' and return the resulting value.
     * i.e. if num = 4,
     *  the function will return the value of (1 * 2 * 3 * 4)
     *****/
    public double findFactorial(int num) {
        double newNumber = 1;
        
        for(int i = 1; i <= num; ++i){
            newNumber = newNumber * i;
        }
        return newNumber;
    }
    
    /*****
     * This function should reverse 'num' and return the resulting value.
     * i.e. if num = 1234
     *  the function will return 4321
     *****/
    public double reverseNumber(int num){
        double revNumber = 0;
        
        while( num != 0 ) {
            double temp = num % 10;
            revNumber = revNumber * 10 + temp;
            num /= 10;
        }
        reverseNum = revNumber; // reverseNum becomes revNumber
        
        return revNumber;
        
      
    }
    
}
