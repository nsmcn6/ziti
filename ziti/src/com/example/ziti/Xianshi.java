package com.example.ziti;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.GridLayout;


public class Xianshi extends GridLayout {
	
	public Xianshi(Context context) {
		super(context);
		initXianShi();
		// TODO 自动生成的构造函数存根
	}
	private int li=5;
	private Card[][] cardsMap=new Card[li][li];
	static String txt;
	private int srlength=0;
	private int hang;
	
/*	public Xianshi(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}
*/
	
/*入口函數*/
	protected void initXianShi() {
		setColumnCount(4);
		setBackgroundColor(0xffbbada0);//0xff不透明
		
		// TODO 自动生成的方法存根
	}
	
	void Go() {
		//让格子每过五格换行
		hang=srlength/li;
		if(srlength%li!=0){
			hang=hang+1;
		}
		// 对所有元素进行清理
		for (int x = 0; x < li; x++) {
			for (int y = 0; y < li; y++) {
				cardsMap[x][y].setText(null);
			}
		}
//		清理完后执行按要求添加文字
		addText();
	}
	private void addText() {
		final EditText etzt=(EditText) findViewById(R.id.TVshuru);
		String txt=etzt.getText().toString();
		srlength=txt.length();
		char[] tc=txt.toCharArray();
		for (int x = 0; x < hang; x++) {
			for (int y = 0; y < li; y++) {
				cardsMap[x][y].setText(tc[x+y]+"");//这步出了问题：解决：一定要加字符让他变成字符串
			}
		}
	}


	//动态计算宽高
	protected void onSizeChanged(int w, int h, int oldw, int oldh) {
		// TODO 自动生成的方法存根
		super.onSizeChanged(w, h, oldw, oldh);
		int cardWidth=(Math.min(w, h))/li;//得到每一张小卡片的宽高 -10:间隙
		addCards(cardWidth, cardWidth);
	}
	//根据字数添加卡片
	private void addCards(int cardWidth,int cardHeight){
		Card c;
		for (int y = 0; y < hang; y++) {
			for (int x = 0; x < li; x++) {
					c= new Card(getContext());
					addView(c,cardWidth,cardWidth);
			}
		}
	}
}
