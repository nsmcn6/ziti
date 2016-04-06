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
		
		// TODO �Զ����ɵĹ��캯�����
	}

	public String getText() {
		return Text;
	}
	public void setText(String Text) {
		// TODO �Զ����ɵķ������
		this.Text=Text;
		if(Text==null){
			lable.setText("");
		}else{
			lable.setText(Text);
		}
	}

}
