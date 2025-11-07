package ar.edu.unahur.obj2.observer;

public class Main {
    public static void main(String[] args) {
        AuctionedProduct caca = new AuctionedProduct("CACA");
        Auctioneer gonza = new Auctioneer("Gonza");
        Auctioneer diaznr = new Auctioneer("diaznr");
        Auctioneer Martomau = new Auctioneer("Martomau");
        caca.addParticipant(gonza);
        caca.addParticipant(diaznr);
        gonza.makeAnOffer(caca, 20);
        gonza.makeAnOffer(caca, 30);
    }
}