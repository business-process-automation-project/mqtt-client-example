		// SEND MESSAGE BEGIN

		String content = "test";
		
		MqttMessage message = new MqttMessage(content.getBytes());
		
		try {
			myClient.publish(TOPIC, message);
		} catch (MqttPersistenceException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (MqttException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// SEND MESSAGE END
