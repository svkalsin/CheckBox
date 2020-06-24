package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText inputInfo;
    private CheckBox bankCardChkBx;
    private CheckBox mobilePhoneChkBx;
    private CheckBox cashAddressChkBx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        inputInfo = findViewById(R.id.inputInfo);
        bankCardChkBx = findViewById(R.id.bankCardChkBx);
        mobilePhoneChkBx = findViewById(R.id.mobilePhoneChkBx);
        cashAddressChkBx = findViewById(R.id.cashAddressChkBx);
    }

    private void resetCheckBoxs(){
        bankCardChkBx.setChecked(false);
        mobilePhoneChkBx.setChecked(false);
        cashAddressChkBx.setChecked(false);
    }

    public void clickBankCardChkBx(View view){
        resetCheckBoxs();
        bankCardChkBx.setChecked(true);
        inputInfo.setInputType(InputType.TYPE_CLASS_NUMBER);
    }

    public void clickMobilePhoneChkBx(View view){
        resetCheckBoxs();
        mobilePhoneChkBx.setChecked(true);
        inputInfo.setInputType(InputType.TYPE_CLASS_PHONE);
    }

    public void clickCashAddressChkBx(View view){
        resetCheckBoxs();
        cashAddressChkBx.setChecked(true);
        inputInfo.setInputType(InputType.TYPE_CLASS_TEXT);
    }

    public void clickOk(View view){
        if (bankCardChkBx.isChecked()) {
            Toast.makeText(MainActivity.this, getString(R.string.bankCardChkBx), Toast.LENGTH_LONG).show();
        }
        if (mobilePhoneChkBx.isChecked()) {
            Toast.makeText(MainActivity.this, getString(R.string.mobilePhoneChkBx), Toast.LENGTH_LONG).show();
        }
        if (cashAddressChkBx.isChecked()) {
            Toast.makeText(MainActivity.this, getString(R.string.cashAddressChkBx), Toast.LENGTH_LONG).show();
        }
    }
}