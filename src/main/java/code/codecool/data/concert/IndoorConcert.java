package code.codecool.data.concert;

import code.codecool.data.ConcertType;
import code.codecool.data.band.MainBand;
import code.codecool.data.band.WarmUpBand;

public class IndoorConcert extends Concert {

    private static final int INDOORCAPACITY = 3000;
    private static final double INDOORDURATION = 1.5;
    private static final double INDOORBEERPRICE = 600;

    public IndoorConcert(MainBand mainBand, WarmUpBand warmUpBand,int ticketPrice) {
        super(mainBand, warmUpBand, INDOORCAPACITY, ticketPrice, ConcertType.INDOOR, INDOORBEERPRICE, INDOORDURATION);
    }
}
