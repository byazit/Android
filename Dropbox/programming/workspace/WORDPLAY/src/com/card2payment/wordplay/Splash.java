package com.card2payment.wordplay;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity {
	MediaPlayer ourSong;
	@Override
	protected void onCreate(Bundle razibWantToEat) {
		// TODO Auto-generated method stub
		super.onCreate(razibWantToEat);
		setContentView(R.layout.splash);
		//ourSong = MediaPlayer.create(Splash.this, R.raw.background);
		//ourSong.start();
		Thread timer = new Thread(){
			public void run(){
				try{
					sleep(1000);
				} catch(InterruptedException e){
					e.printStackTrace();
				}finally{
					Intent openStratingPoint= new Intent("com.card2payment.wordplay.MENU");
					startActivity(openStratingPoint);
				}
			}
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		//ourSong.release();
		finish();
	}
	
}
