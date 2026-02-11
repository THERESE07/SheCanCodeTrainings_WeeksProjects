public class Main {
  public static void main(String[] args) {

    // Testing Email
    NotificationService email = new EmailNotification();
    email.sendNotification("Welcome! Your email notification is working.");

    // Testing SMS
    NotificationService sms = new SMSNotification();
    sms.sendNotification("Hello! Your SMS notification is active.");

    // Testing Push Notification
    PushNotification push = new PushNotification("Device12345");
    push.setDefaultPriority("High"); // bonus
    NotificationService notificationService = push;

    notificationService.sendNotification("This is a push notification test.");

    System.out.println("\n--- All Notifications Tested Successfully ---");
  }
}

