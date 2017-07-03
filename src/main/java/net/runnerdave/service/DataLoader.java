package net.runnerdave.service;

import net.runnerdave.db.LatinoDB;
import net.runnerdave.domain.Concert;
import net.runnerdave.repository.ConcertDateRepository;
import net.runnerdave.repository.ConcertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by David A. Jiménez (e67997) on 3/07/2017.
 */
@Service
public class DataLoader {

    private ConcertRepository concertRepository;
    private ConcertDateRepository concertDateRepository;

    @Autowired
    public DataLoader(ConcertRepository concertRepository, ConcertDateRepository concertDateRepository) {
        this.concertRepository = concertRepository;
        this.concertDateRepository = concertDateRepository;
    }

    @PostConstruct
    private void loadData() {
        concertDateRepository.save(LatinoDB.getGigDates());
        concertRepository.save(LatinoDB.getGigs());
    }
}
