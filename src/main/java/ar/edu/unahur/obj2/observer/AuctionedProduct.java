package ar.edu.unahur.obj2.observer;

import java.util.ArrayList;
import java.util.List;

public class AuctionedProduct {
    private List<Offer> receivedOffers = new ArrayList<Offer>();
    private List<Auctioneer> participants = new ArrayList<Auctioneer>();
    private String name;

    public AuctionedProduct(String name) {
        this.name = name;
    }

    public void addReceivedOffers(Offer newOffer) {
        this.receivedOffers.add(newOffer);
        this.notifyAllParticipants();
    }

    private Offer getLastOffer() {
        return this.receivedOffers.getFirst();
    }

    public void notifyAllParticipants() {
        participants.forEach(participant -> participant.notify(this.getLastOffer(), this.name));
    }
    public void addParticipant(Auctioneer newParticipant) {
        this.participants.add(newParticipant);
    }

    public void reset() {
        this.participants.removeAll(participants);
        this.receivedOffers.removeAll(participants);
    }
}
