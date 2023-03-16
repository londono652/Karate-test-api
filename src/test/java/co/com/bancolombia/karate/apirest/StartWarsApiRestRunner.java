package co.com.bancolombia.karate.apirest;

import com.intuit.karate.junit5.Karate;

public class StartWarsApiRestRunner {

    @Karate.Test
    Karate runner() {
        return Karate.run("classpath:co/com/bancolombia/karate/features/apirest/startwarsapirest.feature")
                .relativeTo(getClass());
    }
}
