package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameListDto;
import com.devsuperior.dslist.dto.GameMinDto;
import com.devsuperior.dslist.repository.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    public List<GameListDto> listarTodasGameList() {
        return gameListRepository.findAll()
                .stream()
                .map(GameListDto::new)
                .toList();
    }

}
