First attempt at consuming an external API using Spring, having peviously followed tutorials for creating an API using an example student database.

Using: 
OpenWeatherMap API
Spring initializer ()

Accepts a city name within the URL:
http://localhost:8080/{cityName}

Returns the 'main' weather report section as a JSON.

Need error handling, currently default is used, which to a user may not make sense if context surrounding the error wasn't provided.

First time using postman, used to check the responses provided.