package net.runnerdave.repository;

import net.runnerdave.domain.Concert;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by David A. Jiménez (e67997) on 3/07/2017.
 */
@Repository
public interface ConcertRepository extends CrudRepository<Concert, Long> {

}
