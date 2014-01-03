package com.onetomany.asif;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Audio extends Activity {
	MediaPlayer ourSong;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		ourSong = MediaPlayer.create(Audio.this, R.raw.time);
		ourSong.start();
		Intent openStartingPoint = new Intent("com.onetomany.asif.AUDIO");
		startActivity(openStartingPoint);
	}

}
