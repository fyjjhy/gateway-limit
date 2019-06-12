package com.spring.fyj.limit;

import com.spring.fyj.limit.resolver.HostAddrKeyResolver;
import com.spring.fyj.limit.resolver.UriKeyResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@SpringBootApplication
@RestController
public class LimitApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitApplication.class, args);
	}

	@Bean
	public HostAddrKeyResolver hostAddrKeyResolver() {
		return new HostAddrKeyResolver();
	}

//	@Bean
//	public UriKeyResolver getUriKeyResolver() {
//		return new UriKeyResolver();
//	}
//
//	@Bean
//	public KeyResolver getUserKeyResolver() {
//		return exchange -> Mono.just(exchange.getRequest().getQueryParams().getFirst("user"));
//	}

}
