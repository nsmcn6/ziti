package com.example.ziti;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.btn_ture).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				new Xianshi(null).Go();
				
			}
		});
		}
}

