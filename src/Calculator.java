public class Calculator {
    public Calculator(){}

    public int add(int a, int b){
        return a + b;
    }
    
    public int sub(int a, int b){
        return a - b;
    }

    public int mul(int a, int b){
        return a * b;
    }

    public int div(int a, int b){
        return a / b;
    }

    public double sqrt(int a){
        if (a < 0){
            throw new NegativeNumberException("Raiz quadrada de número negativo!");
        }
        return Math.sqrt(a);
    }
}
