package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameDto;
import com.devsuperior.dslist.dto.GameListDto;
import com.devsuperior.dslist.dto.GameMinDto;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repository.GameListRepository;
import com.devsuperior.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    public List<GameMinDto> listarTodosGames() {
        return gameRepository.findAll()
                .stream()
                .map(GameMinDto::new)
                .toList();
    }

    public GameDto buscarGameId(Long id) {
       var game = gameRepository.findById(id)
               .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
       return new GameDto(game);
    }

    public List<GameMinDto> listarGamePorLista(Long listaId) {
        return gameRepository.buscarGamesPorLista(listaId)
                .stream()
                .map(GameMinDto::new)
                .toList();
    }

}