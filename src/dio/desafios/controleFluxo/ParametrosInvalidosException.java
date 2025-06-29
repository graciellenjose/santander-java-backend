package dio.desafios.controleFluxo;

public class ParametrosInvalidosException extends Exception {
    private int numA;
    private int numB;

    //constructor
    public ParametrosInvalidosException(int numA, int numB){
        super();
        this.numA = numA;
        this.numB = numB;
    }

    @Override
    public String toString() {
        return "O primeiro número, " + numA + ", é maior que o segundo, " + numB;
    }
}
