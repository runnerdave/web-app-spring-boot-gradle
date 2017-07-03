package net.runnerdave.domain;

import com.sun.javafx.beans.IDProperty;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by David A. Jiménez (e67997) on 26/06/2017.
 */
@Entity
public class Concert {

    @Id
    @GeneratedValue
    private Long id;
    private String artist;
    private String posterFile;
    @OneToMany
    private List<ConcertDate> dates;
    private String blurb;
    private String venue;

    public Concert(String artist, String posterFile, List<ConcertDate> dates, String blurb, String venue) {
        this.artist = artist;
        this.posterFile = posterFile;
        this.dates = dates;
        this.blurb = blurb;
        this.venue = venue;
    }

    private Concert() {
    }

    @Override
    public String toString() {
        return "Concert{" +
                "artist='" + artist + '\'' +
                ", posterFile='" + posterFile + '\'' +
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

    public List<ConcertDate> getDates() {
        return dates;
    }

    public void setDates(List<ConcertDate> dates) {
        this.dates = dates;
    }

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }
}
