public class Screen {
    private double diagonal;
    private TypeOfScreen typeOfScreen;
    private double weight;

    @Override
    public String toString() {
        return "Screen{" +
                "diagonal=" + diagonal +
                ", typeOfScreen=" + typeOfScreen +
                ", weight=" + weight +
                '}';
    }

    public Screen(double diagonal, TypeOfScreen typeOfScreen, double weight) {
        this.diagonal = diagonal;
        this.typeOfScreen = typeOfScreen;
        this.weight = weight;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public TypeOfScreen getTypeOfScreen() {
        return typeOfScreen;
    }

    public void setTypeOfScreen(TypeOfScreen typeOfScreen) {
        this.typeOfScreen = typeOfScreen;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
