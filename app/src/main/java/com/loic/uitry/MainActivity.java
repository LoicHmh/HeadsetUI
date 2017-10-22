package com.loic.uitry;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.nightonke.boommenu.BoomButtons.OnBMClickListener;
import com.nightonke.boommenu.BoomButtons.TextOutsideCircleButton;
import com.nightonke.boommenu.BoomMenuButton;


public class MainActivity extends AppCompatActivity {

    private BoomMenuButton boomMenuButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boomMenuButton = (BoomMenuButton) findViewById(R.id.bmb);
        for (int i = 0; i < boomMenuButton.getPiecePlaceEnum().pieceNumber(); i++) {
            TextOutsideCircleButton.Builder builder = new TextOutsideCircleButton.Builder()
                    .listener(new OnBMClickListener() {
                        @Override
                        public void onBoomButtonClick(int index) {
                            Toast.makeText(MainActivity.this, "Clicked " + index, Toast.LENGTH_SHORT).show();
                        }
                    })
                    .normalImageRes(getImageResource())
                    .normalText(getext());
            boomMenuButton.addBuilder(builder);
        }

    }
    private static int index = 0;
    static String getext() {
        if (index >= text.length) index = 0  ;
        return text[index++];

    }
    private static String [] text = new String[]{"111111","2222222"

    };
    private static int imageResourceIndex = 0;

    static int getImageResource() {
        if (imageResourceIndex >= imageResources.length) imageResourceIndex = 0;
        return imageResources[imageResourceIndex++];
    }

    private static int[] imageResources = new int[]{
            R.drawable.bat,
            R.drawable.bear,
//            R.drawable.bee,
//            R.drawable.butterfly,
//            R.drawable.cat,
//            R.drawable.deer,
//            R.drawable.dolphin,
//            R.drawable.eagle,
//            R.drawable.horse,
//            R.drawable.jellyfish,
//            R.drawable.owl,
//            R.drawable.peacock,
//            R.drawable.pig,
//            R.drawable.rat,
//            R.drawable.snake,
//            R.drawable.squirrel
    };
}
