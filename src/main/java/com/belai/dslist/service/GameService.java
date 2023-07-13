package com.belai.dslist.service;


import com.belai.dslist.dto.GameMinDTO;
import com.belai.dslist.entities.Game;
import com.belai.dslist.repository.GameRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRespository gameRespository;

    //retornar a lista de games
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRespository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
