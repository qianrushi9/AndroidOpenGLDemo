/*
 *
 * FGLViewActivity.java
 * 
 * Created by Wuwang on 2016/9/30
 * Copyright © 2016年 深圳哎吖科技. All rights reserved.
 */
package edu.wuwang.opengl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;

/**
 * Description:
 */
public class FGLViewActivity extends Activity implements View.OnClickListener {

    private static final int REQ_CHOOSE=0x0101;

    private Button mChange;
    private FGLView mGLView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fglview);
        init();
    }

    private void init(){
        mChange= (Button) findViewById(R.id.mChange);
        mGLView= (FGLView) findViewById(R.id.mGLView);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.mChange:
                Intent intent=new Intent(this,ChooseActivity.class);
                startActivityForResult(intent,REQ_CHOOSE);
                break;
        }
    }

}