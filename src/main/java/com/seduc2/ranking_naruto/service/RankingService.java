package com.seduc2.ranking_naruto.service;

import com.seduc2.ranking_naruto.entity.Ranking;
import com.seduc2.ranking_naruto.repository.RankingRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RankingService {

    private final RankingRepository repository;
    public RankingService(RankingRepository repository) {
        this.repository = repository;
    }

    public List<Ranking>listarRanking(){
        List<Ranking> rankingList = new ArrayList<>();
        return rankingList = repository.findAll();
    }

    public Ranking salvarRanking(Ranking ranking){
        return repository.save(ranking);
    }

    public void deletarRanking(Long id){
        repository.deleteById(id);
    }

    @Transactional
    public Ranking alterarRanking(Long id, Ranking dados) {
        Ranking ranking = repository.getReferenceById(id);

        ranking.setNome(dados.getNome());
        ranking.setElemento(dados.getElemento());
        ranking.setJinchuruki(dados.getJinchuruki());
        ranking.setKage(dados.getKage());
        ranking.setNukenin(dados.getNukenin());
        ranking.setVila(dados.getVila());

        return ranking;
    }
}
