package bruce.dev.flight_tracker_api.Controllers;

import bruce.dev.flight_tracker_api.Models.Forum;
import bruce.dev.flight_tracker_api.Repository.ForumRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/forums")
public class ForumController {

    @Autowired
    ForumRepo repo;

    @PostMapping("/newPost")
    public ResponseEntity<Forum> newPost(@RequestBody Forum forum) {
        Forum savedForum = repo.save(forum);
        return new ResponseEntity<>(savedForum, HttpStatus.CREATED);
    }

}
