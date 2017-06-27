package net.runnerdave.service;

import net.runnerdave.domain.Concert;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by runnerdave on 27/06/17.
 */
public interface LatinoGigService {
    List<Concert> getGigList();
}
