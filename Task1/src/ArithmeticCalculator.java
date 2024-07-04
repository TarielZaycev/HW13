public class ArithmeticCalculator {
    private int firstVariable;
    private int secondVariable;

    public ArithmeticCalculator(int firstVariable, int secondVariable) {
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
    }

    public void calculate (Operation operation){
        switch (operation){
            case ADD -> System.out.println(firstVariable + secondVariable);
            case MULTIPLY -> System.out.println(firstVariable * secondVariable);
            case SUBTRACT -> System.out.println(firstVariable - secondVariable);
        }
    }
}
