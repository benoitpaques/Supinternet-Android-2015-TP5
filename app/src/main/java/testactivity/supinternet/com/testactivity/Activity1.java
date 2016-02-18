package testactivity.supinternet.com.testactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity1 extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        fillViews();
    }

    private void fillViews(){
        editText = (EditText) findViewById(R.id.activity_1_input);
    }

    public void goToNextActivity(View v){

        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra(Activity2.EXTRA_TEXT, editText.getText().toString());
        startActivity(intent);

    }
}
