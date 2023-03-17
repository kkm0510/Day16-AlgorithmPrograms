package main;


public class CustomizeMessage {
    public static void main(String[] args) {
        String message="Hello <<name>>, We have your full " +
                "name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx. " +
                "Please, let us know in case of any clarification Thank you BridgeLabz 01/01/2016";
        message=message.replaceAll("<<name>>", "Kartikeya");
        message=message.replaceAll("<<full name>>", "Kartikeya Maan");
        message=message.replaceAll("\\d{2}-x{10}.", "91-7668693445");
        message=message.replaceAll("\\d{2}/\\d{2}/\\d{4}", "16/03/2023");
        System.out.println(message);
    }
}
