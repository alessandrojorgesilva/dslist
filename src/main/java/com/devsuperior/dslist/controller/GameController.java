package com.devsuperior.dslist.controller;

import com.devsuperior.dslist.dto.GameDto;
import com.devsuperior.dslist.dto.GameListDto;
import com.devsuperior.dslist.dto.GameMinDto;
import com.devsuperior.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping()
    public ResponseEntity <List<GameMinDto>> searchAllGames(){
        var games = gameService.searchAllGames();
        return ResponseEntity.ok(games);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GameDto> buscarGameId(@PathVariable Long id){
        var game = gameService.buscarGameId(id);
        return ResponseEntity.ok(game);
    }

    @GetMapping("/lists")
    public ResponseEntity<List<GameListDto>> buscarGameId(){
        var gameList = gameService.buscarGameList();
        return ResponseEntity.ok(gameList);
    }


}
