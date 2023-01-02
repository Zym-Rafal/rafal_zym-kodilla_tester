package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class NotificationServiceTest {

    @Test
    public void subscribedClientShouldReceiveNotificationAboutAGivenLocation() {
        Client client = Mockito.mock(Client.class);
        Location location = Mockito.mock(Location.class);
        Notification notification = Mockito.mock(Notification.class);
        NotificationService notificationService = new NotificationService(Map.of(location, new ArrayList<>()));
        notificationService.addSubscriber(location, client);

        notificationService.sendNotification(location, notification);
        Mockito.verify(client).receive(notification);
    }

    @Test
    public void clientCanUnsubscribedFromAGivenLocationAndThenClientShouldNotNotification() {
        Client client = Mockito.mock(Client.class);
        Location location1 = Mockito.mock(Location.class);
        Location location2 = Mockito.mock(Location.class);
        Location location3 = Mockito.mock(Location.class);
        Notification notification = Mockito.mock(Notification.class);
        NotificationService notificationService = new NotificationService(Map.of(location1, new ArrayList<>(), location2, new ArrayList<>(), location3, new ArrayList<>()));
        notificationService.addSubscriber(location1, client);
        notificationService.addSubscriber(location2, client);
        notificationService.addSubscriber(location3, client);
        notificationService.removeSubscriber(location3, client);

        notificationService.sendNotification(location3, notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void clientCanUnsubscribedAllLocations() {
        Client client = Mockito.mock(Client.class);
        Location location1 = Mockito.mock(Location.class);
        Location location2 = Mockito.mock(Location.class);
        Location location3 = Mockito.mock(Location.class);

        NotificationService notificationService = new NotificationService(Map.of(location1, new ArrayList<>(), location2, new ArrayList<>(), location3, new ArrayList<>()));

        notificationService.addSubscriber(location1, client);
        notificationService.addSubscriber(location2, client);
        notificationService.addSubscriber(location3, client);
        Notification notification = Mockito.mock(Notification.class);
        notificationService.removeSubscriber(location1, client);
        notificationService.removeSubscriber(location2, client);
        notificationService.removeSubscriber(location3, client);

        notificationService.sendNotification(location1, notification);
        notificationService.sendNotification(location2, notification);
        notificationService.sendNotification(location3, notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void notificationShouldBeSentToAllSubscribedClientsAboutAGivenLocation() {
        Client client1 = Mockito.mock(Client.class);
        Client client2 = Mockito.mock(Client.class);
        Client client3 = Mockito.mock(Client.class);
        Location location1 = Mockito.mock(Location.class);
        NotificationService notificationService = new NotificationService(Map.of(location1, new ArrayList<>()));
        notificationService.addSubscriber(location1, client1);
        notificationService.addSubscriber(location1, client2);
        notificationService.addSubscriber(location1, client3);
        Notification notification = Mockito.mock(Notification.class);

        notificationService.sendNotification(location1, notification);
        Mockito.verify(client1, Mockito.times(1)).receive(notification);
        Mockito.verify(client2, Mockito.times(1)).receive(notification);
        Mockito.verify(client3, Mockito.times(1)).receive(notification);
    }

    @Test
    public void allClientShouldReceiveNotification() {
        Client client1 = Mockito.mock(Client.class);
        Client client2 = Mockito.mock(Client.class);
        Client client3 = Mockito.mock(Client.class);
        Client client4 = Mockito.mock(Client.class);
        Client client5 = Mockito.mock(Client.class);
        Location location1 = Mockito.mock(Location.class);
        Location location2 = Mockito.mock(Location.class);
        Location location3 = Mockito.mock(Location.class);
        Location location4 = Mockito.mock(Location.class);
        NotificationService notificationService = new NotificationService(Map.of(location1, new ArrayList<>(), location2, new ArrayList<>(), location3, new ArrayList<>(), location4, new ArrayList<>()));
        notificationService.addSubscriber(location1, client1);
        notificationService.addSubscriber(location2, client2);
        notificationService.addSubscriber(location1, client2);
        notificationService.addSubscriber(location3, client2);
        notificationService.addSubscriber(location4, client3);
        notificationService.addSubscriber(location1, client3);
        notificationService.addSubscriber(location4, client4);
        notificationService.addSubscriber(location3, client5);
        Notification notification = Mockito.mock(Notification.class);

        notificationService.sendNotificationToAllSubscriber(notification);
        Mockito.verify(client1, Mockito.times(1)).receive(notification);
        Mockito.verify(client2, Mockito.times(1)).receive(notification);
        Mockito.verify(client3, Mockito.times(1)).receive(notification);
        Mockito.verify(client4, Mockito.times(1)).receive(notification);
        Mockito.verify(client5, Mockito.times(1)).receive(notification);

    }

    @Test
    public void removeTheLocation() {
        List<Client> clients = Mockito.mock(List.class);
        Location location = Mockito.mock(Location.class);
        Map<Location, List<Client>> map = Mockito.mock(Map.class);
        map.put(location, clients);
        NotificationService notificationService = new NotificationService(map);

        notificationService.removeTheLocation(location);
        Mockito.verify(map, Mockito.times(1)).remove(location);
    }

}