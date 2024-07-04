public class Ram {
    private TypeOfRam typeOfRam;
    private double volume;
    private double weight;

    @Override
    public String toString() {
        return "Ram{" +
                "typeOfRam=" + typeOfRam +
                ", volume=" + volume +
                ", weight=" + weight +
                '}';
    }

    public Ram(TypeOfRam typeOfRam, double volume, double weight) {
        this.typeOfRam = typeOfRam;
        this.volume = volume;
        this.weight = weight;
    }

    public TypeOfRam getTypeOfRam() {
        return typeOfRam;
    }

    public void setTypeOfRam(TypeOfRam typeOfRam) {
        this.typeOfRam = typeOfRam;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
