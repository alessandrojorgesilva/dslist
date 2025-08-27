package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import jakarta.persistence.Column;
import org.springframework.beans.BeanUtils;

public record GameDto(Long id, String title, Double score, Integer year, String genre, String platforms,
                      String shortDescription, String longDescription, String img_url){
    public GameDto(Game game){
        this(game.getId(), game.getTitle(), game.getScore(), game.getYear(), game.getGenre(), game.getPlatforms(),
                game.getShortDescription(), game.getLongDescription(), game.getImg_url());
    }

}
