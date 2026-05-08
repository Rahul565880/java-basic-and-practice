class SmartDevice {
    String deviceType;
    boolean isConnected;

    // Compiler automatically inserts a hidden default constructor here
}

public class DefaultConstructor {
    public static void main(String[] args) {
        SmartDevice device = new SmartDevice(); // Calls default constructor
        System.out.println(device.deviceType);   // Outputs: null
        System.out.println(device.isConnected);  // Outputs: false
    }
}



