package ru.dkalchenko.behavioural.mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat simpleTextChat = new SimpleTextChat();
        Admin admin = new Admin(simpleTextChat, "Admin");
        User denis = new SimpleUser(simpleTextChat, "Denis");
        User nastya = new SimpleUser(simpleTextChat, "Nastya");

        simpleTextChat.setAdmin(admin);
        simpleTextChat.addUserToChat(denis);
        simpleTextChat.addUserToChat(nastya);

        denis.sendMessage("Hello");
        admin.sendMessage("I am admin");
    }
}
