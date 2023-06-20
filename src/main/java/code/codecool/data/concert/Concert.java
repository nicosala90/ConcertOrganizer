package code.codecool.data.concert;

import code.codecool.data.ConcertType;
import code.codecool.data.MusicStyle;
import code.codecool.data.band.MainBand;
import code.codecool.data.band.WarmUpBand;

public abstract class Concert {
    private static final int BEERSPERHOUR = 2;
    protected static final int TICKET_MIN_PRICE = 12000;
    protected static final int TICKET_MAX_PRICE = 15000;
    protected MainBand mainBand;
    protected WarmUpBand warmUpBand;
    protected int capacity;
    protected MusicStyle musicStyle;
    protected int ticketPrice;
    protected ConcertType concertType;
    protected double duration;
    protected double beerPrice;

    public Concert(MainBand mainBand, WarmUpBand warmUpBand, int capacity, int ticketPrice, ConcertType concertType, double beerPrice, double duration) {
        this.mainBand = mainBand;
        this.warmUpBand = warmUpBand;
        this.capacity = capacity;
        this.musicStyle = mainBand.getMusicStyle();
        this.ticketPrice = priceValidatePrice(ticketPrice);
        this.concertType = concertType;
        this.beerPrice = beerPrice;
        this.duration = duration;
    }
    public int priceValidatePrice(int ticketPrice) {
        int maxPrice = Math.max(ticketPrice, TICKET_MIN_PRICE);//ez beállitja hogy ne legyen 12e alatt (ha felette van akkor az megmarad, de a Math.min() majd beállitja)
        int minPrice = Math.min(TICKET_MAX_PRICE, maxPrice);//ez beállitja hogy maximum 15e legyen (akkor is ha a maxprice 15ezer felett volt
        return minPrice;
//how can the ticket price between 2 prices
    }
    public double totalIncome() {
        return concertIncome() + getBeerIncome();
    }//Single Responsibility
    public double concertIncome() {
        return capacity * ticketPrice;
    }
    public double getBeerIncome() {
        return beerPrice * capacity * duration * BEERSPERHOUR;
    }
    //how to implement chances(%) of something? in the main


}


