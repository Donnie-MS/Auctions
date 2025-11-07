package ar.edu.unahur.obj2.observer;

public class Auctioneer {
    private String name;

    public Auctioneer(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void makeAnOffer(AuctionedProduct aProduct, Integer offeredValue) {
        aProduct.addReceivedOffers(new Offer(this, offeredValue));
    }

    public void notify(Offer anOffer, String productName) {
       System.out.println("Hay una nueva oferta de " + productName + ", " + anOffer.getOfferedValue()); 
    }
}
