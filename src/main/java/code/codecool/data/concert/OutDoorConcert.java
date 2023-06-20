package code.codecool.data.concert;

import code.codecool.data.ConcertType;
import code.codecool.data.MusicStyle;
import code.codecool.data.band.MainBand;
import code.codecool.data.band.WarmUpBand;
import code.codecool.data.concert.Concert;

public class OutDoorConcert extends Concert {

//static filed for price, capacity
    private static final int OUTDOORCAPACITY = 5000;
    private static final double OUTDOORDURATION = 2;
    private static final double OUTDOORBEERPRICE = 800;



    public OutDoorConcert(MainBand mainBand, WarmUpBand warmUpBand, int ticketPrice) {
        super(mainBand, warmUpBand, OUTDOORCAPACITY, ticketPrice, ConcertType.OUTDOOR, OUTDOORBEERPRICE, OUTDOORDURATION);
    }
}

