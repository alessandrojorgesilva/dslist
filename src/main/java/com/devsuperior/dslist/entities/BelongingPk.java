package com.devsuperior.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;

//@Embedded e @Embeddable
@Embeddable
public class BelongingPk {
    @ManyToOne
    private Game game;
    @ManyToOne
    private GameList list;

    public BelongingPk() {
    }

    public BelongingPk(Game game, GameList list) {
        this.game = game;
        this.list = list;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameList getGameList() {
        return list;
    }

    public void setGameList(GameList gameList) {
        this.list = gameList;
    }
}
