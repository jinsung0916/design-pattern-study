package com.example.designpattern.facade;

public class Client {

    public static void main(String[] args) {
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");

        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("from");
        emailMessage.setTo("to");
        emailMessage.setSubject("subject");
        emailMessage.setText("text");

        EmailSender emailSender = new EmailSender(emailSettings);
        emailSender.sendEmail(emailMessage);
    }

}
