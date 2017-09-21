package com.inducesmile.androiddatabinding;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayMap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.inducesmile.androiddatabinding.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ObservableArrayMap<String, Object> product = new ObservableArrayMap<>();
        ActivityMainBinding bindings = DataBindingUtil.setContentView(this, R.layout.activity_main);
        bindings.setProduct(product);
        product.put("name", "Sleek Navy Blue Sandals");
        product.put("description", "Beautiful sleek sandals for your casual and cocktail dinner. Comes in different color");



    }
}
