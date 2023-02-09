package Day07.Ex03_MultipleInterface;

public interface Microphone {

	int inputVolumeMax = 50;
	int inputVolumeMin = 5;
	
	// 음성 인식
	String receiveVoice(String voice);
	
}
