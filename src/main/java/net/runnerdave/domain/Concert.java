package net.runnerdave.domain;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by David A. Jiménez (e67997) on 26/06/2017.
 */
public class Concert {
    private String artist;
    private String posterFile;
    private List<LocalDate> dates;
    private String blurb;
    private String venue;

    @Override
    public String toString() {
        return "Concert{" +
                "artist='" + artist + '\'' +
                ", posterFile='" + posterFile + '\'' +
                ", dates=" + dates +
                ", blurb='" + blurb + '\'' +
                ", venue='" + venue + '\'' +
                '}';
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getPosterFile() {
        return posterFile;
    }

    public void setPosterFile(String posterFile) {
        this.posterFile = posterFile;
    }

    public List<LocalDate> getDates() {
        return dates;
    }

    public void setDates(List<LocalDate> dates) {
        this.dates = dates;
    }

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }
}
