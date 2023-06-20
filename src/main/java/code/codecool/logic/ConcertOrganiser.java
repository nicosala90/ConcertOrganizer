package code.codecool.logic;

import code.codecool.data.concert.Concert;

import java.util.ArrayList;
import java.util.List;

public class ConcertOrganiser {
    private List<Concert> concertList;

    public ConcertOrganiser(List<Concert> concertList) {
        this.concertList = new ArrayList<>();
    }

    public double calculateTotalIncome(){
      return  concertList.stream().mapToDouble(concert -> concert.totalIncome()).sum();
    }
}
