package Controllers;
import Service.TelevisionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;


@RestController
@RequestMapping(value = "/inventory")
public class TelevisionController {

//  een GET-request voor alle televisies
    @GetMapping(value = "/televisions")
    public ResponseEntity<Object> getAllTelevisions() {
        return ResponseEntity.ok();
    }

//  een GET-request voor 1 televisie
    @GetMapping(value = "/televisions/{id}")
    public ResponseEntity<Object> getTelevision(@PathVariable ("id") long id) {
        return ResponseEntity.ok();
    }

//  een POST-request voor 1 televisie
    @PostMapping(value = "/televisions")
    public ResponseEntity<Object> addTelevision(@RequestBody String television) {
       return ResponseEntity.created();
    }

//  een PUT-request voor 1 televisie
    @PutMapping(value = "/televisions/{id}")
    public ResponseEntity<Object> updateTelevision(@PathVariable ("id") long id, @RequestBody String television) {
        return ResponseEntity.noContent();
    }

//    een DELETE-request voor 1 televisie
    @DeleteMapping(value = "/televisions/{id}")
    public ResponseEntity<Object> deleteTelevision(@PathVariable ("id") long id) {
        TelevisionService.deleteById(id);
        return ResponseEntity.noContent();
    }
}

