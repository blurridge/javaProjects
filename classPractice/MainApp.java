public class MainApp {
    public static void main(String[] args) {
        Keyboard oldKeyboard = new Keyboard();
        Keyboard newKeyboard = new Keyboard("Steelseries", "Blue", 40);
        System.out.println("The old keyboard is a " + oldKeyboard.getBrand() + " keyboard that has " + oldKeyboard.getSwitches() + " switches on " + oldKeyboard.getCurrentBrightness() + "%.");
        System.out.println("The new keyboard is a " + newKeyboard.getBrand() + " keyboard that has " + newKeyboard.getSwitches() + " switches on " + newKeyboard.getCurrentBrightness() + "%.");
        System.out.println("Setting the new keyboard to 50% brightness with Brown switches...");
        newKeyboard.changeSwitches("Brown");
        newKeyboard.setBrightness(50);
        System.out.println("The old keyboard is a " + oldKeyboard.getBrand() + " keyboard that has " + oldKeyboard.getSwitches() + " switches on " + oldKeyboard.getCurrentBrightness() + "%.");
        System.out.println("The new keyboard is a " + newKeyboard.getBrand() + " keyboard that has " + newKeyboard.getSwitches() + " switches on " + newKeyboard.getCurrentBrightness() + "%.");
    }
}
