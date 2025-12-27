package IntheritanceTv;

public class MusicChannel extends Channel{

	private String musicType;

	public MusicChannel(String channelName, int channelNumber, String musicType) {
		super(channelName, channelNumber);
		this.musicType = musicType;
	}

	public String getMusicType() {
		return musicType;
	}

	public void setMusicType(String musicType) {
		this.musicType = musicType;
	}
		
	
	}


