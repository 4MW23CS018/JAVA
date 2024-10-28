import java.util.Scanner;

class simpleCalculator {
    private int num1;
    private int num2;
    public simpleCalculator(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    public int getSum() {
        return num1 + num2;
    }

    public int getDifference() {
        return num1 - num2;
    }

    public int getProduct() {
        return num1 * num2;
    }

    public double getDecimalDivision() {
        return (double) num1 / num2;
    }

    public int getQuotient() {
        return num1 / num2;
    }

    public int getRemainder() {
        return num1 % num2;
    }

    public double getPower() {
        return Math.pow(num1, num2);
    }
}
    public class calculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        simpleCalculator operation = new simpleCalculator(num1, num2);

        System.out.println("Sum = " + operation.getSum());
        System.out.println("Difference = " + operation.getDifference());
        System.out.println("Product = " + operation.getProduct());
        System.out.println("Decimal Division = " + operation.getDecimalDivision());
        System.out.println("Quotient = " + operation.getQuotient());
        System.out.println("Remainder = " + operation.getRemainder());
        System.out.println("Power = " + operation.getPower());

        scanner.close();
    }
}
