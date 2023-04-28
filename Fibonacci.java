public class Fibonacci {
    public static void main(String[] args){
        int a = 0, b = 1, c = 1, temp = 1, num = 55;
        String fib = "";

        fib += a + ", " + b;

        while(c <= num){
            fib += ", " + c;
            a = b;
            b = c;
            c = a + b;
            temp = b;
        }

        System.out.println("Sequência de Fibonacci:{" + fib + "}");

        if(temp == num){
            System.out.println(num + "\nPertence à sequência de Fibonacci.");
        }else{
            System.out.println(num + "\nNão pertence à sequência de Fibonacci.");
        }
    }
    
}
