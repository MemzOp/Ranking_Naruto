package com.seduc2.ranking_naruto.controller;


import com.seduc2.ranking_naruto.entity.Ranking;
import com.seduc2.ranking_naruto.service.RankingService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/ranking")
public class RankingController {

    private final RankingService service;
    public RankingController(RankingService service) {
        this.service = service;
    }

    @GetMapping
    public List<Ranking> listarRanking(){
        return service.listarRanking();
    }
    @PostMapping
    public void salvarRanking(@RequestBody Ranking ranking){
        service.salvarRanking(ranking);
    }
    @DeleteMapping("/{id}")
    public void deletarRanking(@PathVariable Long id){
        service.deletarRanking(id);
    }

    @PutMapping("/{id}")
    public void alterarRanking(@PathVariable Long id, @RequestBody Ranking ranking){
        service.alterarRanking(id, ranking);
    }
}
