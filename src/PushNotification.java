public class PushNotification implements NotificationService {

    private String deviceId;     // Bonus attribute
    private String priority;     // For bonus default method override

    // Constructor
    public PushNotification(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Push Notification to Device [" + deviceId + "]: " + message
                + " (Priority: " + priority + ")");
    }

    // Bonus: overriding default method
    @Override
    public void setDefaultPriority(String priority) {
        this.priority = priority;
    }
}

