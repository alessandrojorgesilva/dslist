package com.devsuperior.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;

//@Embedded e @Embeddable
@Embeddable
public class BelongingPk {
    @ManyToOne
    private Game game;
    @ManyToOne
    private GameList gameList;

    public BelongingPk() {
    }

    public BelongingPk(Game game, GameList gameList) {
        this.game = game;
        this.gameList = gameList;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameList getGameList() {
        return gameList;
    }

    public void setGameList(GameList gameList) {
        this.gameList = gameList;
    }
}
