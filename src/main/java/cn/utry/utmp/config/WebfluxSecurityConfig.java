package cn.utry.utmp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.server.SecurityWebFilterChain;

@EnableWebFluxSecurity
public class WebfluxSecurityConfig {

    @Bean
    public MapReactiveUserDetailsService userDetailsService(){

        UserDetails user = User.withDefaultPasswordEncoder()
        .username("username")
        .password("username")
        .roles("User")
        .build();

        return new MapReactiveUserDetailsService(user);
    }

    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http){
        http.authorizeExchange(exchange-> exchange.anyExchange().authenticated())
        .httpBasic().disable()
        .formLogin();
        
        return http.build();
    }
}
