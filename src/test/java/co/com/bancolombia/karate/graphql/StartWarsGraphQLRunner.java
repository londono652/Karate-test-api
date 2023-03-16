package co.com.bancolombia.karate.graphql;

import com.intuit.karate.junit5.Karate;

public class StartWarsGraphQLRunner {

    @Karate.Test
    Karate runner() {
        return Karate.run("classpath:co/com/bancolombia/karate/features/graphql/startwarsgraphql.feature")
                .relativeTo(getClass());
    }
}
