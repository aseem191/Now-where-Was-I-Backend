package nowwherewasi;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DatabaseConfig {
    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
    	DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://fwrgexbrklerom:17c0e7f12ad80a7c48687e031b9aef5091baf1b3980de20628a1ffa4dacff6b6@ec2-54-235-242-63.compute-1.amazonaws.com:5432/db2gj196m7ebo");
        dataSource.setUsername("fwrgexbrklerom");
        dataSource.setPassword("17c0e7f12ad80a7c48687e031b9aef5091baf1b3980de20628a1ffa4dacff6b6");

        return dataSource;
    }
}