package net.runnerdave.service.impl;

import net.runnerdave.db.LatinoDB;
import net.runnerdave.domain.Concert;
import net.runnerdave.service.LatinoGigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by David A. Jiménez (e67997) on 26/06/2017.
 */
@Service
public class LatinoGigServiceListImpl implements LatinoGigService {

    public List<Concert> getGigList() {
        return LatinoDB.getGigs();
    }

}
