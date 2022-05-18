package eu.tasgroup.keycloakconfigtask;

import org.springframework.cloud.gateway.config.HttpClientCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import brave.http.HttpTracing;
import reactor.netty.http.brave.ReactorNettyHttpTracing;

@Configuration
public class SleuthGWConfiguration {

	@Bean
	public HttpClientCustomizer customizer(HttpTracing httpTracing) {
		return (c) -> {
			return ReactorNettyHttpTracing.create(httpTracing).decorateHttpClient(c);


		};
	}
}
