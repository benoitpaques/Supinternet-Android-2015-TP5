package testactivity.supinternet.com.testactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
    }

    public void goToNextActivity(View v){
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }
}
