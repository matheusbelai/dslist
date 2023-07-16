package com.belai.dslist.service;


import com.belai.dslist.dto.GameDTO;
import com.belai.dslist.dto.GameListDTO;
import com.belai.dslist.dto.GameMinDTO;
import com.belai.dslist.entities.Game;
import com.belai.dslist.entities.GameList;
import com.belai.dslist.repository.GameListRespository;
import com.belai.dslist.repository.GameRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRespository gameListRespository;


    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRespository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }






}
