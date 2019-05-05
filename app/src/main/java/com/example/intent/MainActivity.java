package com.example.intent;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private EditText editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent1);
        aa();
        //bb();
    }

    public void aa(){
        btn1 = (Button) findViewById(R.id.test2);
        //监听button事件
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("TEST", "button onClick");
                editText1 =(EditText)findViewById(R.id.test1);
                String str1=editText1.getText().toString();
                Uri uri = Uri.parse(str1);
                Intent intent1=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent1);
            }
        });
    }

    public void bb(){
        btn1 = (Button) findViewById(R.id.test2);
        //监听button事件
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("TEST", "button onClick");
                editText1 =(EditText)findViewById(R.id.test1);
                String str1=editText1.getText().toString();
                Intent intent=new Intent();
                Bundle bundle = new Bundle();
                bundle.putString("url", str1);
                intent.putExtras(bundle);
                intent.setAction("example.webview");
                startActivity(intent);
            }
        });
    }
}
