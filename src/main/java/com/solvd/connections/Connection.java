package com.solvd.connections;

import java.sql.SQLException;

public class Connection {
    private int number;
    public Connection(int number) {
        this.number=number;
    }
    public boolean close() throws SQLException {
        return true;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }
}
