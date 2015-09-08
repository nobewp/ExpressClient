package com.nobe.expressclient;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * 
 * @author 王鹏
 * @version
 * @2015-9-8上午8:43:21
 * 
 */
public class MainActivity extends FragmentActivity implements OnClickListener
{
	private Fragment main1;
	private Fragment main2;

	private Fragment[] fragments;

	private int index;
	private int currentTabIndex;
	Button[] btn_tab;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		initview();
		getSupportFragmentManager().beginTransaction()
				.add(R.id.fragment_container, main1)
				.add(R.id.fragment_container, main2).hide(main2).show(main1)
				.commit();
	}

	public void initview()
	{
		main1 = new Main1();
		main2 = new Main2();
		fragments = new Fragment[] { main1, main2 };
		btn_tab = new Button[2];
		btn_tab[0] = (Button) findViewById(R.id.btn_tab1);
		btn_tab[1] = (Button) findViewById(R.id.btn_tab3);

		btn_tab[0].setOnClickListener(this);
		btn_tab[1].setOnClickListener(this);
		btn_tab[0].setSelected(true);
	}

	@Override
	public void onClick(View v)
	{
		switch (v.getId())
		{
		case R.id.btn_tab1:
			index = 0;
			break;
		case R.id.btn_tab3:
			index = 1;
			break;

		default:
			break;
		}

		if (currentTabIndex != index)
		{
			FragmentTransaction trx = getSupportFragmentManager()
					.beginTransaction();
			trx.hide(fragments[currentTabIndex]);
			if (!fragments[index].isAdded())
			{
				trx.add(R.id.fragment_container, fragments[index]);
			}
			trx.show(fragments[index]).commitAllowingStateLoss();
			btn_tab[currentTabIndex].setSelected(false);
			btn_tab[index].setSelected(true);
			currentTabIndex = index;
		}

	}
}
