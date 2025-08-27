package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameMinDto;
import com.devsuperior.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDto> searchAllGames() {
        return gameRepository.findAll()
                .stream()
                .map(GameMinDto::new)
                .toList();
    }
}
