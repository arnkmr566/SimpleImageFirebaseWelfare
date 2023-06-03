package com.example.simpleimagefirebasewelfare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class SingleProductActivity extends AppCompatActivity {

    TextView singleHeadLine, singlePrice, singleBrand, singleProductType, singleAboutProduct;
    ImageView singleImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_product);

        singleHeadLine = findViewById(R.id.singleHeadLine);
        singlePrice = findViewById(R.id.singlePrice);
        singleBrand = findViewById(R.id.singleBrand);
        singleProductType = findViewById(R.id.singleProductType);
        singleAboutProduct = findViewById(R.id.singleAboutProduct);

        singleImage = findViewById(R.id.singleImage);

        Picasso.get().load(getIntent().getStringExtra("singleImage"))
                .placeholder(R.drawable.ic_stat_name)
                .into(singleImage);

        singleHeadLine.setText(getIntent().getStringExtra("singleHeadLine"));
        singlePrice.setText(getIntent().getStringExtra("singlePrice"));
        singleBrand.setText(getIntent().getStringExtra("singleBrand"));
        singleProductType.setText(getIntent().getStringExtra("singleProductType"));
        singleAboutProduct.setText(getIntent().getStringExtra("singleAboutProduct"));

    }
}