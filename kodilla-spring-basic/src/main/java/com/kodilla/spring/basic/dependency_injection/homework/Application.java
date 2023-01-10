package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        DHLDeliveryService DHLDeliveryService = new DHLDeliveryService();
        DHLNotificationService DHLNotificationService = new DHLNotificationService();
        ShippingCenter shippingCenter = new ShippingCenter(DHLDeliveryService, DHLNotificationService);
        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);
    }
}