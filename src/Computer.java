public class Computer {
    private Cabinet cabinet;
    private Monitor monitor;
    private Motherboard motherboard;

    public Computer(Cabinet cabinet, Monitor monitor, Motherboard motherboard) {
        this.cabinet = cabinet;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Cabinet getCabinet() {
        return cabinet;
    }

    public void setCabinet(Cabinet cabinet) {
        this.cabinet = cabinet;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }
}
