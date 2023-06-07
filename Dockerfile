# Imagem base
FROM openjdk:17-alpine

# Atualize o repositório do Alpine
RUN apk update 

# Crie um novo usuário com o nome: usrapp
RUN adduser -D usrapp -s /bin/bash -D usrapp

# Use esse usuário para executar os próximos comandos
USER usrapp

# Defina um diretório padrão como /app
WORKDIR /app

# Copie o arquivo: demo-0.0.1-SNAPSHOT.jar para o diretório padrão criado anteriormente
COPY target/beRecycle-0.0.1-SNAPSHOT.jar ./app.jar

# Exponha a porta 8080
EXPOSE 8080

# Execute o comando: java -jar app.jar (Utilize CMD)
CMD ["java", "-jar", "app.jar"]
