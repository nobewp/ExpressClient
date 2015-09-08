package com.nobe.expressclient;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.nobe.expressclient.model.ImageInfo;
import com.nobe.expressclient.view.MyGallery;

public class Main1 extends Fragment
{

	private TextView titleView;
	private LinearLayout ovalLayout;
	private TextView tvCircle;
	private MyGallery galley;

	private ArrayList<ImageInfo> imageInfos = new ArrayList<ImageInfo>();

	private int[] imageId = new int[] { R.drawable.img_default_bg,
			R.drawable.img_default_bg, R.drawable.img_default_bg };

	@Override
	@Nullable
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		return inflater.inflate(R.layout.main_1, container, false);

	}

	@Override
	public void onActivityCreated(@Nullable Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);

		galley = (MyGallery) getActivity().findViewById(R.id.gallery);
		titleView = (TextView) getActivity().findViewById(R.id.title);
		ovalLayout = (LinearLayout) getActivity().findViewById(R.id.ovalLayout);

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
