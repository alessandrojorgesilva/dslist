package com.devsuperior.dslist.controller;

import com.devsuperior.dslist.dto.GameListDto;
import com.devsuperior.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gamelists")
public class GameListController {

    @Autowired
    private GameService gameService;

    @GetMapping()
    public ResponseEntity<List<GameListDto>> buscarGameId(){
        var gameList = gameService.buscarGameList();
        return ResponseEntity.ok(gameList);
    }


}
