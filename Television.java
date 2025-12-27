package IntheritanceTv;

import java.util.ArrayList;

public class Television {
	private String brand;
	private int size;
	private boolean open;
	private int voiceLevel;
	private int activeChannel;
	private ArrayList<Channel> channels;

	public Television(String brand, int size) {

		this.brand = brand;
		this.size = size;
		voiceLevel = 10;
		activeChannel = 1;
		channels = new ArrayList<>();
		createChannels();
		this.open = false;
	}

	public void voiceIncrease() {
		if (voiceLevel <= 20 && open == true) {
			voiceLevel++;
			System.out.println("Voice " + voiceLevel);
		} else {
			System.out.println("Voice is max level.");
		}
	}

	public void voiceReduce() {
		if (voiceLevel > 0 && open == true) {
			voiceLevel--;
			System.out.println("Voice " + voiceLevel);
		} else {
			System.out.println("Voice is a min level.");
		}
	}

	public void openTv() {
		if (open == false) {
			open = true;
			System.out.println("Tv is open");
		} else {
			System.out.println("the television is already on");
		}

	}

	public void closeTv() {
		if (open == true) {
			open = false;
			System.out.println("Tv is closing..");
		} else {
			System.out.println("the television is already off");
		}
	}

	private void createChannels() {
		NewsChannel cnn = new NewsChannel("CNN", 56, "General");
		channels.add(cnn);
		NewsChannel bbc = new NewsChannel("BBC", 57, "General");
		channels.add(bbc);
		MusicChannel numberOne = new MusicChannel("Number One", 145, "Turkish Pop");
		channels.add(numberOne);
		MusicChannel mtv = new MusicChannel("MTV", 147, "Pop");
		channels.add(mtv);

	}

	public void showActiceChannel() {
		System.out.println("Active channel :" + channels.get(activeChannel).channelInfo());
	}

	public void changeChannel(int i) {
		if (open) {
			if (i != activeChannel) {
				if (i <= channels.size()) {
					activeChannel = i;
					System.out.println("Channel is being changed. Active channel " + activeChannel + "." + "\nInfo:"
							+ channels.get(i - 1).channelInfo());
				} else {
					System.out.println("Please enter a valid channel number.");
				}
			} else {
				System.out.println("You're already on channel " + activeChannel + ".");
			}

		} else {
			System.out.println("First open TV.");
		}
	}

	public String getMarka() {
		return brand;
	}

	public void setMarka(String marka) {
		this.brand = marka;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "A " + brand + " " + size + "inch television has been created.";
	}

}
