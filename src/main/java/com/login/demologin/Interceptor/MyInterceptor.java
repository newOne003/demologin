package com.login.demologin.Interceptor;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Component
public class MyInterceptor implements HandlerInterceptor {

    @Value("${jwt.config.secret}")
    private String secret;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //获取Auth
        String auth = request.getHeader("Authorization");
        JWTVerifier verifier = JWT.require(Algorithm.HMAC256(secret)).build();
        DecodedJWT verify = verifier.verify(auth);
        Map<String, Claim> claims = verify.getClaims();
        String name = claims.get("name").toString();
        String password = claims.get("password").toString();
        System.out.println("name:"+name);
        System.out.println("password:"+password);
        return true;
    }
}
