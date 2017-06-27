package net.runnerdave.db;

import net.runnerdave.domain.Concert;

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

    static {
        Concert willie = new Concert();
        willie.setArtist("Willie Colon");
        willie.setBlurb("The last Willie Colon concert in Melbourne for 2014, with special guest: <strong>Oscar D'León</strong>. Once in " +
                "a lifetime oportunity");
        willie.setDates(Arrays.asList(LocalDate.of(2014, Month.SEPTEMBER, 15), LocalDate.of(2014, Month.SEPTEMBER, 16),
                LocalDate.of(2014, Month.SEPTEMBER, 17), LocalDate.of(2014, Month.SEPTEMBER, 18)));
        willie.setPosterFile("willie-colon.jpg");
        willie.setVenue("The Forum");

        Concert hector = new Concert();
        hector.setArtist("Hector Lavoe");
        hector.setBlurb("For the first time in Melbourne, with special guest: <strong>Celia Cruz</strong>. Once in " +
                "a lifetime oportunity");
        hector.setDates(Arrays.asList(LocalDate.of(2014, Month.OCTOBER, 19), LocalDate.of(2014, Month.OCTOBER, 20),
                LocalDate.of(2014, Month.OCTOBER, 21)));
        hector.setPosterFile("hector-lavoe.jpeg");
        hector.setVenue("Sydney Myer Bowl");

        Concert ruben = new Concert();
        ruben.setArtist("Ruben Blades");
        ruben.setBlurb("Ruben Blades again in Melbourne this time with a whole new style, with special guest: <strong>La India</strong>. Only one show.");
        ruben.setDates(Collections.singletonList(LocalDate.of(2014, Month.DECEMBER, 15)));
        ruben.setPosterFile("ruben-blades.jpg");
        ruben.setVenue("The Forum");

        gigs.add(willie);
        gigs.add(hector);
        gigs.add(ruben);
    }

    public static List<Concert> getGigs() {
        return Collections.unmodifiableList(gigs);
    }


}
