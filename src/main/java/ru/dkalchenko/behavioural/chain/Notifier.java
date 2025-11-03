package ru.dkalchenko.behavioural.chain;

import java.util.Objects;

public abstract class Notifier {
    private int priority;
    private Notifier nextNotifier;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    public void notifyManager(String message, int level) {
        if (level >= priority) {
            write(message);
        }
        if (Objects.nonNull(nextNotifier)) {
            nextNotifier.notifyManager(message, level);
        }
    }

    public abstract void write(String message);
}
