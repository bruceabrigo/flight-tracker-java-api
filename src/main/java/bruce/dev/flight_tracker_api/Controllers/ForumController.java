package bruce.dev.flight_tracker_api.Controllers;

import bruce.dev.flight_tracker_api.Models.Forum;
import bruce.dev.flight_tracker_api.Repository.ForumRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/forums")
public class ForumController {
    @Autowired
    ForumRepo repo;
    // CREATE POST
    @PostMapping("/newPost")
    public ResponseEntity<Forum> newPost(@RequestBody Forum forum) {
        Forum savedForum = repo.save(forum);
        return new ResponseEntity<>(savedForum, HttpStatus.CREATED);
    }
    // UPDATE POST
    @PutMapping("/updatePost/{id}")
    public ResponseEntity<Forum> updatePost(@PathVariable Long id, @RequestBody Forum updatedForum) {
        return repo.findById(id).map(forum -> {
            forum.setContent(updatedForum.getContent());
            Forum savedForum = repo.save(forum);
            return new ResponseEntity<>(savedForum, HttpStatus.OK);
        }).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    // DELETE POST
    @DeleteMapping("/deletePost/{id}")
    public ResponseEntity<Void> deletePost(@PathVariable Long id) {
        return repo.findById(id).map(forum -> {
            repo.delete(forum);
            return new ResponseEntity<>(HttpStatus.OK);
        }).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
}
