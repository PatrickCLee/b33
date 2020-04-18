package tw.org.iii.brad.brad33;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class NotifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notify);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        Log.v("brad",name);
        ((TextView)findViewById(R.id.tv)).setText(name);
    }
}
