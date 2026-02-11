public interface NotificationService {

    void sendNotification(String message);

    default void setDefaultPriority(String priority) {
        // default implementation (does nothing)
    }
}

