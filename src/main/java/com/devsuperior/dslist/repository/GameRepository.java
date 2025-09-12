package com.devsuperior.dslist.repository;

import com.devsuperior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

    @Query("SELECT g FROM Game g " +
            "INNER JOIN Belonging b " +
            "ON g = b.belongingPkid.game " +
            "WHERE b.belongingPkid.list.id = :listaId " +
            "ORDER BY b.position")
    public List<Game> buscarGamesPorListaJpql(Long listaId);

    @Query(nativeQuery = true, value = """
            SELECT * FROM games g
            INNER JOIN Belongings b
            ON g.id = b.game_id
            WHERE b.list_id = :listaId
            ORDER BY b.position
            """)
    public List<Game> buscarGamesPorListaSqlNative(Long listaId);

}
