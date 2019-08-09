package com.ireadygo.community;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.configuration.ClassicConfiguration;
import org.flywaydb.core.api.configuration.Configuration;

public class App {
    public static void main(String[] args) {
        Configuration configuration = new ClassicConfiguration();
        ((ClassicConfiguration) configuration).setBaselineOnMigrate(true);
        ((ClassicConfiguration) configuration).setDataSource("jdbc:mysql://localhost:3306/community?serverTimezone=UTC&characterEncoding=utf-8&useSSL=true","root","root");

        Flyway flyway = new Flyway(configuration);
        flyway.migrate();

    }
}
