package com.example.calculator;


import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
    Button[] btn = new Button[10];
    Button b_add, b_minus, b_ride, b_divide, b_point, b_clear, b_equal;
    EditText editText;


    Double[] index = new Double[100];
    int m = 0;//数字的顺序
    Boolean B=false;
    double sum = 0;
    String c=null;//用来保存符号

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.inputText);
        btn[0] = (Button) findViewById(R.id.key0);

        btn[1] = (Button) findViewById(R.id.key1);
        btn[2] = (Button) findViewById(R.id.key2);
        btn[3] = (Button) findViewById(R.id.key3);
        btn[4] = (Button) findViewById(R.id.key4);
        btn[5] = (Button) findViewById(R.id.key5);
        btn[6] = (Button) findViewById(R.id.key6);
        btn[7] = (Button) findViewById(R.id.key7);
        btn[8] = (Button) findViewById(R.id.key8);
        btn[9] = (Button) findViewById(R.id.key9);
        b_add = (Button) findViewById(R.id.add);
        b_minus = (Button) findViewById(R.id.minus);
        b_divide = (Button) findViewById(R.id.divide);
        b_ride = (Button) findViewById(R.id.ride);
        b_point = (Button) findViewById(R.id.point);
        b_equal = (Button) findViewById(R.id.equal);
        b_clear = (Button) findViewById(R.id.clear);
        //绑定监听事件
        btn[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText() == null) {
                    editText.setText("0");
                } else {

                    //前一次输入的是符号editText.getText().toString()
                    if (editText.getText().toString().equals("+") || editText.getText().toString().equals("-") || editText.getText().toString().equals("*") || editText.getText().toString().equals("/")) {
                        editText.setText("0");//放入按钮代表的数字
                    }else {
                        editText.setText(editText.getText().toString() + "0");//输入的数字
                    }
                }
                B=true;
            }
        });
        btn[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText.getText() == null) {
                    editText.setText("1");
                } else {
                    //前一次输入的是符号editText.getText().toString()
                    if (editText.getText().toString().equals("+") || editText.getText().toString().equals("-") || editText.getText().toString().equals("*") || editText.getText().toString().equals("/")) {
                        editText.setText("1");


                        //放入按钮代表的数字
                    }else{
                        editText.setText(editText.getText().toString() + "1");//输入的数字


                    }
                }
                B=true;
            }
        });
        btn[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText() == null) {
                    editText.setText("2");
                } else {

                    //前一次输入的是符号editText.getText().toString()
                    if (editText.getText().toString().equals("+") || editText.getText().toString().equals("-") || editText.getText().toString().equals("*") || editText.getText().toString().equals("/")) {
                        editText.setText("2");//放入按钮代表的数字
                    }else {
                    //前一次输入的是数字
                        editText.setText(editText.getText().toString() + "2");//输入的数字
                    }
                }
                B=true;
            }
        });
        btn[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText() == null) {
                    editText.setText("3");
                } else {
                //前一次输入的是符号editText.getText().toString()
                    if (editText.getText().toString().equals("+") || editText.getText().toString().equals("-") || editText.getText().toString().equals("*") || editText.getText().toString().equals("/")) {
                        editText.setText("3");//放入按钮代表的数字
                    }else{

                        editText.setText(editText.getText().toString() + "3");//输入的数字
                    }
                }
                B=true;
            }
        });
        btn[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText() == null) {
                    editText.setText("4");
                } else {

                    //前一次输入的是符号editText.getText().toString()
                    if (editText.getText().toString().equals("+") || editText.getText().toString().equals("-") || editText.getText().toString().equals("*") || editText.getText().toString().equals("/")) {
                        editText.setText("4");//放入按钮代表的数字
                    }else {
                    //前一次输入的是数字

                        editText.setText(editText.getText().toString() + "4");//输入的数字
                    }
                }
                B=true;
            }
        });
        btn[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText() == null) {
                    editText.setText("5");
                } else {

                    //前一次输入的是符号editText.getText().toString()
                    if (editText.getText().toString().equals("+") || editText.getText().toString().equals("-") || editText.getText().toString().equals("*") || editText.getText().toString().equals("/")) {
                        editText.setText("5");//放入按钮代表的数字
                    }else {
                    //前一次输入的是数字
                        editText.setText(editText.getText().toString() + "5");//输入的数字
                    }
                }
                B=true;
            }
        });
        btn[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText() == null) {
                    editText.setText("6");
                } else {

                    //前一次输入的是符号editText.getText().toString()
                    if (editText.getText().toString().equals("+") || editText.getText().toString().equals("-") || editText.getText().toString().equals("*") || editText.getText().toString().equals("/")) {
                        editText.setText("6");//放入按钮代表的数字
                    }else {
                    //前一次输入的是数字
                        editText.setText(editText.getText().toString() +"6");//输入的数字
                    }
                }
                B=true;
            }
        });
        btn[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText() == null) {
                    editText.setText("7");
                } else {

                    //前一次输入的是符号editText.getText().toString()
                    if (editText.getText().toString().equals("+") || editText.getText().toString().equals("-") || editText.getText().toString().equals("*") || editText.getText().toString().equals("/")) {
                        editText.setText("7");//放入按钮代表的数字
                    }else {
                    //前一次输入的是数字

                        editText.setText(editText.getText().toString() + "7");//输入的数字
                    }
                }
                B=true;
            }
        });
        btn[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText() == null) {
                    editText.setText("8");
                } else {

                    //前一次输入的是符号editText.getText().toString()
                    if (editText.getText().toString().equals("+") || editText.getText().toString().equals("-") || editText.getText().toString().equals("*") || editText.getText().toString().equals("/")) {
                        editText.setText("8");//放入按钮代表的数字
                    }else {
                    //前一次输入的是数字

                        editText.setText(editText.getText().toString() +"8");//输入的数字
                    }
                }
                B=true;
            }
        });
        btn[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText() == null) {
                    editText.setText("9");
                } else {

                    //前一次输入的是符号editText.getText().toString()
                    if (editText.getText().toString().equals("+") || editText.getText().toString().equals("-") || editText.getText().toString().equals("*") || editText.getText().toString().equals("/")) {
                        editText.setText("9");//放入按钮代表的数字
                    }else {
                    //前一次输入的是数字

                        editText.setText(editText.getText().toString() + "9");//输入的数字
                    }
                }
                B=true;
            }
        });
            //符号
            b_add.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (B) {

                        //下面三行是加入的
                        String D = editText.getText().toString();
                        index[m] = Double.parseDouble(D);
                        m++;
                        c = "+";
                        editText.setText(c);
                    }else {
                        editText.setText("please input number!");

                    }
                }
            });
            b_minus.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (B){
                    String D = editText.getText().toString();
                    index[m] = Double.parseDouble(D);
                    m++;
                    c = "-";
                    editText.setText(c);
                }else {
                        editText.setText("please input number!");
                    }
                }
            });
            b_divide.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (B){
                    String D = editText.getText().toString();
                    index[m] = Double.parseDouble(D);
                    m++;
                    c = "/";
                    editText.setText(c);
                }else {
                        editText.setText("please input number!");
                    }
                }
            });
            b_ride.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {if (B) {
                    String D = editText.getText().toString();
                    index[m] = Double.parseDouble(D);
                    m++;
                    c = "*";
                    editText.setText(c);
                }else {
                    editText.setText("please input number!");
                }
                }
            });
            b_point.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    editText.append(b_point.getText());
                    B=true;
                }
            });

            b_equal.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (B){
                    String D = editText.getText().toString();
                    index[m] = Double.parseDouble(D);
                    m++;
                        //判空
                        if(c==null){
                            sum=index[m-1];
                        }else {
                            if (c == "+") {
                                sum = index[m - 2] + index[m - 1];
                            } else if (c == "-") {
                                sum = index[m - 2] - index[m - 1];
                            } else if (c == "*") {
                                sum = index[m - 2] * index[m - 1];
                            } else if (c == "/") {
                                sum = index[m - 2] / index[m - 1];
                            }
                        }
                    Double inputsum = sum;
                    editText.setText(inputsum.toString());

                }else {
                        editText.setText("please input number!");
                    }
                }
            });
            b_clear.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    editText.setText(null);
                    sum = 0;
                    m = 0;
                    B=false;
                }
            });

        }


    }

