```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3)
```

# microservico-auth
microserviço de autenticação para utilização dos microserviços crud e pagamento

#Desafio
1. Gerar Token JWT
2. Permitindo apenas acesso sem autenticação no endpoint/antMatchers "/login" 

#Execução
1. Acesse o diretório ...\auth\src\main\resources> via cmd execute o comando docker-compose up para levantar o container do MySQL e RabbitMQ
2. Start o microservico-auth
3. [Gere o token JWT pelo swagger utilizando usuário e senha = admin em localhost](http://localhost:8083/auth/swagger-ui.html#/auth-controller) 
4. Guarde o token Bearer
