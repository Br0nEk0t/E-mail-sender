package asoilab;

import java.io.*;
import java.util.*;


public class EmailSender {
    public static void main(String[] args) {
        try {
            File file = new File("emails.txt");
            if (!file.exists()) {
//                file.createNewFile(); // Создание файла, если он не существует
                System.out.println("Файл emails.txt создан.");
                System.out.println("Добавьте адреса электронной почты в файл emails.txt и запустите программу снова.");
                return;
            }

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String recipient = scanner.nextLine();
                String subject = "Work Example";
                String body = "Hello, this is a test email.";
                EmailService.sendEmail(recipient, subject, body);
            }
            scanner.close();
        } catch (IOException e) {
            System.err.println("Ошибка при создании файла: " + e.getMessage());
        }
    }
}
