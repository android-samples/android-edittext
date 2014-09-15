package jp.clockup.myedittext;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void buttonMethod(View button)
	{
		EditText text1 = (EditText)findViewById(R.id.editText1);
		EditText text2 = (EditText)findViewById(R.id.editText2);
		EditText text3 = (EditText)findViewById(R.id.editText3);
		text3.setText(text1.getText().toString() + text2.getText().toString());
	}
}
