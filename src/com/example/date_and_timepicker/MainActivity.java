package com.example.date_and_timepicker;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class MainActivity extends Activity implements OnClickListener{
	
	Button b;
	TextView t;
	DatePicker d;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		b = (Button)findViewById(R.id.button1);
		t = (TextView)findViewById(R.id.textView2);
		d = (DatePicker)findViewById(R.id.datePicker1);
		
		t.setText(getCurrentDate());
		b.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		b.setText("current date : "+ getCurrentDate());
		
	}
	
	public String getCurrentDate()
	{
		StringBuilder s = new StringBuilder();
		s.append(d.getMonth());
		s.append(d.getDayOfMonth());
		s.append(d.getYear());
		return s.toString();
	}

}
