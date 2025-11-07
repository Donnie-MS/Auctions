package ar.edu.unahur.obj2.observer;

public class Offer {
    private Auctioneer auctioneer;
    private Integer offeredValue;
    
    public Offer(Auctioneer auctioneer, Integer offeredValue) {
        this.auctioneer = auctioneer;
        this.offeredValue = offeredValue;
    }

    public Integer getOfferedValue() {
        return this.offeredValue;
    }

    public Auctioneer getAuctioneer() {
        return this.auctioneer;
    }
}
