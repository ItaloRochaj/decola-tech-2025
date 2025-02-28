package board.tasks.service;

import board.tasks.dto.CardDetailsDTO;
import board.tasks.persistence.dao.CardDAO;
import lombok.AllArgsConstructor;
import java.util.Optional;

import java.sql.Connection;
import java.sql.SQLException;

@AllArgsConstructor
public class CardQueryService {

    private final Connection connection;

    public Optional<CardDetailsDTO> findById(final Long id) throws SQLException {
        var dao = new CardDAO(connection);
        return dao.findById(id);
    }

}