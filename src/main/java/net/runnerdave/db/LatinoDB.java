package net.runnerdave.db;

import net.runnerdave.domain.Concert;
import net.runnerdave.domain.ConcertDate;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by David A. Jiménez (e67997) on 26/06/2017.
 */
public class LatinoDB {
    private static List<Concert> gigs = new ArrayList<>();
    private static List<ConcertDate> gigDates = new ArrayList<>();

    static {
        ConcertDate concertDateWillie1 = new ConcertDate(LocalDate.of(2014, Month.SEPTEMBER, 15));
        ConcertDate concertdateWillie2 = new ConcertDate(LocalDate.of(2014, Month.SEPTEMBER, 16));
        ConcertDate concertDateWillie3 = new ConcertDate(LocalDate.of(2014, Month.SEPTEMBER, 17));
        ConcertDate concertDateWillie4 = new ConcertDate(LocalDate.of(2014, Month.SEPTEMBER, 18));
        gigDates.add(concertDateWillie1);
        gigDates.add(concertdateWillie2);
        gigDates.add(concertDateWillie3);
        gigDates.add(concertDateWillie4);
        Concert willie = new Concert("Willie Colon",
                "willie-colon.jpg",
                Arrays.asList(concertDateWillie1,
                        concertdateWillie2,
                        concertDateWillie3,
                        concertDateWillie4),
                "The last Willie Colon concert in Melbourne for 2014, with special guest: <strong>Oscar D'León</strong>. Once in " +
                        "a lifetime oportunity",
                "The Forum");

        ConcertDate concertDateHector1 = new ConcertDate(LocalDate.of(2014, Month.OCTOBER, 19));
        ConcertDate concertDateHector2 = new ConcertDate(LocalDate.of(2014, Month.OCTOBER, 20));
        ConcertDate concertDateHector3 = new ConcertDate(LocalDate.of(2014, Month.OCTOBER, 21));
        gigDates.add(concertDateHector1);
        gigDates.add(concertDateHector2);
        gigDates.add(concertDateHector3);

        Concert hector = new Concert("Hector Lavoe",
                "hector-lavoe.jpeg",
                Arrays.asList(concertDateHector1,
                        concertDateHector2,
                        concertDateHector3),
                "For the first time in Melbourne, with special guest: <strong>Celia Cruz</strong>. Once in " +
                        "a lifetime oportunity",
                "Sydney Myer Bowl");

        ConcertDate concertDateRuben = new ConcertDate(LocalDate.of(2014, Month.DECEMBER, 15));
        Concert ruben = new Concert("Ruben Blades",
                "ruben-blades.jpg",
                Collections.singletonList(concertDateRuben),
                "Ruben Blades again in Melbourne this time with a whole new style, with special guest: <strong>La India</strong>. Only one show.",
                "The Forum");
        gigDates.add(concertDateRuben);

        gigs.add(willie);
        gigs.add(hector);
        gigs.add(ruben);
    }

    public static List<Concert> getGigs() {
        return Collections.unmodifiableList(gigs);
    }

    public static List<ConcertDate> getGigDates() { return Collections.unmodifiableList(gigDates); }
}
