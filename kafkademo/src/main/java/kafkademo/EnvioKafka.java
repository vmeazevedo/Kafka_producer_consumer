package kafkademo;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

public class EnvioKafka {

	public static void main(String[] args) {
		
		// Criando as propriedades do Producer
		Properties properties = new Properties();
		properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		
		// Se conectar no Kafka e enviar valores/registros
		KafkaProducer<String, String> producer = new KafkaProducer<>(properties);
		
		// Um dos registros que estou enviando para o Kafka. <Nome_tópico><Mensagem>
		ProducerRecord<String, String> record = new ProducerRecord<String, String>("testejava", "Ta funcionando!");
		
		// Comando para envio da mensagem
		producer.send(record);
		
		producer.flush();
		producer.close();
		
		
	}
}
