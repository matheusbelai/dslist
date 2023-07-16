package com.belai.dslist.controller;


import com.belai.dslist.dto.GameDTO;
import com.belai.dslist.dto.GameListDTO;
import com.belai.dslist.dto.GameMinDTO;
import com.belai.dslist.entities.GameList;
import com.belai.dslist.service.GameListService;
import com.belai.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll(){
        return gameListService.findAll();
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId){
        return gameService.findByList(listId);

    }




}
