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
1. Vá ao diretório do arquivo docker-compose do microservico-crud execute o comando > docker-compose up
2. Faça uma request para http://localhost:8083/auth/login com body
 >{
 >   "userName":"admin",
 >   "password":"admin"
 >} 

3. Guarde o token Bearer
