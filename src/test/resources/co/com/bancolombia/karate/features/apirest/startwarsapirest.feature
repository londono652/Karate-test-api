Feature: StartWars Api Rest

  Background: Set urlBase
    * url urlBase
    * def planetSchema = read('../schemas/PlanetSchema.json')

  @API
  Scenario: GET People Name
    Given path '/api/people'
    When method GET
    Then status 200
    * match each $.results[*].name == '#string'

  Scenario: GET Planet Response
    Given path '/api/planets/1/'
    When method GET
    Then status 200
    * match response == planetSchema

  Scenario: GET Ship 9 capacity
    Given path '/api/starships/9/'
    When method GET
    Then status 200
    * match response.cargo_capacity == '1000000000000'