# microservico-auth
microserviço de autenticação para utilização dos microserviços crud e pagamento

#Execução
1. Vá ao diretório do arquivo docker-compose do microservico-crud execute o comando > docker-compose up
2. Faça uma request para http://localhost:8083/auth/login com body
 >{
 >   "userName":"admin",
 >   "password":"admin"
 >} 

3. Guarde o token Bearer
