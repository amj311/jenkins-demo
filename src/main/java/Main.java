public class Main {
    public static void main(String[] args) {
        String command = args[0];

        Calculator calc = new Calculator();

        switch (command) {
            case "add":
                int add1 = Integer.parseInt(args[1]);
                int add2 = Integer.parseInt(args[2]);
                System.out.println(calc.add(add1, add2));
                break;

            case "subtract":
                int sub1 = Integer.parseInt(args[1]);
                int sub2 = Integer.parseInt(args[2]);
                System.out.println(calc.subtract(sub1, sub2));
                break;


            case "multiply":
                int mult1 = Integer.parseInt(args[1]);
                int mult2 = Integer.parseInt(args[2]);
                System.out.println(calc.multiply(mult1, mult2));
                break;



            case "divide":
                int div1 = Integer.parseInt(args[1]);
                int div2 = Integer.parseInt(args[2]);
                System.out.println(calc.divide(div1, div2));
                break;

            case "binary":
                int bin = Integer.parseInt(args[1]);
                System.out.println(calc.intToBinaryNumber(bin));
                break;

            case "fib":
                int fib = Integer.parseInt(args[1]);
                System.out.println(calc.fibonacciNumberFinder(fib));
                break;

            default:
                System.out.println("Invalid command.");

        }
    }
}
