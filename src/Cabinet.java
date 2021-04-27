public class Cabinet {
    private String model;
    private String brand;

    public Cabinet(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }
    public void turnOnThePc(){
        System.out.println("The computer is turning on...");
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
}
