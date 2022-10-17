public class Keyboard {
    private String brand;
    private String switches;
    private int rgbBrightness;

    public Keyboard() {
        this.brand = "Generic";
        this.switches = "Membrane";
        this.rgbBrightness = 0;
    }
    
    public Keyboard(String brand, String switches, int rgbBrightness) {
        this.brand = brand;
        this.switches = switches;
        this.rgbBrightness = rgbBrightness;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getSwitches() {
        return this.switches;
    }

    public int getCurrentBrightness() {
        return this.rgbBrightness;
    }

    public void setBrightness(int newBrightness) {
        this.rgbBrightness = newBrightness;
    }

    public void changeSwitches(String newSwitches) {
        this.switches = newSwitches;
    }
}
