package com.example.ch004_animal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1,2. 자바 view객체를 만들면서, 바인딩 시킨다
//        CheckBox chk1 = findViewById(R.id.ChkAgree);
        Switch sw1 = findViewById(R.id.swAgree);

        TextView tv1 = findViewById(R.id.Text2);
        RadioGroup rg1 = findViewById(R.id.Rgroup1);
//        Button btn1 = findViewById(R.id.BtnOK);
        ImageView iv1 = findViewById(R.id.ImgPet);

        Button btn2 = findViewById(R.id.BtnFinish);//종료버튼
        Button btn3 = findViewById(R.id.BtnInit);//초기화버튼

        RadioButton rdo1 = findViewById(R.id.RdoDog);
        RadioButton rdo2 = findViewById(R.id.RdoCat);
        RadioButton rdo3 = findViewById(R.id.RdoRabbit);

        //3.이벤트 처리
        sw1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b)
            {
//                if(chk1.isChecked() == true)
                if(sw1.isChecked())//체크된 결과이면
                {
                    tv1.setVisibility(View.VISIBLE);
                    rg1.setVisibility(View.VISIBLE);
//                    btn1.setVisibility(View.VISIBLE);
                    iv1.setVisibility(View.VISIBLE);
                    btn2.setVisibility(View.VISIBLE);
                    btn3.setVisibility(View.VISIBLE);

                }
                else//체크해지된 결과이면
                {
                    tv1.setVisibility(View.INVISIBLE);
                    rg1.setVisibility(View.INVISIBLE);
//                    btn1.setVisibility(View.INVISIBLE);
                    iv1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                }

            }
        });

        //버튼 이벤트처리
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int n1 = rg1.getCheckedRadioButtonId();
//
//                switch(n1)
//                {
//                    case R.id.RdoDog:
//                        iv1.setImageResource(R.drawable.dog);
//                        break;
//                    case R.id.RdoCat:
//                        iv1.setImageResource(R.drawable.cat);
//                        break;
//                    case R.id.RdoRabbit:
//                        iv1.setImageResource(R.drawable.rabbit);
//                        break;
//                    default :
//                        Toast.makeText(MainActivity.this, "선택안됨!", Toast.LENGTH_SHORT).show();
//
//                }
//            }
//        });

        rdo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv1.setImageResource(R.drawable.dog);
            }
        });
        rdo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv1.setImageResource(R.drawable.cat);
            }
        });
        rdo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv1.setImageResource(R.drawable.rabbit);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setVisibility(View.INVISIBLE);
                rg1.setVisibility(View.INVISIBLE);
//                    btn1.setVisibility(View.INVISIBLE);
                iv1.setVisibility(View.INVISIBLE);
                btn2.setVisibility(View.INVISIBLE);
                btn3.setVisibility(View.INVISIBLE);

                sw1.setChecked(false);
                rg1.clearCheck();
                iv1.setImageResource(0);
            }
        });




    }
}