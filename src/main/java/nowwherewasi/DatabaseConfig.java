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
        dataSource.setUrl("jdbc:postgresql://dsunqmslsnabko:e8a02ca9b18303e0cae0c0afee66f4b70e61a27529b8e61d393949eb761e54ed@ec2-54-235-242-63.compute-1.amazonaws.com:5432/d7to71935jul24");
        dataSource.setUsername("dsunqmslsnabko");
        dataSource.setPassword("e8a02ca9b18303e0cae0c0afee66f4b70e61a27529b8e61d393949eb761e54ed");

        return dataSource;
    }
}