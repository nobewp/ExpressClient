package com.nobe.expressclient;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.nobe.expressclient.model.ImageInfo;
import com.nobe.expressclient.view.MyGallery;

/**
 * 
 * @author 王鹏
 * @version
 * @2015-9-8上午8:43:21
 * 
 */
public class MainActivity extends Activity
{

	private TextView titleView;
	private LinearLayout ovalLayout;
	private TextView tvCircle;
	private MyGallery galley;

	private ArrayList<ImageInfo> imageInfos = new ArrayList<ImageInfo>();

	private int[] imageId = new int[] { R.drawable.img_default_bg,
			R.drawable.img_default_bg, R.drawable.img_default_bg };

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		galley = (MyGallery) findViewById(R.id.gallery);
		titleView = (TextView) findViewById(R.id.title);
		ovalLayout = (LinearLayout) findViewById(R.id.ovalLayout);

		for (int i = 0; i < 3; i++)
		{
			ImageInfo imageInfo = new ImageInfo();
			imageInfo.setImgUrl("http://images.csdn.net/20150817/1.jpg");
			imageInfos.add(imageInfo);
		}
		// tvCircle = (TextView) view.findViewById(R.id.tv_circle_num);
		galley.start(imageInfos, imageId, 3000, ovalLayout, titleView,
				R.drawable.point_focus, R.drawable.point_default);

	}

}
