package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;

public record GameListDto(Long id, String nome) {
    public GameListDto(GameList gameList){
        this(gameList.getId(), gameList.getNome());
    }
}
