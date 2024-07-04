public class Computer {
    private Cpu cpu;
    private Ram ram;
    private Hdd hdd;
    private Screen screen;
    private Keyboard keyboard;
    private static final String vendor = "RUSSIA";
    private static final String name = "COMPUTER";

    public Computer(Cpu cpu, Ram ram, Hdd hdd, Screen screen, Keyboard keyboard) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.screen = screen;
        this.keyboard = keyboard;
    }

    public double sumOfWeight(){
        return cpu.getWeight() + ram.getWeight() + hdd.getWeight() + screen.getWeight() + keyboard.getWeight();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", screen=" + screen +
                ", keyboard=" + keyboard +
                '}';
    }
}
