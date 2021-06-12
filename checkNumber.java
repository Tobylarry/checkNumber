public class checkNumber {
    public static void main(String[] args) {
        numberChecker(-10);
    }
    public static void numberChecker(int number){
        if (number > 0){
            System.out.println("Positive number!!!");
        }
        else if (number < 0){
            System.out.println("Negative number!!!!");
        }
        else if (number == 0 ){
            System.out.println("Zero!!!");
        }
    }
}
