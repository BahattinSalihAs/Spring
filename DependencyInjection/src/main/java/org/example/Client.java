package org.example;

public class Client {
    public Service service;
    public Client(Service service) {
        this.service = service;
    }
    public Client(){
        this.service = new Service();
    }
    public void doClient() {
        System.out.println("Client çalışıyor");
    }
    public void callService(){
        this.service.doService();
    }
}
