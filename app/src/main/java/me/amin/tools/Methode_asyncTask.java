package me.amin.tools;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Methode_asyncTask extends AppCompatActivity {
    public static String TAG = "Methode_asyncTask";

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_async_task);

        tv=findViewById(R.id.tv_asycTask);
        tv.setMovementMethod(new ScrollingMovementMethod());
        findViewById(R.id.btn_asyncTask).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new TaskIntro().execute("bank","house","work");
            }
        });


    }


    public class TaskIntro extends AsyncTask< String, String , String> {

        @Override
        protected void onPreExecute() {
            Log.d(TAG, "Start \n");
        }

        @Override
        protected String doInBackground(String... params) {
            for (String p : params){
                Log.d(TAG, "\ndoInBackground: "+p);
            }
            return "\n done";
        }

        @Override
        protected void onPostExecute(String result) {
            tv.append(result);
            Log.d(TAG, result);

        }
    }
}
