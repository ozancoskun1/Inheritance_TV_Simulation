package IntheritanceTv;

public class NewsChannel extends Channel{
	
	private String newsType;
	
	public NewsChannel(String channelName, int channelNumber) {
		super(channelName, channelNumber);
		
	}
	
	public NewsChannel(String channelName, int channelNumber, String newsType) {
		super(channelName, channelNumber);
		this.newsType = newsType;
	}


	public String getNewsType() {
		return newsType;
	}
}
