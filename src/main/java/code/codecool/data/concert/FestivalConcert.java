package code.codecool.data.concert;

import code.codecool.data.ConcertType;
import code.codecool.data.band.MainBand;
import code.codecool.data.band.WarmUpBand;

public class FestivalConcert extends Concert {

    private static final int FESTIVALCAPACITY = 8000;
    private static final double FESTIVALDURATION = 6;
    private static final double FESTIVALBEERPRICE = 1000;

    public FestivalConcert(MainBand mainBand, WarmUpBand warmUpBand, int ticketPrice) {
        super(mainBand, warmUpBand, FESTIVALCAPACITY, ticketPrice, ConcertType.FESTIVAL, FESTIVALBEERPRICE, FESTIVALDURATION);
    }
}
