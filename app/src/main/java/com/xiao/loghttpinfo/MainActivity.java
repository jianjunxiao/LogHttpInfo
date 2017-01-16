package com.xiao.loghttpinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xiao.loghttpinfo.bean.Kuaidi;
import com.xiao.loghttpinfo.http.RetrofitManager;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        RetrofitManager.getInstance().getApiService()
                .query("a3d3a43fcc149b6ed8268b8fa41d27b7", "json", "遗落的世界")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Kuaidi>() {
                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                        LogUtil.e("请求失败", e);
                    }

                    @Override
                    public void onNext(Kuaidi kuaidi) {
                        LogUtil.d("请求成功");
                    }
                });
    }
}
