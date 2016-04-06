package com.example.ziti;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Card extends FrameLayout {
	public TextView lable;
	private String Text="";
	

	public Card(Context context) {
		super(context);
		lable= new TextView(getContext());
		lable.setTextSize(32);
		lable.setGravity(Gravity.CENTER);
		Drawable tvDrawable = getResources().getDrawable(R.drawable.danbiankegai200); 
		lable.setBackground(tvDrawable);
		addView(lable);
		
		// TODO 自动生成的构造函数存根
	}

	public String getText() {
		return Text;
	}
	public void setText(String Text) {
		// TODO 自动生成的方法存根
		this.Text=Text;
		if(Text==null){
			lable.setText("");
		}else{
			lable.setText(Text);
		}
	}

}
