package testactivity.supinternet.com.testactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Activity2 extends AppCompatActivity {

    public static final String EXTRA_TEXT = "EXTRA_TEXT";

    private String extra;

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();

        if (intent != null){
            if (intent.getStringExtra(EXTRA_TEXT) != null){
                extra = intent.getStringExtra(EXTRA_TEXT);
            }
        }
        fillViews();
    }

    private void fillViews(){
        textView = (TextView) findViewById(R.id.activity_2_text_received);
        textView.setText(extra);
    }

    public void goToNextActivity(View v){
        Intent intent = new Intent(this, Activity3.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(intent);
    }
}
