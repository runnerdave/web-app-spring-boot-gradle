package net.runnerdave.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

/**
 * Created by David A. Jiménez (e67997) on 3/07/2017.
 */
@Entity
public class ConcertDate {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Concert concert;

    private ConcertDate(){}

    @Override
    public String toString() {
        return "ConcertDate{" +
                "concert=" + concert +
                ", concertDate=" + concertDate +
                '}';
    }

    public ConcertDate(LocalDate concertDate) {
        this.concertDate = concertDate;
    }

    public Concert getConcert() {

        return concert;
    }

    public void setConcert(Concert concert) {
        this.concert = concert;
    }

    public LocalDate getConcertDate() {
        return concertDate;
    }

    public void setConcertDate(LocalDate concertDate) {
        this.concertDate = concertDate;
    }

    private LocalDate concertDate;
}
