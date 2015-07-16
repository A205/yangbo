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
    int m = 0;//���ֵ�˳��
    Boolean B=false;
    double sum = 0;
    String c=null;//�����������

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
        //�󶨼����¼�
        btn[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText() == null) {
                    editText.setText("0");
                } else {

                    //ǰһ��������Ƿ���editText.getText().toString()
                    if (editText.getText().toString().equals("+") || editText.getText().toString().equals("-") || editText.getText().toString().equals("*") || editText.getText().toString().equals("/")) {
                        editText.setText("0");//���밴ť���������
                    }else {
                        editText.setText(editText.getText().toString() + "0");//���������
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
                    //ǰһ��������Ƿ���editText.getText().toString()
                    if (editText.getText().toString().equals("+") || editText.getText().toString().equals("-") || editText.getText().toString().equals("*") || editText.getText().toString().equals("/")) {
                        editText.setText("1");


                        //���밴ť���������
                    }else{
                        editText.setText(editText.getText().toString() + "1");//���������


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

                    //ǰһ��������Ƿ���editText.getText().toString()
                    if (editText.getText().toString().equals("+") || editText.getText().toString().equals("-") || editText.getText().toString().equals("*") || editText.getText().toString().equals("/")) {
                        editText.setText("2");//���밴ť���������
                    }else {
                    //ǰһ�������������
                        editText.setText(editText.getText().toString() + "2");//���������
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
                //ǰһ��������Ƿ���editText.getText().toString()
                    if (editText.getText().toString().equals("+") || editText.getText().toString().equals("-") || editText.getText().toString().equals("*") || editText.getText().toString().equals("/")) {
                        editText.setText("3");//���밴ť���������
                    }else{

                        editText.setText(editText.getText().toString() + "3");//���������
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

                    //ǰһ��������Ƿ���editText.getText().toString()
                    if (editText.getText().toString().equals("+") || editText.getText().toString().equals("-") || editText.getText().toString().equals("*") || editText.getText().toString().equals("/")) {
                        editText.setText("4");//���밴ť���������
                    }else {
                    //ǰһ�������������

                        editText.setText(editText.getText().toString() + "4");//���������
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

                    //ǰһ��������Ƿ���editText.getText().toString()
                    if (editText.getText().toString().equals("+") || editText.getText().toString().equals("-") || editText.getText().toString().equals("*") || editText.getText().toString().equals("/")) {
                        editText.setText("5");//���밴ť���������
                    }else {
                    //ǰһ�������������
                        editText.setText(editText.getText().toString() + "5");//���������
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

                    //ǰһ��������Ƿ���editText.getText().toString()
                    if (editText.getText().toString().equals("+") || editText.getText().toString().equals("-") || editText.getText().toString().equals("*") || editText.getText().toString().equals("/")) {
                        editText.setText("6");//���밴ť���������
                    }else {
                    //ǰһ�������������
                        editText.setText(editText.getText().toString() +"6");//���������
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

                    //ǰһ��������Ƿ���editText.getText().toString()
                    if (editText.getText().toString().equals("+") || editText.getText().toString().equals("-") || editText.getText().toString().equals("*") || editText.getText().toString().equals("/")) {
                        editText.setText("7");//���밴ť���������
                    }else {
                    //ǰһ�������������

                        editText.setText(editText.getText().toString() + "7");//���������
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

                    //ǰһ��������Ƿ���editText.getText().toString()
                    if (editText.getText().toString().equals("+") || editText.getText().toString().equals("-") || editText.getText().toString().equals("*") || editText.getText().toString().equals("/")) {
                        editText.setText("8");//���밴ť���������
                    }else {
                    //ǰһ�������������

                        editText.setText(editText.getText().toString() +"8");//���������
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

                    //ǰһ��������Ƿ���editText.getText().toString()
                    if (editText.getText().toString().equals("+") || editText.getText().toString().equals("-") || editText.getText().toString().equals("*") || editText.getText().toString().equals("/")) {
                        editText.setText("9");//���밴ť���������
                    }else {
                    //ǰһ�������������

                        editText.setText(editText.getText().toString() + "9");//���������
                    }
                }
                B=true;
            }
        });
            //����
            b_add.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (B) {

                        //���������Ǽ����
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
                        //�п�
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

