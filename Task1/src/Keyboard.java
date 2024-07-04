public class Keyboard {
    private TypeOfKeyboard typeOfKeyboard;
    private Backlight backlight;
    private double weight;

    @Override
    public String toString() {
        return "Keyboard{" +
                "typeOfKeyboard=" + typeOfKeyboard +
                ", backlight=" + backlight +
                ", weight=" + weight +
                '}';
    }

    public Keyboard(TypeOfKeyboard typeOfKeyboard, Backlight backlight, double weight) {
        this.typeOfKeyboard = typeOfKeyboard;
        this.backlight = backlight;
        this.weight = weight;
    }

    public TypeOfKeyboard getTypeOfKeyboard() {
        return typeOfKeyboard;
    }

    public void setTypeOfKeyboard(TypeOfKeyboard typeOfKeyboard) {
        this.typeOfKeyboard = typeOfKeyboard;
    }

    public Backlight getBacklight() {
        return backlight;
    }

    public void setBacklight(Backlight backlight) {
        this.backlight = backlight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
