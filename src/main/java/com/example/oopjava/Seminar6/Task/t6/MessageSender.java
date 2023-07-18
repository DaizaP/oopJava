package com.example.oopjava.Seminar6.Task.t6;

interface MessageSenderInterface {
    void sendMessage(String message);
}
// абстракция
class EmailSender implements MessageSenderInterface {
    @Override
    public void sendMessage(String message) {
        //logic send message
        System.out.println("Sending email: " + message);
    }
}
//абстракция
class SMSSender implements MessageSenderInterface{
    @Override
    public void sendMessage(String message) {
        //logic send sms
        System.out.println("Sending SMS: " + message);
    }
}
//Класс, который зависит только от абстракций(интерфейса)
class NotificationService {
    private MessageSenderInterface messageSenderInterface;
    public NotificationService(MessageSenderInterface messageSender) {
        this.messageSenderInterface = messageSender;
    }
    public void sendNotification(String message){
        messageSenderInterface.sendMessage(message);
    }
}

public class MessageSender {
    public static void main(String[] args) {
        MessageSenderInterface emailSender = new EmailSender();
        NotificationService emailNotificationService = new NotificationService(emailSender);
        emailNotificationService.sendNotification("Hello via email");

        MessageSenderInterface smsSender = new SMSSender();
        NotificationService smsNotificationService = new NotificationService(smsSender);
        smsNotificationService.sendNotification("Hello via SMS");
    }
}