package ar.edu.unahur.obj2.observer;

import java.util.ArrayList;
import java.util.List;

public class AuctionedProduct {
    private final List<Offer> receivedOffers = new ArrayList<Offer>();
    private final List<Auctioneer> participants = new ArrayList<Auctioneer>();
    private final String name;

    public AuctionedProduct(String name) {
        this.name = name;
    }

    public void addReceivedOffers(Offer newOffer) {
        if (!this.hayUnaDiferenciaDe10ConLaUltimaOferta(newOffer)) {
            throw new IllegalArgumentException("La nueva oferta debe superar en al menos 10 a la última.");
        }
        this.receivedOffers.add(newOffer);
        this.notifyAllParticipants();
    }

    private Boolean hayUnaDiferenciaDe10ConLaUltimaOferta(Offer otherOffer) {
        if (receivedOffers.isEmpty()) {
            return true;
        }
        Integer lastOffer = this.getLastOffer().getOfferedValue();
        return otherOffer.getOfferedValue() - lastOffer >= 10;
    }

    private Offer getLastOffer() {
        return this.receivedOffers.getLast();
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
