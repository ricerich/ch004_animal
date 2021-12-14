package com.example.ch004_animal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1,2. 자바 view객체를 만들면서, 바인딩 시킨다
        CheckBox chk1 = findViewById(R.id.ChkAgree);

        TextView tv1 = findViewById(R.id.Text2);
        RadioGroup rg1 = findViewById(R.id.Rgroup1);
        Button btn1 = findViewById(R.id.BtnOK);
        ImageView iv1 = findViewById(R.id.ImgPet);

        //3.이벤트 처리
        chk1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b)
            {
//                if(chk1.isChecked() == true)
                if(chk1.isChecked())//체크된 결과이면
                {
                    tv1.setVisibility(View.VISIBLE);
                    rg1.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.VISIBLE);
                    iv1.setVisibility(View.VISIBLE);

                }
                else//체크해지된 결과이면
                {
                    tv1.setVisibility(View.INVISIBLE);
                    rg1.setVisibility(View.INVISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    iv1.setVisibility(View.INVISIBLE);
                }

            }
        });

        //버튼 이벤트처리
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = rg1.getCheckedRadioButtonId();

                switch(n1)
                {
                    case R.id.RdoDog:
                        iv1.setImageResource(R.drawable.dog);
                        break;
                    case R.id.RdoCat:
                        iv1.setImageResource(R.drawable.cat);
                        break;
                    case R.id.RdoRabbit:
                        iv1.setImageResource(R.drawable.rabbit);
                        break;
                    default :
                        Toast.makeText(MainActivity.this, "선택안됨!", Toast.LENGTH_SHORT).show();

                }
            }
        });




    }
}