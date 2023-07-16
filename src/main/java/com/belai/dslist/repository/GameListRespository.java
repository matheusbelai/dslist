package com.belai.dslist.repository;

import com.belai.dslist.entities.Game;
import com.belai.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRespository extends JpaRepository<GameList, Long> {



}
