package ru.dkalchenko.behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat {
    private Admin admin;
    private List<User> users = new ArrayList<>();

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public void addUserToChat(User user) {
        this.users.add(user);
    }
    public void removeUserFromChat(User user) {}

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            if (!u.equals(user)) {
                u.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}
