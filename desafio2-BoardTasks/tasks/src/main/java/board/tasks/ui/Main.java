package board.tasks.ui;

import board.tasks.persistence.config.ConnectionConfig;
import board.tasks.persistence.migration.MigrationStrategy;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        try (var connection = ConnectionConfig.getConnection()) {
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }
}