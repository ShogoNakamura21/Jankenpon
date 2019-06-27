package jp.ac.ritsumei.ise.phy.exp2.is0421kx.jankenpon;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class GameActivity extends AppCompatActivity {

    String win = "あなたの勝ちです";
    String lose = "あなたの負けです";
    String draw = "あいこで・・・";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

    public void onExitButtonTapped(View view){
        finish();
    }


    int gu = 0;
    int choki = 0;
    int pa = 0;


    public void onClickButton1(View view) {
        ((ImageView) findViewById(R.id.imageView5)).setImageResource(R.drawable.rock);

        Random r = new Random();
        int n = r.nextInt(3) + 1;//1~3がランダムで表示される

        //1=グー、2=チョキ、3=パー
        if (n == 1) {//相手の手
            ((ImageView) findViewById(R.id.imageView4)).setImageResource(R.drawable.rock);
            ((TextView) findViewById(R.id.textView2)).setText(draw);
        } else if (n == 2) {
            ((ImageView) findViewById(R.id.imageView4)).setImageResource(R.drawable.scissors);
            ((TextView) findViewById(R.id.textView2)).setText(win);
        } else {
            ((ImageView) findViewById(R.id.imageView4)).setImageResource(R.drawable.paper);
            ((TextView) findViewById(R.id.textView2)).setText(lose);
        }

        gu += 1;
        //思考ルーチンの強化.最頻値を出す
        if (gu > choki && gu > pa) {//グーが一番出ているとき
            ((ImageView) findViewById(R.id.imageView4)).setImageResource(R.drawable.paper);//パー出す
            ((TextView) findViewById(R.id.textView2)).setText(lose);
        }

        if(choki > gu && choki > pa){
            ((ImageView) findViewById(R.id.imageView4)).setImageResource(R.drawable.rock);
            ((TextView) findViewById(R.id.textView2)).setText(draw);
        }

        if(pa > gu && pa > choki){
            ((ImageView) findViewById(R.id.imageView4)).setImageResource(R.drawable.paper);
            ((TextView) findViewById(R.id.textView2)).setText(win);
        }

    }




    public void onClickButton2(View view){
        ((ImageView)findViewById(R.id.imageView5)).setImageResource(R.drawable.scissors);

        Random r = new Random();
        int n = r.nextInt(3) + 1;//1~3がランダムで表示される
        //1=グー、2=チョキ、3=パー
        if (n == 1){
            ((ImageView)findViewById(R.id.imageView4)).setImageResource(R.drawable.rock);
            ((TextView)findViewById(R.id.textView2)).setText(lose);
        }else if(n ==2){
            ((ImageView)findViewById(R.id.imageView4)).setImageResource(R.drawable.scissors);
            ((TextView)findViewById(R.id.textView2)).setText(draw);
        }else{
            ((ImageView)findViewById(R.id.imageView4)).setImageResource(R.drawable.paper);
            ((TextView)findViewById(R.id.textView2)).setText(win);
        }

        choki+= 1;
        //思考ルーチンの強化.最頻値を出す
        if (gu > choki && gu > pa) {//グーが一番出ているとき
            ((ImageView) findViewById(R.id.imageView4)).setImageResource(R.drawable.scissors);//パー出す
            ((TextView) findViewById(R.id.textView2)).setText(draw);
        }

        if(choki > gu && choki > pa){
            ((ImageView) findViewById(R.id.imageView4)).setImageResource(R.drawable.rock);
            ((TextView) findViewById(R.id.textView2)).setText(lose);
        }

        if(pa > gu && pa > choki){
            ((ImageView) findViewById(R.id.imageView4)).setImageResource(R.drawable.paper);
            ((TextView) findViewById(R.id.textView2)).setText(win);
        }


    }

    public void onClickButton3(View view){
        ((ImageView)findViewById(R.id.imageView5)).setImageResource(R.drawable.paper);

        Random r = new Random();
        int n = r.nextInt(3) + 1;//1~3がランダムで表示される
        //1=グー、2=チョキ、3=パー
        if (n == 1){
            ((ImageView)findViewById(R.id.imageView4)).setImageResource(R.drawable.rock);
            ((TextView)findViewById(R.id.textView2)).setText(win);
        }else if(n ==2){
            ((ImageView)findViewById(R.id.imageView4)).setImageResource(R.drawable.scissors);
            ((TextView)findViewById(R.id.textView2)).setText(lose);
        }else{
            ((ImageView)findViewById(R.id.imageView4)).setImageResource(R.drawable.paper);
            ((TextView)findViewById(R.id.textView2)).setText(draw);
        }

        pa += 1;
        //思考ルーチンの強化.最頻値を出す
        if (gu > choki && gu > pa) {//グーが一番出ているとき
            ((ImageView) findViewById(R.id.imageView4)).setImageResource(R.drawable.paper);//パー出す
            ((TextView) findViewById(R.id.textView2)).setText(draw);
        }

        if(choki > gu && choki > pa){
            ((ImageView) findViewById(R.id.imageView4)).setImageResource(R.drawable.rock);
            ((TextView) findViewById(R.id.textView2)).setText(win);
        }

        if(pa > gu && pa > choki){
            ((ImageView) findViewById(R.id.imageView4)).setImageResource(R.drawable.scissors);
            ((TextView) findViewById(R.id.textView2)).setText(lose);
        }

    }
}
