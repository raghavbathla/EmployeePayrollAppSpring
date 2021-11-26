package com.bridgelabz.employeepayrollappspring.util;
//
//
import org.springframework.stereotype.Component;

import java.security.AlgorithmConstraints;

//
@Component
public class TokenUtil {
    Algorithm algorithm
}

//
//	public final String TOKEN_SECRET = "Raghav";
//
//    public String createToken(int id) {
//        try {
//
//            Algorithm alogirthm = Algorithm.HMAC256(TOKEN_SECRET);
//
//            String token = JWT.create()
//                    .withClaim("user_id", id)
//                    .sign(alogirthm);
//            return token;
//        } catch (JWTCreationException exception) {
//            exception.printStackTrace();
//        } catch (IllegalArgumentException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    public Long decodeToken(String token) {
//        Long userid;
//        Verification verification = null;
//
//        try {
//            verification = JWT.require(Algorithm.HMAC256(TOKEN_SECRET));
//        } catch (IllegalArgumentException e) {
//            e.printStackTrace();
//        }
//        JWTVerifier jwtVerifier = verification.build();
//
//        DecodedJWT decodedJWT = jwtVerifier.verify(token);
//        Claim claim = decodedJWT.getClaim("user_id");
//        userid = claim.asLong();
//        return userid;
//    }
//}
