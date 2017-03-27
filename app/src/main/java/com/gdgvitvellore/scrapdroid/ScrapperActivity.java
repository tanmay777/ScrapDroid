package com.gdgvitvellore.scrapdroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import com.gdgvitvellore.scrapdroidlibrary.ScrapDroid;

import java.util.HashMap;

public class ScrapperActivity extends AppCompatActivity {

    HashMap<String,String> params=new HashMap<>();
    EditText url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrapper);
        url=(EditText)findViewById(R.id.url);

        params.put("name","[{'element':'a[class=author waves-effect waves-dark grey lighten-4]','attr':'text'}]");
       // params.put("content","{'element':'time','attr':'text'}");

        Log.v("jsonApi",new ScrapDroid().formJSON(new ScrapDroid().getAPI(params)));
    }
}

