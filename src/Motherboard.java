public class Motherboard {
    private String model;
    private String brand;
    private String operatingSystem;

    public Motherboard(String model, String brand, String operatingSystem) {
        this.model = model;
        this.brand = brand;
        this.operatingSystem = operatingSystem;
    }
    public String installTheOs(String os){
        this.operatingSystem=os;
        System.out.println(os+" is installed into the computer.");
        return os;
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

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
