public class Main {
    public static void main(String args[]){
        //System.out.println( " no of arguments passed : " + args.length );
        if (args.length!=3){
            System.out.println("usage\n-----------------------------\njava Main 2 + 3 \noperator allowed + - x /  % ^");
            System.exit(1);
        } 
        double x = Double.parseDouble(args[0]);
        String math = args[1];
        double y = Double.parseDouble(args[2]);

        MathCommand mathcommand = null;
        
        switch(math){
            case "+":
                mathcommand = new AddCommand();
                break;
            case "-":
                mathcommand = new SubCommand();
                break;
            case "x":
                mathcommand = new MulCommand();
                break;
            case "/":
                mathcommand = new DivCommand();
                break;
            case "%":
                mathcommand = new ModCommand();
                break;  
            case "^":
                mathcommand = new PowCommand();
                break;
            default:
                System.out.println(" math symbol + - * / % ^ expected");
                System.exit(1);        
        }
        System.out.println(" result : " + mathcommand.calculate( x,y));
    }
}