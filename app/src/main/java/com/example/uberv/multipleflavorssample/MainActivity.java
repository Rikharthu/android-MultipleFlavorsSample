package com.example.uberv.multipleflavorssample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StringBuilder infoBuilder = new StringBuilder();

        infoBuilder.append(getResources().getString(R.string.flavor_name)+"\n");
        // BuildConfig class is automatically generated for each flavor and build
        infoBuilder.append("Package name: "+getPackageName()+"\n");
        infoBuilder.append("Application ID: "+BuildConfig.APPLICATION_ID+"\n");
        infoBuilder.append("Build type: "+BuildConfig.APPLICATION_ID+"\n");
        infoBuilder.append("Version name: "+BuildConfig.VERSION_NAME+"\n");
//        infoBuilder.append("Foo: "+BuildConfig.FOO);

        ((TextView) findViewById(R.id.flavor_tv)).setText(infoBuilder.toString());

    }
}
