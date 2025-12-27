package IntheritanceTv;

import java.util.ArrayList;

public class Channel {
	private String channelName;
	private int channelNumber;

	public Channel(String channelName, int channelNumber) {

		this.channelName = channelName;
		this.channelNumber = channelNumber;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public int getChannelNumber() {
		return channelNumber;
	}

	public void setChannelNumber(int channelNumber) {
		this.channelNumber = channelNumber;
	}

	public String channelInfo() {
		return  channelNumber + " Channel Name " + channelName;
	}

}
