public class Hdd {
    private TypeOfHdd typeOfHdd;
    private int volumeOfMemory;
    private double weight;

    @Override
    public String toString() {
        return "Hdd{" +
                "typeOfHdd=" + typeOfHdd +
                ", volumeOfMemory=" + volumeOfMemory +
                ", weight=" + weight +
                '}';
    }

    public Hdd(TypeOfHdd typeOfHdd, int volumeOfMemory, double weight) {
        this.typeOfHdd = typeOfHdd;
        this.volumeOfMemory = volumeOfMemory;
        this.weight = weight;
    }

    public TypeOfHdd getTypeOfHdd() {
        return typeOfHdd;
    }

    public void setTypeOfHdd(TypeOfHdd typeOfHdd) {
        this.typeOfHdd = typeOfHdd;
    }

    public int getVolumeOfMemory() {
        return volumeOfMemory;
    }

    public void setVolumeOfMemory(int volumeOfMemory) {
        this.volumeOfMemory = volumeOfMemory;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
