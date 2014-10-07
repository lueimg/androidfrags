package com.example.ejemplo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class NameDetailFragment extends Fragment {
	
	
	private TextView txt_name;
	
	public void setName(String name){
		if(name != null){
			txt_name.setText(name);
		}
	}

	@Override
	public void onActivityCreated(@Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		
		//traemos los datos que recibimos dentro de la actividad
		Bundle arguments = getArguments();
		String name = (String)arguments.get(MainActivity.NAME_TAG);
		
		setName(name);
		
		
	}

	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		View view = inflater.inflate(R.layout.fragment_name_detail, null);
		//se gusca el edittext del view del que se inflo
		//si no se usa view. , findviewbyid devuelve nulo
		txt_name = (TextView)view.findViewById(R.id.txt_name);
		return view;
	}

	
	
}
  