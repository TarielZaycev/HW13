public class Cpu {
    private Frequency frequency;
    private CountCore countCore;
    private Creator creator;
    private double weight;

    @Override
    public String toString() {
        return "Cpu{" +
                "frequency=" + frequency +
                ", countCore=" + countCore +
                ", creator=" + creator +
                ", weight=" + weight +
                '}';
    }

    public Cpu(Frequency frequency, CountCore countCore, Creator creator, double weight) {
        this.frequency = frequency;
        this.countCore = countCore;
        this.creator = creator;
        this.weight = weight;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public CountCore getCountCore() {
        return countCore;
    }

    public void setCountCore(CountCore countCore) {
        this.countCore = countCore;
    }

    public Creator getCreator() {
        return creator;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
