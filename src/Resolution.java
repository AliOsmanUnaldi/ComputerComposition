public class Resolution {
    private int horizontalSize;
    private int verticalSize;

    public Resolution(int horizontalSize, int verticalSize) {
        this.horizontalSize = horizontalSize;
        this.verticalSize = verticalSize;
    }

    public int getHorizontalSize() {
        return horizontalSize;
    }

    public void setHorizontalSize(int horizontalSize) {
        this.horizontalSize = horizontalSize;
    }

    public int getVerticalSize() {
        return verticalSize;
    }

    public void setVerticalSize(int verticalSize) {
        this.verticalSize = verticalSize;
    }
}
