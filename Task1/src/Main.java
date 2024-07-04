public class Main {
    public static void main(String[] args) {
        Cpu cpu = new Cpu(Frequency.FAST, CountCore.EIGHT, Creator.RGB, 2.0);
        Ram ram = new Ram(TypeOfRam.INTERNAL,33.0,2.0);
        Hdd hdd = new Hdd(TypeOfHdd.SSD,16, 2.0);
        Screen screen = new Screen(21.4,TypeOfScreen.MATRICA,2.0);
        Keyboard keyboard = new Keyboard(TypeOfKeyboard.MECHANICAL,Backlight.RGB,2.0);

        Computer computer = new Computer(cpu,ram,hdd,screen,keyboard);
        System.out.println(computer.sumOfWeight());
        System.out.println(computer);
    }
}