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
		// TODO �Զ����ɵĹ��캯�����
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
	
/*��ں���*/
	protected void initXianShi() {
		setColumnCount(4);
		setBackgroundColor(0xffbbada0);//0xff��͸��
		
		// TODO �Զ����ɵķ������
	}
	
	void Go() {
		//�ø���ÿ�������
		hang=srlength/li;
		if(srlength%li!=0){
			hang=hang+1;
		}
		// ������Ԫ�ؽ�������
		for (int x = 0; x < li; x++) {
			for (int y = 0; y < li; y++) {
				cardsMap[x][y].setText(null);
			}
		}
//		�������ִ�а�Ҫ���������
		addText();
	}
	private void addText() {
		final EditText etzt=(EditText) findViewById(R.id.TVshuru);
		String txt=etzt.getText().toString();
		srlength=txt.length();
		char[] tc=txt.toCharArray();
		for (int x = 0; x < hang; x++) {
			for (int y = 0; y < li; y++) {
				cardsMap[x][y].setText(tc[x+y]+"");//�ⲽ�������⣺�����һ��Ҫ���ַ���������ַ���
			}
		}
	}


	//��̬������
	protected void onSizeChanged(int w, int h, int oldw, int oldh) {
		// TODO �Զ����ɵķ������
		super.onSizeChanged(w, h, oldw, oldh);
		int cardWidth=(Math.min(w, h))/li;//�õ�ÿһ��С��Ƭ�Ŀ�� -10:��϶
		addCards(cardWidth, cardWidth);
	}
	//����������ӿ�Ƭ
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
