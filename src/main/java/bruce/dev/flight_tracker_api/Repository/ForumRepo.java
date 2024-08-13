package bruce.dev.flight_tracker_api.Repository;

import bruce.dev.flight_tracker_api.Models.Forum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ForumRepo extends JpaRepository<Forum, Long> {

}
