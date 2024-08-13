package bruce.dev.flight_tracker_api.Controllers;

import bruce.dev.flight_tracker_api.Models.Forum;
import bruce.dev.flight_tracker_api.Repository.ForumRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForumController {

    @Autowired
    ForumRepo repo;

    @PostMapping("/newPost")
    public void newPost(@RequestBody Forum forum) {
        repo.save(forum);
    }

}
