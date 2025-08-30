package com.devsuperior.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "belongings")
public class Belonging {
    @EmbeddedId
    private BelongingPk belongingPkid = new BelongingPk();
    private Integer position;

    public Belonging() {}

    public Belonging(Game game, GameList list, Integer position) {
        belongingPkid.setGame(game);
        belongingPkid.setGameList(list);
        this.position = position;
    }

    public BelongingPk getBelongingPkid() {
        return belongingPkid;
    }

    public void setBelongingPkid(BelongingPk belongingPkid) {
        this.belongingPkid = belongingPkid;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(belongingPkid, belonging.belongingPkid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(belongingPkid);
    }
}
