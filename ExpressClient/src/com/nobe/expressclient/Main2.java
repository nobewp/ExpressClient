package com.nobe.expressclient;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Main2 extends Fragment
{ 

	@Override
	@Nullable
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		 return inflater.inflate(R.layout.main_2, container, false);
	}
	@Override
	public void onActivityCreated(@Nullable Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
	}
}
