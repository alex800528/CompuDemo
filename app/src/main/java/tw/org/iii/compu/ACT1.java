package tw.org.iii.compu;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ACT1 extends Activity {

    View.OnClickListener btnzero_click = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            s =  Result.getText().toString();
            if (ifans==true){
                Result.setText("0");
                ifans=false;
            }else {
                if ("0".equals(s)){
                    Result.setText("0");
                } else {
                    Result.setText(s+"0");
                }
            }
        }
    };

    View.OnClickListener btnone_click = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            s =  Result.getText().toString();
            if (ifans == true){
                Result.setText("1");
                ifans=false;
            } else {
                if ("0".equals(s)){
                    Result.setText("1");
                } else {
                    Result.setText(s+"1");
                }
            }
        }
    };

    View.OnClickListener btnztwo_click = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            s =  Result.getText().toString();
            if (ifans == true){
                Result.setText("2");
                ifans=false;
            } else {
                if ("0".equals(s)){
                    Result.setText("2");
                } else {
                    Result.setText(s+"2");
                }
            }
        }
    };

    View.OnClickListener btnthree_click = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            s =  Result.getText().toString();
            if (ifans == true){
                Result.setText("3");
                ifans=false;
            } else {
                if ("0".equals(s)){
                    Result.setText("3");
                } else {
                    Result.setText(s+"3");
                }
            }
        }
    };

    View.OnClickListener btnfour_click = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            s =  Result.getText().toString();
            if (ifans == true){
                Result.setText("4");
                ifans=false;
            } else {
                if ("0".equals(s)){
                    Result.setText("4");
                } else {
                    Result.setText(s+"4");
                }
            }
        }
    };

    View.OnClickListener btnfive_click = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            s =  Result.getText().toString();
            if (ifans == true){
                Result.setText("5");
                ifans=false;
            } else {
                if ("0".equals(s)){
                    Result.setText("5");
                } else {
                    Result.setText(s+"5");
                }
            }
        }
    };

    View.OnClickListener btnsix_click = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            s =  Result.getText().toString();
            if (ifans == true){
                Result.setText("6");
                ifans=false;
            } else {
                if ("0".equals(s)){
                    Result.setText("6");
                } else {
                    Result.setText(s+"6");
                }
            }
        }
    };

    View.OnClickListener btnseven_click = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            s =  Result.getText().toString();
            if (ifans == true){
                Result.setText("7");
                ifans=false;
            } else {
                if ("0".equals(s)){
                    Result.setText("7");
                } else {
                    Result.setText(s+"7");
                }
            }
        }
    };

    View.OnClickListener btneight_click = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            s =  Result.getText().toString();
            if (ifans == true){
                Result.setText("8");
                ifans=false;
            } else {
                if ("0".equals(s)){
                    Result.setText("8");
                } else {
                    Result.setText(s+"8");
                }
            }
        }
    };

    View.OnClickListener btnnine_click = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            s =  Result.getText().toString();
            if (ifans == true){
                Result.setText("9");
                ifans=false;
            } else {
                if ("0".equals(s)){
                    Result.setText("9");
                } else {
                    Result.setText(s+"9");
                }
            }
        }
    };

    View.OnClickListener btnaddition_click = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            s =  Result.getText().toString();
            n1 = Double.parseDouble(s);
            op = "+";
            Result.setText("0");
        }
    };

    View.OnClickListener btnsubtraction_click = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            s =  Result.getText().toString();
            n1 = Double.parseDouble(s);
            op = "-";
            Result.setText("0");
        }
    };

    View.OnClickListener btnmultiplication_click = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            s =  Result.getText().toString();
            n1 = Double.parseDouble(s);
            op = "*";
            Result.setText("0");
        }
    };

    View.OnClickListener btndivision_click = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            s =  Result.getText().toString();
            n1 = Double.parseDouble(s);
            op = "/";
            Result.setText("0");
        }
    };

    View.OnClickListener btnResult_click = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            s =  Result.getText().toString();
            double n2 = Double.parseDouble(s);

            if("+".equals(op))
                Result.setText(String.valueOf(n1+n2));
            if("-".equals(op))
                Result.setText(String.valueOf(n1-n2));
            if("*".equals(op))
                Result.setText(String.valueOf(n1*n2));
            if("/".equals(op))
                Result.setText(String.valueOf(n1/n2));

            ifans=true;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("LOG_DEMO","程序已啟動");
        super.onCreate(savedInstanceState);
        Log.d("LOG_DEMO","指定 xml 檔案");
        setContentView(R.layout.act1);
        Log.d("LOG_DEMO","初始化畫面開始");
        InitialComponent();
        Log.d("LOG_DEMO","就緒");
    }

    private void InitialComponent(){

        Result  = (TextView)findViewById(R.id.lblRespon);

        zero = (Button)findViewById(R.id.btnzero);
        zero.setOnClickListener(btnzero_click);
        one = (Button)findViewById(R.id.btnone);
        one.setOnClickListener(btnone_click);
        two = (Button)findViewById(R.id.btntwo);
        two.setOnClickListener(btnztwo_click);
        three = (Button)findViewById(R.id.btnthree);
        three.setOnClickListener(btnthree_click);
        four = (Button)findViewById(R.id.btnfour);
        four.setOnClickListener(btnfour_click);
        five = (Button)findViewById(R.id.btnfive);
        five.setOnClickListener(btnfive_click);
        six = (Button)findViewById(R.id.btnsix);
        six.setOnClickListener(btnsix_click);
        seven = (Button)findViewById(R.id.btnseven);
        seven.setOnClickListener(btnseven_click);
        eight = (Button)findViewById(R.id.btneight);
        eight.setOnClickListener(btneight_click);
        nine = (Button)findViewById(R.id.btnnine);
        nine.setOnClickListener(btnnine_click);
        addition = (Button)findViewById(R.id.btnaddition);
        addition.setOnClickListener(btnaddition_click);
        subtraction = (Button)findViewById(R.id.btnsubtraction);
        subtraction.setOnClickListener(btnsubtraction_click);
        multiplication = (Button)findViewById(R.id.btnmultiplication);
        multiplication.setOnClickListener(btnmultiplication_click);
        division = (Button)findViewById(R.id.btndivision);
        division.setOnClickListener(btndivision_click);

        btnResult = (Button)findViewById(R.id.btnResult);
        btnResult.setOnClickListener(btnResult_click);

        ifans=false;
    }

    String s;
    String op = "";
    double n1;

    TextView Result;

    Button zero;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button addition;
    Button subtraction;
    Button multiplication;
    Button division;
    Button btnResult;

    boolean ifans;
}
