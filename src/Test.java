public class Test {
    public static void main(String[] args) {
        Resolution resolution=new Resolution(1920,1080);
        Monitor monitor=new Monitor("VP249QGR","ASUS","23.8",resolution);
        Cabinet cabinet=new Cabinet("600W 80 Plus","Rampage Hacker");
        Motherboard motherboard=new Motherboard("B460m-a Pro","MSI","Windows");
        Computer computer=new Computer(cabinet,monitor,motherboard);
        computer.getCabinet().turnOnThePc();
        computer.getMonitor().turnOnTheMonitor();
        computer.getMotherboard().installTheOs("Linux");
        computer.getMonitor().turnOffTheMonitor();
    }
}
