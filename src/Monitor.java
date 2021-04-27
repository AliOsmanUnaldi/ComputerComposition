public class Monitor {
    private String model;
    private String brand;
    private String size;
    private Resolution resolution;

    public Monitor(String model, String brand, String size, Resolution resolution) {
        this.model = model;
        this.brand = brand;
        this.size = size;
        this.resolution = resolution;
    }
    public void turnOnTheMonitor(){
        System.out.println("The monitor is turning on...");
    }
    public void turnOffTheMonitor(){
        System.out.println("The monitor is turning off...");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
}
