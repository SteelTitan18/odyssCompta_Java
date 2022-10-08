package com.example.odysscompta;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mSellBut;
    private Button mBuyBut;
    private Button mStatBut;
    private Button mCaissBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBuyBut = findViewById(R.id.depen_but);
        mCaissBut = findViewById(R.id.caiss_but);
        mStatBut = findViewById(R.id.stat_but);
        mSellBut = findViewById(R.id.vente_but);

        //mSellBut.setEnabled(false);
        //mStatBut.setEnabled(false);
        //mBuyBut.setEnabled(false);
        //mCaissBut.setEnabled(false);

        ActivityResultLauncher<Intent> SellActivityLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        Intent data = result.getData();
                        if (result.getResultCode() == RESULT_OK) {
                            //int score = data.getIntExtra(SellActivity.BUNDLE_EXTRA_SCORE, 0);
                        }
                    }

                });

        mSellBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent SellActivityIntent = new Intent(MainActivity.this, SellActivity
                        .class);
                SellActivityLauncher.launch(SellActivityIntent);
                //mUser.setFirstName(mNameEditText.getText().toString());
                //getSharedPreferences(SHARED_PREF_USER_INFO, MODE_PRIVATE)
                  //      .edit()
                    //    .putString(SHARED_PREF_USER_INFO_NAME, mUser.getFirstName())
                      //  .apply();

            }
        });

        ActivityResultLauncher<Intent> BuyActivityLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        Intent data = result.getData();
                        if (result.getResultCode() == RESULT_OK) {
                            //int score = data.getIntExtra(SellActivity.BUNDLE_EXTRA_SCORE, 0);
                        }
                    }

                });

        mBuyBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuyActivityIntent = new Intent(MainActivity.this, BuyActivity
                        .class);
                BuyActivityLauncher.launch(BuyActivityIntent);
                //mUser.setFirstName(mNameEditText.getText().toString());
                //getSharedPreferences(SHARED_PREF_USER_INFO, MODE_PRIVATE)
                //      .edit()
                //    .putString(SHARED_PREF_USER_INFO_NAME, mUser.getFirstName())
                //  .apply();

            }
        });
    }


}