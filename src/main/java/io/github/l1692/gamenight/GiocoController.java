package io.github.l1692.gamenight;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/giochi")
public class GiocoController {
    private final GiocoRepository giocoRepository;

    public GiocoController(GiocoRepository giocoRepository) {
        this.giocoRepository = giocoRepository;
    }

    public Gioco getGiocoById(int id) {
        return giocoRepository.getGiocoById(id);
    }

    @GetMapping
    public List<Gioco> getAllGiochi() {
        return giocoRepository.getAllGiochi();
    }
}
