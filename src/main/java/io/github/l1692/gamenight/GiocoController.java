package io.github.l1692.gamenight;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/giochi")
public class GiocoController {
    private final GiocoRepository giocoRepository;

    public GiocoController(GiocoRepository giocoRepository) {
        this.giocoRepository = giocoRepository;
    }

    @GetMapping
    public List<Gioco> findAll() {
        return giocoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Gioco> findById(@PathVariable int id) {
        return giocoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
