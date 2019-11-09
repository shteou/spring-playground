package com.stewartplatt.user.config;

import java.nio.charset.StandardCharsets;

import com.github.jasync.r2dbc.mysql.JasyncConnectionFactory;
import com.github.jasync.sql.db.mysql.pool.MySQLConnectionFactory;
import com.github.jasync.sql.db.mysql.util.URLParser;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@Configuration
@EnableR2dbcRepositories
class MysqlApplicationConfiguration extends AbstractR2dbcConfiguration {
	EnvironmentConfig environmentConfig;

	public MysqlApplicationConfiguration(EnvironmentConfig config) {
		this.environmentConfig = config;
	}

	@Override
	public io.r2dbc.spi.ConnectionFactory connectionFactory() {
		String url = environmentConfig.getDatabaseUrl();
		return new JasyncConnectionFactory(
				new MySQLConnectionFactory(URLParser.INSTANCE.parseOrDie(url, StandardCharsets.UTF_8)));
	}
}
