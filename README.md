# Cities API
Api made on Java Developer Bootcamp by Digital Innovation One
Todos as cidades, estados de cada um dos países do mundo estão na nossa DB e os cálculos de distância podem ser feitos em milhas, quilômetros ou metros!
Além disso tambem podem ser feitos por outros métodos matemáticos como distância entre dois pontos ou de forma quadrática.

#Como utilizar?
Busca-se as cidades desejada pela lista e paginamento da nossa API por uma requisição GET na url:
```https://dc143c-cities-api.herokuapp.com/api/v1/cities```
Obtendo as cidades pode-se entao calcular a distancia passando por parametros em uma requisição GET para a seguinte URL:
```https://dc143c-cities-api.herokuapp.com/api/v1/distance/TYPE?from=CITYID1&to=CITYID2&unit=UNIT```
Onde os parâmetros passados sao:
TYPE podendo ser de três tipos:
-/by-math
-/by-cube
-/by-point
CITYID1 = Primeira cidade desejada - Numeral
CITYID2 = Segunda cidade desejada - Numeral
UNITY podendo ser de três tipos:
- METERS
- KILOMETERS
- MILES

#Tecnologias aplicadas neste projeto
-Java JDK11
-Spring Boot Maven
-PJA
-PostgreSQL
-Docker
-Heroku
