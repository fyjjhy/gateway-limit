package com.spring.fyj.limit.resolver;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * <Description> <br>
 *
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年06月10日 <br>
 * @see com.spring.fyj.limit.resolver <br>
 * @since V1.0 <br>
 */
public class HostAddrKeyResolver implements KeyResolver {

    private int count;

    @Override
    public Mono<String> resolve(ServerWebExchange exchange) {
        System.out.println("Hostname" + ++count + "限流");
        return Mono.just(exchange.getRequest().getRemoteAddress().getAddress().getHostAddress());
    }
}
