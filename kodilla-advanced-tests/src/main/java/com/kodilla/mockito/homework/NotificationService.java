package com.kodilla.mockito.homework;

import java.util.*;
import java.util.stream.Collectors;

public class NotificationService {

    private Map<Location, List<Client>> data;

    public NotificationService(Map<Location, List<Client>> data) {
        this.data = data;
    }

    public void addSubscriber(Location location, Client client) {
        if (data.containsKey(location)) {
            data.get(location).add(client);
        } else {
            throw new RuntimeException("Given location does not exist");
        }
    }

    public void sendNotification(Location location, Notification notification) {
        this.data.entrySet().stream()
                .filter(entry -> entry.getKey().equals(location))
                .map(Map.Entry::getValue)
                .forEach(clients -> clients.forEach(client -> client.receive(notification)));
    }

    public void removeSubscriber(Location location, Client client) {
        this.data.get(location).remove(client);
    }

    public void sendNotificationToAllSubscriber(Notification notification) {
        this.data.values().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toSet())
                .forEach(client -> client.receive(notification));

    }

    public void removeTheLocation(Location location) {
        this.data.remove(location);
    }
}
