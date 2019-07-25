package me.amin.tools;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        String viewTag = (String) view.getTag();

        switch (viewTag){
            case "asyncTask":
                startActivity(new Intent(this,));
                break;

            default: break;
        }

    }

}
