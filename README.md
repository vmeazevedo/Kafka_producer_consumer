## Kafka_producer_consumer
Código para envio e consumo de String por Kafka através de Procuder/Consumer.


## Requirements
- java 11.0.9 2020-10-20 LTS
- kafka-2.7.0-src.tgz

## Preparando o ambiente
- Após as instalações vá até a pasta onde o kafka está instalado e crie uma pasta "data" nele. Dentro dessa pasta crie duas pastas:
- kafka
- zookeeper

- Retorne a pasta do kafka e abra a pasta "config", nessa pasta abra os arquivos:
- zookeeper.properties
- server.properties

- Em "zookeeper.properties" altere o campo com o endereço da pasta zookeeper criada anteriormente.
dataDir=C:/kafka/data/zookeeper

- Em "server.properties" altere o campo com o endereço da pasta kafka criada anteriormente.
log.dirs=C:/kafka/data/kafka

## Inicializando o Zookeeper e Kafka
- No seu terminal de preferência abra duas abas uma para o zookeeper e outra para o kafka.
- Inicialize primeiramente o zookeeper com o comando (utilizar o path onde o zookeeper.properties está salvo):
zookeeper-server-start.bat C:\kafka\config\zookeeper.properties

- Em outro terminal, inicialize agora o kafka (utilizar o path onde o server.properties está salvo):
kafka-server-start.bat C:\kafka\config\server.properties

- Para testar a conexão envio o comando abaixo em um outro terminal:
kafka-topics
(irá retornar uma lista de comandos)

## Criar um tópico 
- Em outro terminal entre o comando abaixo para criamos um tópico:
kafka-topics --bootstrap-server localhost:9092 --create --topic testejava

## Executando os script 
- Ao executar o EnvioKafka, nós iremos enviar uma String "Ta funcionando" para nosso tópico "testejava" criado anteriormente.
- Quando executarmos o consumoKafka, nós iremos receber em nosso console a String enviada.

![image](https://user-images.githubusercontent.com/40063504/108909990-0160cd00-7604-11eb-873c-91acbd2f7cbf.png)

