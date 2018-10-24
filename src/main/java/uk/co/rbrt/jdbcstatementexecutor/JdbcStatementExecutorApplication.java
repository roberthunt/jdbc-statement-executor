package uk.co.rbrt.jdbcstatementexecutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class JdbcStatementExecutorApplication implements CommandLineRunner
{
    public static void main(String[] args)
    {
        SpringApplication.run(JdbcStatementExecutorApplication.class, args);
    }

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) throws Exception
    {
        jdbcTemplate.execute("SELECT 1 FROM DUAL");
    }
}
